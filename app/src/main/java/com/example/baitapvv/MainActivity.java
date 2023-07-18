package com.example.baitapvv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button exit = findViewById(R.id.btn_exit);
        Button login = findViewById(R.id.btn_login);
        EditText account = findViewById(R.id.txt_account);
        EditText password = findViewById(R.id.txt_password);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ID = account.getText().toString();
                String Password = password.getText().toString();
                if(ID.equals("1") && Password.equals("1"))
                {
                    Intent intent = new Intent(MainActivity.this, Dangkymonhoc.class);
                    startActivity(intent);
                    account.setText("");
                    password.setText("");
                }
                else if(ID.isEmpty() && Password.isEmpty())
                {
                    Toast.makeText(getApplication(), "Bạn chưa điền đầy đủ thông tin đăng nhập!", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(getApplication(), "Sai thông tin đăng nhập!", Toast.LENGTH_SHORT).show();
                    account.setText("");
                    password.setText("");
                }
            }
        });
    }
}