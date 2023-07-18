package com.example.baitapvv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;

import android.app.Activity;
import android.view.Window;

import android.app.Activity;
import android.view.Window;
public class MainActivity2 extends Activity {

    private ListView listViewEmployees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listViewEmployees = findViewById(R.id.listViewEmployees);
        String jsonString = "[{\"Ten\":\"Bưởi\",\"Luong\":2000},{\"Ten\":\"Cam\",\"Luong\":2500}]";

        try {
            JSONArray jsonArray = new JSONArray(jsonString);
            List<Cong_Nhan> dsCongnhan = new ArrayList<>();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String tencn = jsonObject.getString("Ten");
                float luong = jsonObject.getInt("Luong");
                Cong_Nhan congnhan = new Cong_Nhan(tencn, luong);
                dsCongnhan.add(congnhan);
            }
            ArrayAdapter<Cong_Nhan> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsCongnhan);
            listViewEmployees.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}