package com.example.deminhhoa2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class JSON extends AppCompatActivity {
    Button btnCallData;
    TextView textData;
    ArrayList<User> usersList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        btnCallData=findViewById(R.id.btnCallData);
        textData=findViewById(R.id.textData);
        usersList=new ArrayList<>();
        usersList.add(new User(1,"Thu Hương Buoi","2500USD","Nam","Dân Thường"));
        usersList.add(new User(2,"Huong Ngu VCL","15000USD","Nữ","Dân Thường"));
        usersList.add(new User(3,"Thu Hương Buoi","2500USD","Nam","Dân Thường"));

        btnCallData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JSONArray jsonArray=new JSONArray();
                for(User user : usersList)
                {
                    JSONObject object=new JSONObject();
                    try {
                        object.put("id",user.getId());
                        object.put("ten",user.getTen());
                        object.put("luong",user.getLuong());
                        object.put("gioiTinh",user.getGioiTinh());
                        object.put("chucVu",user.getChucVu());
                        jsonArray.put(object);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                String s=jsonArray.toString();
                textData.setText(s);
            }
        });
    }
}