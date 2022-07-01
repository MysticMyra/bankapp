package com.ega.bankapp.model;

import java.util.List;

public class UserTransaction {
    private List<Transaction> userTransaction;

    public List<Transaction> getUserTransaction() {
        return userTransaction;
    }

    public void setUserTransaction(List<Transaction> userTransaction) {
        this.userTransaction = userTransaction;
    }


}
