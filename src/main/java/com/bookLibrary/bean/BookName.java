package com.bookLibrary.bean;

public class BookName {
    private Integer nId;

    private String nName;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getbName() {
        return nName;
    }

    public void setbName(String bName) {
        this.nName = bName == null ? null : bName.trim();
    }

    public BookName() {
    }

    public BookName(Integer nId, String nName) {
        this.nId = nId;
        this.nName = nName;
    }
}