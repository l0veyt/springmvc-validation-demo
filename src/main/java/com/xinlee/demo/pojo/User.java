package com.xinlee.demo.pojo;

import com.xinlee.demo.controller.validation.ValidGroup1;
import com.xinlee.demo.controller.validation.ValidGroup2;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by xin.lee on 2017/2/17.
 * 用户实体类
 */
public class User {

    @Size(min = 1, max = 10, message = "{user.username.length.error}", groups = {ValidGroup1.class})
    private String username;
    @NotNull(message = "{user.password.isNull}", groups = {ValidGroup2.class})
    private String password;
    @NotNull(message = "{user.birthday.isNull}")
    private String birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
