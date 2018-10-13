package com.example.biim.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        final EditText height = findViewById(R.id.height_editText);
        final EditText weight = findViewById(R.id.weight_editText);
        Button calculate = findViewById(R.id.calculate_button);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float h = Integer.parseInt(height.getText().toString());
                float w = Integer.parseInt(weight.getText().toString());
                AlertDialog.Builder d = new AlertDialog.Builder(secondMainActivity.this);     //สร้างไดอาร้อก
                d.setTitle("sum"); //คำที่อยู่ข้างบนกล่อง
                float h1 ;
                h1 = w/((h/100)*(h/100));
                String print = "";
                if(h1<14.5){
                    print = "คุณผอมเกินไป";
                }
                if(h1<18){
                    print = "สมส่วนที่สุด";
                }
                if(h1<24){
                    print = "คุณอ้วนแล้วนะอีเวรร";
                }
                if(h1<30){
                    print = "คุณอ้วนมากๆแล้วนะอีเวรร";
                }
                d.setMessage(print);
                d.setPositiveButton("cancle", new DialogInterface.OnClickListener() {//ทางขวา
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                d.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                d.show();

            }
        });
    }
}
