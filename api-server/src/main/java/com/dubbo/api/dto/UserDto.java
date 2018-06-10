package com.dubbo.api.dto;

import java.io.Serializable;

/**
 * @author sam199510 273045049@qq.com
 * @version Created Time:2018/3/30 20:09:31
 */
public class UserDto implements Serializable {

    private String username;

    private Integer userage;

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
