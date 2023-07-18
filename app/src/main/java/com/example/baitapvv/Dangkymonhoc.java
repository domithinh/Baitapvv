package com.example.baitapvv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Dangkymonhoc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangkymonhoc);
        CheckBox cbjava = findViewById(R.id.cbjava);
        CheckBox cbcsharp = findViewById(R.id.cbcsharp);
        CheckBox cbandroid = findViewById(R.id.cbandroid);
        RadioButton gtnam = findViewById(R.id.gtnam);
        RadioButton gtnu = findViewById(R.id.gtnu);
        Button btnchoose = findViewById(R.id.btnchoose);
        Button btnexit = findViewById(R.id.btnexit);
        Button btnnext = findViewById(R.id.btnnext);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });
        btnchoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mess = "Hello bạn đã chọn các môn ";
                int check = 0;
                if(cbjava.isChecked())
                {
                    mess += " " +cbjava.getText().toString();
                    check = 1;
                }
                if(cbcsharp.isChecked())
                {
                    mess += " " + cbcsharp.getText().toString();
                    check = 1;
                }
                if(cbandroid.isChecked())
                {
                    mess += " " + cbandroid.getText().toString();
                    check = 1;
                }
                if(gtnam.isChecked())
                {
                    mess += " bạn là " + gtnam.getText().toString();
                    check = 1;
                }
                if(gtnu.isChecked())
                {
                    mess += " bạn là " + gtnu.getText().toString();
                    check = 1;
                }
                if(check == 0)
                {
                    Toast.makeText(Dangkymonhoc.this, "Bạn chưa chọn gì cả!!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Dangkymonhoc.this, mess, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dangkymonhoc.this, hoaqua.class);
                startActivity(intent);
            }
        });
    }
}