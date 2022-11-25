package com.project.simbabank.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.project.simbabank.Adapters.SubscriptionAdapter;
import com.project.simbabank.Model.SubscriptionModel;
import com.project.simbabank.R;

import java.util.ArrayList;

public class PaymentsActivity extends AppCompatActivity {
    RecyclerView payment;
    SubscriptionAdapter subscriptionAdapter;
    ArrayList<SubscriptionModel> subscriptionModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
        payment = findViewById(R.id.subscriptionsRV);
        subscriptionModels=new ArrayList<>();

        subscriptionModels.add(new SubscriptionModel(R.drawable.netflix,"Netflix"));
        subscriptionModels.add(new SubscriptionModel(R.drawable.dstv,"DSTV"));
        subscriptionModels.add(new SubscriptionModel(R.drawable.kplc,"KPLC"));
        subscriptionModels.add(new SubscriptionModel(R.drawable.nhif,"NHIF"));
        subscriptionModels.add(new SubscriptionModel(R.drawable.nssf,"NSSF"));
        subscriptionModels.add(new SubscriptionModel(R.drawable.railways,"Kenya Railways"));

        subscriptionAdapter = new SubscriptionAdapter(this, subscriptionModels, this);
        payment.setAdapter(subscriptionAdapter);
        payment.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
        payment.setHasFixedSize(true);
        payment.setNestedScrollingEnabled(false);
    }
}