package coms.bean;

public class BisShopCustomKey {
    private String customUserId;

    private String shopId;

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

    @Override
    public String toString() {
        return "BisShopCustomKey{" +
                "customUserId='" + customUserId + '\'' +
                ", shopId='" + shopId + '\'' +
                '}';
    }
}