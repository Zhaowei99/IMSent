package coms.bean;

import java.util.Date;

public class BisOrderPay {
    private String payId;

    private String orderId;

    private String buyAccount;

    private String payCode;

    private String payWay;

    private Date createTime;

    private Date payTime;

    private Double payMoney;

    private String payStatus;

    private String payBack;

    private String payType;

    private String errorMessage;

    private Date nodifyTime;

    private String transactionId;

    private String outTransactionId;

    private String refundId;

    private String authCode;

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getBuyAccount() {
        return buyAccount;
    }

    public void setBuyAccount(String buyAccount) {
        this.buyAccount = buyAccount == null ? null : buyAccount.trim();
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getPayBack() {
        return payBack;
    }

    public void setPayBack(String payBack) {
        this.payBack = payBack == null ? null : payBack.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public Date getNodifyTime() {
        return nodifyTime;
    }

    public void setNodifyTime(Date nodifyTime) {
        this.nodifyTime = nodifyTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public String getOutTransactionId() {
        return outTransactionId;
    }

    public void setOutTransactionId(String outTransactionId) {
        this.outTransactionId = outTransactionId == null ? null : outTransactionId.trim();
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    @Override
    public String toString() {
        return "BisOrderPay{" +
                "payId='" + payId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", buyAccount='" + buyAccount + '\'' +
                ", payCode='" + payCode + '\'' +
                ", payWay='" + payWay + '\'' +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", payMoney=" + payMoney +
                ", payStatus='" + payStatus + '\'' +
                ", payBack='" + payBack + '\'' +
                ", payType='" + payType + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", nodifyTime=" + nodifyTime +
                ", transactionId='" + transactionId + '\'' +
                ", outTransactionId='" + outTransactionId + '\'' +
                ", refundId='" + refundId + '\'' +
                ", authCode='" + authCode + '\'' +
                '}';
    }
}