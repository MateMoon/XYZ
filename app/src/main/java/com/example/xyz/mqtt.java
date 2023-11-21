package com.example.xyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mqtt extends AppCompatActivity {

    String clienteID = "";

    static String MQTTHOST = "tcp://crudfirebase.cloud.shiftr.io.1883";

    static String MQTTUSER = "crudfirebase";
    static String MQTTPASS = "2gfytVF9EVMBWmf";

    static String TOPIC = "LED";
    static String TOPIC_MSG_ON= "encender";
    static String TOPIC_MSG_OFF= "apagar";


    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mqtt);

        btn2 = findViewById(R.id.btn_volver);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(mqtt.this, MainActivity.class);
                startActivity(volver);
            }
        });

    }
}