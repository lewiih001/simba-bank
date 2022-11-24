package com.project.simbabank.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.simbabank.MainActivity;
import com.project.simbabank.R;
import com.project.simbabank.Model.TransactionModel;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {

    Context context;
    ArrayList<TransactionModel>list;

    public TransactionAdapter(Context context, ArrayList<TransactionModel> list, MainActivity mainActivity) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.ViewHolder holder, int position) {
        holder.amount.setText(list.get(position).getAmount());
        holder.date.setText(list.get(position).getDate());
        holder.title.setText(list.get(position).getTtitle());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView date, title, amount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date_text);
            title =itemView.findViewById(R.id.name_txt);
            amount = itemView.findViewById(R.id.amount_text);

        }
    }
}
