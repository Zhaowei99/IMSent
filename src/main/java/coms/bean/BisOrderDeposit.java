package coms.bean;

import java.util.Date;

public class BisOrderDeposit {
    private String depositId;

    private String orderId;

    private String payAccount;

    private Double depositMoney;

    private String payWay;

    private Date payTime;

    private String depositStatus;

    private Date backTime;

    private String customUserId;

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId == null ? null : depositId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }

    public Double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(String depositStatus) {
        this.depositStatus = depositStatus == null ? null : depositStatus.trim();
    }

    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId == null ? null : customUserId.trim();
    }

    @Override
    public String toString() {
        return "BisOrderDeposit{" +
                "depositId='" + depositId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", payAccount='" + payAccount + '\'' +
                ", depositMoney=" + depositMoney +
                ", payWay='" + payWay + '\'' +
                ", payTime=" + payTime +
                ", depositStatus='" + depositStatus + '\'' +
                ", backTime=" + backTime +
                ", customUserId='" + customUserId + '\'' +
                '}';
    }
}