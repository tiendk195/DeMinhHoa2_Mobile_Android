package com.example.deminhhoa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListView_HoaQua extends AppCompatActivity {
    ListView listViewFruits;
    ArrayList<String> fruits;
    ArrayAdapter<String> adapter;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_hoa_qua);
        listViewFruits = findViewById(R.id.listviewFruits);
        fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Litchi", "Mango"));
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fruits);
        listViewFruits.setAdapter(adapter);
        listViewFruits.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selected = fruits.get(i);
                fruits.remove(i);
                adapter.notifyDataSetChanged();
                Toast.makeText(ListView_HoaQua.this, "Đã Xóa: " + selected, Toast.LENGTH_SHORT).show();
            }
        });
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListView_HoaQua.this,JSON.class);
                startActivity(intent);
            }
        });
    }
}
