package com.example.ejercicio1labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private LinearLayout mLinearLayout;

    private EditText l1, l2;
    private Button l3;
    private TextView see;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = findViewById(R.id.ej1);

        l1 = findViewById(R.id.et_id);
        l2 = findViewById(R.id.et1_id);
        l3 = findViewById(R.id.button_send);
        see = findViewById(R.id.see);


        l3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                see.setText(l1.getText());
                return false;
            }
        });

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                see.setText(l2.getText());
            }
        });



    }


}
