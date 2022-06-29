package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String id;
    private Date biz_date;
    private String order_no;
    private int status;
    private String remark;
    private String creator;
    private long create_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBiz_date() {
        return biz_date;
    }

    public void setBiz_date(Date biz_date) {
        this.biz_date = biz_date;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }
}
