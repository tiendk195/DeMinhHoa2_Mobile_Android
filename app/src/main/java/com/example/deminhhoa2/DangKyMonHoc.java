package com.example.deminhhoa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class DangKyMonHoc extends AppCompatActivity {
    Button btnExit,btnNext,btnChoose;
    CheckBox ckb1,ckb2,ckb3;
    RadioButton rdo1,rdo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky_mon_hoc);
        btnExit=findViewById(R.id.btnExit);
        btnNext=findViewById(R.id.btnNext);
        btnChoose=findViewById(R.id.btnChoose);
        rdo1=findViewById(R.id.rdo1);
        rdo2=findViewById(R.id.rdo2);
        ckb1=findViewById(R.id.ckb1);
        ckb2=findViewById(R.id.ckb2);
        ckb3=findViewById(R.id.ckb3);
    btnExit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });
    btnChoose.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String s="";
            if(ckb1.isChecked())
            {
                s+="Trí Tuê Nhân Tạo\n";
            }
            if(ckb2.isChecked())
            {
                s+="Lập Trình Đa Nền Tảng\n";
            }
            if(ckb3.isChecked())
            {
                s+="An Toàn Thông Tin\n";
            }
            if(rdo1.isChecked())
            {
                s+="Giới Tính: Nam\n";
            }
            if(rdo2.isChecked())
            {
                s+="Giới Tính: Nữ\n";
            }
            if(s.isEmpty())
            {
                s+="Vui lòng lựa chọn thêm ";
            }
            Toast.makeText(DangKyMonHoc.this, "===Bạn Đã Lựa Chọn===\n"+s, Toast.LENGTH_SHORT).show();

        }
    });
    btnNext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(DangKyMonHoc.this,ListView_HoaQua.class);
            startActivity(intent);
        }
    });
    }
}