package com.ega.bankapp.model;

public class CatalogItem {
    private String name;
    private String desc;
    private int transaction;

    public CatalogItem(String name, String desc, int transaction) {
        this.name = name;
        this.desc = desc;
        this.transaction = transaction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }
}
