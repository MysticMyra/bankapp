package com.ega.bankapp.model;

public class Transaction {
    private String userId;
    private int rating;

    public Transaction() {
    }

    public Transaction(String userId, int rating) {
        this.userId = userId;
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
