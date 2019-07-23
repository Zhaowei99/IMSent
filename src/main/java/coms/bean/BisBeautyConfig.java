package coms.bean;

import java.util.Date;

public class BisBeautyConfig {
    private String configId;

    private Integer buyNum;

    private Integer giveNum;

    private String isDel;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    private String remark;

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId == null ? null : configId.trim();
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getGiveNum() {
        return giveNum;
    }

    public void setGiveNum(Integer giveNum) {
        this.giveNum = giveNum;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }


    @Override
    public String toString() {
        return "BisBeautyConfig{" +
                "configId='" + configId + '\'' +
                ", buyNum=" + buyNum +
                ", giveNum=" + giveNum +
                ", isDel='" + isDel + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}