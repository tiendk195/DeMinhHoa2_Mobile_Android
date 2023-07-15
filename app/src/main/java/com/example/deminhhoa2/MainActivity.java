package com.example.deminhhoa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUser,edtPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser=findViewById(R.id.edtUser);
        edtPass=findViewById(R.id.edtPass);
        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=edtUser.getText().toString();
                String pass=edtPass.getText().toString();
                if((user.equals("cntt"))&&(pass.equals("ituneti")))
                {
                    Intent intent=new Intent(MainActivity.this,DangKyMonHoc.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Ten Dang Nhap Hoac Mat Khau Khong Dung !",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}