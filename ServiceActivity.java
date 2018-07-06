package com.example.admin.vision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {

    Button gate, cat, gre, ias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        gate=(Button)findViewById(R.id.Gate);
        cat=(Button)findViewById(R.id.Cat);
        gre=(Button)findViewById(R.id.Gre);
        ias=(Button)findViewById(R.id.Ias);

        gate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ServiceActivity.this,GateActivity.class);
                startActivity(intent);
            }
        });



    }
}
