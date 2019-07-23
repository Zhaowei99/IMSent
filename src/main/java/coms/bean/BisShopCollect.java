package coms.bean;

import java.util.Date;

public class BisShopCollect {
    private String collectId;

    private String customUserId;

    private String shopId;

    private Date createTime;

    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId == null ? null : collectId.trim();
    }

    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId == null ? null : customUserId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BisShopCollect{" +
                "collectId='" + collectId + '\'' +
                ", customUserId='" + customUserId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}