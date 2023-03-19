package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Contact> contacts;
    private RecyclerView recyclerView;
    private ContactAdapter contactAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getContacts();
        recyclerView = findViewById(R.id.recyclerView);
        contactAdapter = new ContactAdapter(contacts);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(contactAdapter);
    }
    private  void getContacts() {
        Contact contact1 = new Contact("John Doe", "123456789");
        Contact contact2 = new Contact("Jane Doe", "987654321");
        Contact contact3 = new Contact("John Smith", "123456789");
        Contact contact4 = new Contact("Jane Smith", "987654321");
        Contact contact5 = new Contact("John Doe", "123456789");
        Contact contact6 = new Contact("Jane Doe", "987654321");
        Contact contact7 = new Contact("John Smith", "123456789");
        Contact contact8 = new Contact("Jane Smith", "987654321");
        Contact contact9 = new Contact("John Doe", "123456789");
        Contact contact10 = new Contact("Jane Doe", "987654321");
        Contact contact11 = new Contact("John Smith", "123456789");
        Contact contact12 = new Contact("Jane Smith", "987654321");
        Contact contact13 = new Contact("John Doe", "123456789");
        Contact contact14 = new Contact("Jane Doe", "987654321");
        Contact contact15 = new Contact("John Smith", "123456789");
        Contact contact16 = new Contact("Jane Smith", "987654321");
        contacts = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);
        contacts.add(contact7);
        contacts.add(contact8);
        contacts.add(contact9);
        contacts.add(contact10);
        contacts.add(contact11);
        contacts.add(contact12);
        contacts.add(contact13);
        contacts.add(contact14);
        contacts.add(contact15);
        contacts.add(contact16);
    }
}
