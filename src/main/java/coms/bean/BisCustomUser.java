package coms.bean;

import java.util.Date;

public class BisCustomUser {
    private String customUserId;

    private String mobile;

    private String username;

    private String password;

    private String nikename;

    private String openid;

    private String unionid;

    private String wechat;

    private String photo;

    private String sex;

    private String phone;

    private String qq;

    private String email;

    private Date bornDate;

    private String idno;

    private String address;

    private String remark;

    private String enrollMode;

    private Date enrollTime;

    private String isDel;

    private String wechatStatus;

    private Integer beautyNum;

    private Integer bagNum;

    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId == null ? null : customUserId.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getEnrollMode() {
        return enrollMode;
    }

    public void setEnrollMode(String enrollMode) {
        this.enrollMode = enrollMode == null ? null : enrollMode.trim();
    }

    public Date getEnrollTime() {
        return enrollTime;
    }

    public void setEnrollTime(Date enrollTime) {
        this.enrollTime = enrollTime;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public String getWechatStatus() {
        return wechatStatus;
    }

    public void setWechatStatus(String wechatStatus) {
        this.wechatStatus = wechatStatus == null ? null : wechatStatus.trim();
    }

    public Integer getBeautyNum() {
        return beautyNum;
    }

    public void setBeautyNum(Integer beautyNum) {
        this.beautyNum = beautyNum;
    }

    public Integer getBagNum() {
        return bagNum;
    }

    public void setBagNum(Integer bagNum) {
        this.bagNum = bagNum;
    }

    @Override
    public String toString() {
        return "BisCustomUser{" +
                "customUserId='" + customUserId + '\'' +
                ", mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nikename='" + nikename + '\'' +
                ", openid='" + openid + '\'' +
                ", unionid='" + unionid + '\'' +
                ", wechat='" + wechat + '\'' +
                ", photo='" + photo + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +
                ", bornDate=" + bornDate +
                ", idno='" + idno + '\'' +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                ", enrollMode='" + enrollMode + '\'' +
                ", enrollTime=" + enrollTime +
                ", isDel='" + isDel + '\'' +
                ", wechatStatus='" + wechatStatus + '\'' +
                ", beautyNum=" + beautyNum +
                ", bagNum=" + bagNum +
                '}';
    }
}