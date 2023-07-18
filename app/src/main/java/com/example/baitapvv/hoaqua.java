package com.example.baitapvv;

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

public class hoaqua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoaqua);
        ListView listView =findViewById(R.id.listview);
        ArrayList<String> dshoaqua = new ArrayList<>();
        dshoaqua.add("Táo");
        dshoaqua.add("Lê");
        dshoaqua.add("Mơ");
        dshoaqua.add("Mận");
        dshoaqua.add("Đào");
        ArrayAdapter adapter = new ArrayAdapter<>(hoaqua.this, android.R.layout.simple_list_item_1,dshoaqua);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(hoaqua.this, "Bạn đã chọn " + dshoaqua.get(i), Toast.LENGTH_SHORT).show();
            }
        });
        Button btnNext = findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hoaqua.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}