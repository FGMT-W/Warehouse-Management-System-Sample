package com.yeqifu.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * InnoDB free: 9216 kB; (`deptid`) REFER `warehouse/sys_dept`(`id`) ON UPDATE CASC
 * </p>
 *
 * @author luoyi-
 * @since 2019-11-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
@ToString
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String loginname;

    private String pwd;

    private String address;

    private Integer sex;

    private String remark;

    private Integer deptid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hiredate;

    /**
     * 上级领导id
     */
    private Integer mgr;

    /**
     * 是否可用，0不可用，1可用
     */
    private Integer available;

    /**
     * 排序码
     */
    private Integer ordernum;

    /**
     * 用户类型[0超级管理员，1管理员，2普通用户]
     */
    private Integer type;

    /**
     * 用户头像地址
     */
    private String imgpath;

    /**
     * 盐
     */
    private String salt;

    /**
     * 领导名称
     */
    @TableField(exist = false)
    private String leadername;

    /**
     * 部门名称
     */
    @TableField(exist = false)
    private String deptname;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLoginname() {
        return loginname;
    }

    public String getPwd() {
        return pwd;
    }

    public String getAddress() {
        return address;
    }

    public String getRemark() {
        return remark;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public Integer getMgr() {
        return mgr;
    }

    public Integer getAvailable() {
        return available;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public Integer getType() {
        return type;
    }

    public String getImgpath() {
        return imgpath;
    }

    public String getSalt() {
        return salt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setLeadername(String leadername) {
        this.leadername = leadername;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
