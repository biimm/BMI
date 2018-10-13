package com.example.biim.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__main);
        Button startbutton = findViewById(R.id.start_button);
        Button exitbutton = findViewById(R.id.exit_button);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText( Home_MainActivity.this,"continute"  , Toast.LENGTH_SHORT);
                Intent i = new Intent(Home_MainActivity.this , secondMainActivity.class);
                t1.show();
                startActivity(i);
            }
        });
        exitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
