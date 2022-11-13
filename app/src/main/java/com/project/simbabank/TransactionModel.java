package com.project.simbabank;

public class TransactionModel {

    String Ttitle;
    String Amount;
    String Date;

    public TransactionModel(String ttitle, String amount, String date) {
        Ttitle = ttitle;
        Amount = amount;
        Date = date;
    }

    public String getTtitle() {
        return Ttitle;
    }

    public void setTtitle(String ttitle) {
        Ttitle = ttitle;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
