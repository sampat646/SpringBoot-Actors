package com.jsp.springboot.actordb.utility;

public class ResponseStructure<T>{
    private int statuscode;
    private String meassage;
    private T data;

    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }

    public String getMeassage() {
        return meassage;
    }

    public void setMessage(String meassage) {
        this.meassage = meassage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
