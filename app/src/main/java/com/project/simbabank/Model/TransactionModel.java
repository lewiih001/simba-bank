package com.project.simbabank.Model;

public class TransactionModel {

    String Title;
    String Amount;
    String Date;

    public TransactionModel() {
    }

    public TransactionModel(String title, String amount, String date) {
        Title = title;
        Amount = amount;
        Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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
