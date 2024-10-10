package com.everpower.traffic_system.info;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// 和数据库对应的
@Entity
@Table(name = "y_user")
public class UserInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long uid;
    @Column(name = "uname") //数据库表字段
    private String uname;
    @Column
    private String uaccount;
    @Column
    private String upassword;
    @Column
    private String uemail;
    @Column
    private String uphone;
    @Column
    private String t1;
    @Column
    private String desc;

    public long getUid() { return uid; }

    public void setUid(long uid) { this.uid = uid; }

    public String getUname() { return uname; }

    public void setUname(String uname) { this.uname = uname; }

    public String getUaccount() { return uaccount; }

    public void setUaccount(String uaccount) { this.uaccount = uaccount; }

    public String getUpassword() { return upassword; }

    public void setUpassword(String upassword) { this.upassword = upassword; }

    public String getUemail() { return uemail; }

    public void setUemail(String uemail) { this.uemail = uemail; }

    public String getUphone() { return uphone; }

    public void setUphone(String uphone) { this.uphone = uphone; }

    public String getT1() { return t1; }

    public void setT1(String t1) { this.t1 = t1; }

    public String getDesc() { return desc; }

    public void setDesc(String desc) { this.desc = desc; }
}
