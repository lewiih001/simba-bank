package com.project.simbabank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.simbabank.Adapters.TransactionAdapter;
import com.project.simbabank.Model.TransactionModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView trans;
    TransactionAdapter transactionAdapter;
    ArrayList<TransactionModel> transactionModels;
    CardView card1, card, card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = findViewById(R.id.c1);
        card = findViewById(R.id.c2);
        card3 = findViewById(R.id.c3);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PaymentsActivity.class));
            }
        });
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TransferActivity.class));
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PaymentsActivity.class));
            }
        });

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