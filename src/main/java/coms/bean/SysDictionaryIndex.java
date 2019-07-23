package coms.bean;

import java.util.Date;

public class SysDictionaryIndex {
    private String dicIndexId;

    private String dicKey;

    private String dicName;

    private String catalogId;

    private String catalogCascadeId;

    private String dicRemark;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    public String getDicIndexId() {
        return dicIndexId;
    }

    public void setDicIndexId(String dicIndexId) {
        this.dicIndexId = dicIndexId == null ? null : dicIndexId.trim();
    }

    public String getDicKey() {
        return dicKey;
    }

    public void setDicKey(String dicKey) {
        this.dicKey = dicKey == null ? null : dicKey.trim();
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName == null ? null : dicName.trim();
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId == null ? null : catalogId.trim();
    }

    public String getCatalogCascadeId() {
        return catalogCascadeId;
    }

    public void setCatalogCascadeId(String catalogCascadeId) {
        this.catalogCascadeId = catalogCascadeId == null ? null : catalogCascadeId.trim();
    }

    public String getDicRemark() {
        return dicRemark;
    }

    public void setDicRemark(String dicRemark) {
        this.dicRemark = dicRemark == null ? null : dicRemark.trim();
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
        return "SysDictionaryIndex{" +
                "dicIndexId='" + dicIndexId + '\'' +
                ", dicKey='" + dicKey + '\'' +
                ", dicName='" + dicName + '\'' +
                ", catalogId='" + catalogId + '\'' +
                ", catalogCascadeId='" + catalogCascadeId + '\'' +
                ", dicRemark='" + dicRemark + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                '}';
    }
}