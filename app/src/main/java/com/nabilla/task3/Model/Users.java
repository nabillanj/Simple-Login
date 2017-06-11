package com.nabilla.task3.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Users {
    private List<User> users = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
