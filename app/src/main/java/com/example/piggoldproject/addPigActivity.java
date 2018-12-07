package com.example.piggoldproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class addPigActivity extends AppCompatActivity {

    Spinner spinner_type;
    String name[] = {"อาหาร","ที่พัก"};
    ArrayAdapter<String>arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pig);

        spinner_type = (Spinner)findViewById(R.id.type_dropdown);
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        spinner_type.setAdapter(arrayAdapter);

        //spinner_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

       //     }
      //  });
    }
}
