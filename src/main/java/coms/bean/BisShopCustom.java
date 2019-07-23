package coms.bean;

import java.util.Date;

public class BisShopCustom extends BisShopCustomKey {
    private Date recentTime;

    private Date createTime;

    public Date getRecentTime() {
        return recentTime;
    }

    public void setRecentTime(Date recentTime) {
        this.recentTime = recentTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BisShopCustom{" +
                "recentTime=" + recentTime +
                ", createTime=" + createTime +
                '}';
    }
}