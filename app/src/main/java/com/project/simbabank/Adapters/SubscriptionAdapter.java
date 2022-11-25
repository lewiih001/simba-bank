package com.project.simbabank.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.simbabank.Activity.MoneyActivity;
import com.project.simbabank.Activity.PaymentsActivity;
import com.project.simbabank.Model.SubscriptionModel;
import com.project.simbabank.R;

import java.util.ArrayList;

public class SubscriptionAdapter extends RecyclerView.Adapter<SubscriptionAdapter.ViewHolder> {
    Context context;
    ArrayList<SubscriptionModel>list;

    public SubscriptionAdapter(Context context, ArrayList<SubscriptionModel> list, PaymentsActivity paymentsActivity) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public SubscriptionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.subscriptions_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull SubscriptionAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.desc.setText(list.get(position).getDescription());
        holder.image.setImageResource(list.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MoneyActivity.class);
                intent.putExtra("image",list.get(position).getImage());
                intent.putExtra("desc",list.get(position).getDescription());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView desc;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            desc = itemView.findViewById(R.id.sub_title);
            image = itemView.findViewById(R.id.image_sub);
        }
    }
}
