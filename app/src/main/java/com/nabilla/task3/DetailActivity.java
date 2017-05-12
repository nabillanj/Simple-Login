package com.nabilla.task3;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = (TextView) findViewById(R.id.tv_username);
        SharedPreferences setSharedPreferences = getSharedPreferences("token", MODE_PRIVATE);
        textView.setText(setSharedPreferences.getString("token", ""));
    }

    public void logout(View view) {
        finish();
    }
}
