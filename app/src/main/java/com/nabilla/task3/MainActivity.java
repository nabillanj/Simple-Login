package com.nabilla.task3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.nabilla.task3.POJO.UsersPOJO;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    final String BASE_URL = "http://www.mocky.io/";
    EditText editEmail, editPassword;
    Button button;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = (EditText) findViewById(R.id.edt_email);
        editPassword = (EditText) findViewById(R.id.edt_password);
        button = (Button) findViewById(R.id.buttonLogin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = editEmail.getText().toString();
                password = editPassword.getText().toString();

                if (email.isEmpty() || password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Failed to Login", Toast.LENGTH_SHORT).show();
                }else{
                    setLoginData(email, password);
                }
            }
        });

    }

    public void setLoginData(final String uname, final String pass){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<UsersPOJO> userPojo = apiInterface.getData();
        Log.d("TEST", String.valueOf(userPojo.request().url()));
        Call<UsersPOJO> test = apiInterface.getData();
        Log.d("TEST", String.valueOf(test.request().url()));
        test.enqueue(new Callback<UsersPOJO>() {
            @Override
            public void onResponse(Call<UsersPOJO> call, Response<UsersPOJO> response) {
                for (int i = 0; i<response.body().getUsers().size();i++){
                    email = response.body().getUsers().get(i).getEmail();
                    password  = response.body().getUsers().get(i).getPassword();

                    if (email.equals(uname) && password.equals(pass)){
                        SharedPreferences setSharedPreferences = getSharedPreferences("token", MODE_PRIVATE);
                        SharedPreferences.Editor editor = setSharedPreferences.edit();
                        editor.putString("token", email);
                        editor.apply();
                        startActivity(new Intent(MainActivity.this, DetailActivity.class));
                        break;
                    }else{
                        Toast.makeText(MainActivity.this, "Email or Password is incorrect", Toast.LENGTH_SHORT).show();
                        break;
                    }

                }
            }

            @Override
            public void onFailure(Call<UsersPOJO> call, Throwable t) {

            }
        });
    }
}
