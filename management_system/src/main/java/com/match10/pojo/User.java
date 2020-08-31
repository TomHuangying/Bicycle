package com.match10.pojo;

import java.io.Serializable;

/**
 * @author ：zhangchao
 * @description ：用户表
 * @version: 1.0
 */
public class User implements Serializable {

    private Integer id;//主键
    private String username;//用户名
    private String password;//密码
    private String sex;//性别
    private Integer age;//年龄
    private String telephone;//电话

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public User(Integer id, String username, String password, String sex, Integer age, String telephone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.telephone = telephone;
    }
}
