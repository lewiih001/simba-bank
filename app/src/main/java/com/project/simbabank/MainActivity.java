package com.project.simbabank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView trans;
    TransactionAdapter transactionAdapter;
    ArrayList<TransactionModel> transactionModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trans = findViewById(R.id.transaction_rv);
        transactionModels=new ArrayList<>();

        transactionModels.add(new TransactionModel("Test User ","KSH 20000","23/11/2022"));
        transactionModels.add(new TransactionModel("Test User ","KSH 20000","23/11/2022"));
        transactionModels.add(new TransactionModel("Test User ","KSH 20000","23/11/2022"));
        transactionModels.add(new TransactionModel("Test User ","KSH 20000","23/11/2022"));
        transactionModels.add(new TransactionModel("Test User ","KSH 20000","23/11/2022"));
        transactionModels.add(new TransactionModel("Test User ","KSH 20000","23/11/2022"));

        transactionAdapter = new TransactionAdapter(this, transactionModels, this);
        trans.setAdapter(transactionAdapter);
        trans.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
        trans.setHasFixedSize(true);
        trans.setNestedScrollingEnabled(false);

    }
}