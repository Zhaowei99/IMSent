package coms.bean;

import java.util.Date;

public class BisShopWork {
    private String workId;

    private String shopId;

    private String shopIp;

    private String workPassword;

    private String whetherSet;

    private String workSn;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getShopIp() {
        return shopIp;
    }

    public void setShopIp(String shopIp) {
        this.shopIp = shopIp == null ? null : shopIp.trim();
    }

    public String getWorkPassword() {
        return workPassword;
    }

    public void setWorkPassword(String workPassword) {
        this.workPassword = workPassword == null ? null : workPassword.trim();
    }

    public String getWhetherSet() {
        return whetherSet;
    }

    public void setWhetherSet(String whetherSet) {
        this.whetherSet = whetherSet == null ? null : whetherSet.trim();
    }

    public String getWorkSn() {
        return workSn;
    }

    public void setWorkSn(String workSn) {
        this.workSn = workSn == null ? null : workSn.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    @Override
    public String toString() {
        return "BisShopWork{" +
                "workId='" + workId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", shopIp='" + shopIp + '\'' +
                ", workPassword='" + workPassword + '\'' +
                ", whetherSet='" + whetherSet + '\'' +
                ", workSn='" + workSn + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                '}';
    }
}