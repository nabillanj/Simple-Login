package com.nabilla.task3.POJO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersPOJO {
    private List<UserPOJO> users = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<UserPOJO> getUsers() {
        return users;
    }

    public void setUsers(List<UserPOJO> users) {
        this.users = users;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
