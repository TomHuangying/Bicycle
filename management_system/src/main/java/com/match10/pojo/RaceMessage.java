package com.match10.pojo;

import java.io.Serializable;

/**
 * @author ：zhangchao
 * @date ：Created in 2020/5/14
 * @description ：
 * @version: 1.0
 */
public class RaceMessage implements Serializable {

    private Integer id;//主键id
    private String theme;//比赛主题
    private Integer maxNumber;//人数上限
    private String type;//比赛类型
    private String site;//比赛地点
    private String startTime;//开始时间
    private String endTime;//报名截止时间
    private String telephone;//举办方电话
    private String email;//举办方邮箱
    private Integer registerNumber;//已报名人数
    private String route;//比赛路线


    public RaceMessage() {
    }

    @Override
    public String toString() {
        return "RaceMessage{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", maxNumber=" + maxNumber +
                ", type='" + type + '\'' +
                ", site='" + site + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", registerNumber=" + registerNumber +
                ", route='" + route + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(Integer registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public RaceMessage(Integer id, String theme, Integer maxNumber, String type, String site, String startTime, String endTime, String telephone, String email, Integer registerNumber, String route) {
        this.id = id;
        this.theme = theme;
        this.maxNumber = maxNumber;
        this.type = type;
        this.site = site;
        this.startTime = startTime;
        this.endTime = endTime;
        this.telephone = telephone;
        this.email = email;
        this.registerNumber = registerNumber;
        this.route = route;
    }
}
