package com.match10.pojo;

import java.io.Serializable;

/**
 * @author ：zhangchao
 * @date ：Created in 2020/5/14
 * @description ：比赛表
 * @version: 1.0
 */
public class Race implements Serializable {

    private Integer id;//主键id
    private String name;//比赛主题
    private String site;//比赛地点
    private String route;//比赛路线
    private Integer maxNumber;//报名人数上限
    private Integer registerNumber;//已报名人数
    private String type;//比赛类型
    private String startTime;//开始时间
    private String endTime;//报名截止时间
    private String telephone;//举办方电话
    private String email;//举办方邮箱
    private String sponsor;//举办单位
    private String assistant;//协办单位
    private String support;//赞助单位
    private String guidance;//指导单位

    public Race() {
    }

    @Override
    public String toString() {
        return "Race{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", route='" + route + '\'' +
                ", maxNumber=" + maxNumber +
                ", registerNumber=" + registerNumber +
                ", type='" + type + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", sponsor='" + sponsor + '\'' +
                ", assistant='" + assistant + '\'' +
                ", support='" + support + '\'' +
                ", guidance='" + guidance + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public Integer getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(Integer registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getGuidance() {
        return guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public Race(Integer id, String name, String site, String route, Integer maxNumber, Integer registerNumber, String type, String startTime, String endTime, String telephone, String email, String sponsor, String assistant, String support, String guidance) {
        this.id = id;
        this.name = name;
        this.site = site;
        this.route = route;
        this.maxNumber = maxNumber;
        this.registerNumber = registerNumber;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.telephone = telephone;
        this.email = email;
        this.sponsor = sponsor;
        this.assistant = assistant;
        this.support = support;
        this.guidance = guidance;
    }
}
