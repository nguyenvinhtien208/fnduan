package com.example.fnduan.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.dao.NguoiDungDAO;

public class NguoiDungdetaiActivity extends AppCompatActivity {

    EditText edFullName, edPhone;
    NguoiDungDAO nguoiDungDAO;
    String username,fullname,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguoi_dungdetai);
        setTitle("CHI TIẾT NGƯỜI DÙNG");
        edFullName = (EditText) findViewById(R.id.edFullName);
        edPhone = (EditText) findViewById(R.id.edPhone);
        nguoiDungDAO = new NguoiDungDAO(this);
        Intent in = getIntent();
        Bundle b = in.getExtras();
        fullname = b.getString("FULLNAME");
        phone = b.getString("PHONE");
        username = b.getString("USERNAME");
        edFullName.setText(fullname);
        edPhone.setText(phone);
    }
    public void updateUser(View view){
        if
        (nguoiDungDAO.updateInfoNguoiDung(username,edPhone.getText().toString(),edFullName.getText().toString())>0){
            Toast.makeText(getApplicationContext(),"Lưu thành công", Toast.LENGTH_SHORT).show();
        }
    }
    public void Huy(View view){
        finish();
    }
}
