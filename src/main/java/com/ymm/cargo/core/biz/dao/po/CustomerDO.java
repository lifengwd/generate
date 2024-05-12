package com.ymm.cargo.core.biz.dao.po;

public class CustomerDO {
    /**
     *   主键
     */
    private String id;

    /**
     *   昵称
     */
    private String customerName;

    /**
     *   账号
     */
    private String account;

    /**
     *   密码
     */
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}