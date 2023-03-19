package com.example.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {
    List<Contact> ContactList;

    public ContactAdapter(List<Contact> contactList) {
        this.ContactList = contactList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Contact contactData = ContactList.get(position);
        holder.name.setText(contactData.getName());
        holder.phone.setText(contactData.getPhone());
    }

    @Override
    public int getItemCount() {
        return ContactList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView phone;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.textView3);
            phone = view.findViewById(R.id.textView4);
        }
    }
}