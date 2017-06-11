package com.nabilla.task3.Model;


import java.util.HashMap;
import java.util.Map;

public class User {
    private Integer id;
    private String email;
    private String password;
    private String tokenAuthentication;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getTokenAuthentication() {
        return tokenAuthentication;
    }

    public void setTokenAuthentication(String tokenAuthentication) {
        this.tokenAuthentication = tokenAuthentication;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
