package coms.bean;

import java.util.Date;

public class BisShopLoginlog {
    private String logId;

    private String sessionId;

    private String username;

    private String account;

    private Date loginTime;

    private String userId;

    private String loginIp;

    private String explorer;

    private Date exitTime;

    private String exitType;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer == null ? null : explorer.trim();
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public String getExitType() {
        return exitType;
    }

    public void setExitType(String exitType) {
        this.exitType = exitType == null ? null : exitType.trim();
    }

    @Override
    public String toString() {
        return "BisShopLoginlog{" +
                "logId='" + logId + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", username='" + username + '\'' +
                ", account='" + account + '\'' +
                ", loginTime=" + loginTime +
                ", userId='" + userId + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", explorer='" + explorer + '\'' +
                ", exitTime=" + exitTime +
                ", exitType='" + exitType + '\'' +
                '}';
    }
}