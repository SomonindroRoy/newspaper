package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView zillaVittik, jatiyo, english, international, khela, chakri, sikkha, binodon,
            liveTv, liveRadio, islamicRadio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");

        zillaVittik=(ImageView)findViewById(R.id.zilaVittik);
        jatiyo=(ImageView)findViewById(R.id.jatiyo);
        english=(ImageView)findViewById(R.id.english);
        international=(ImageView)findViewById(R.id.international);
        khela=(ImageView)findViewById(R.id.khela);
        chakri=(ImageView)findViewById(R.id.chakri);
        sikkha=(ImageView)findViewById(R.id.sikkha);
        binodon=(ImageView)findViewById(R.id.binodon);
        liveTv=(ImageView)findViewById(R.id.liveTv);
        liveRadio=(ImageView)findViewById(R.id.liveRadio);
        islamicRadio=(ImageView)findViewById(R.id.islamic);

        zillaVittik.setOnClickListener(this);
        jatiyo.setOnClickListener(this);
        english.setOnClickListener(this);
        international.setOnClickListener(this);
        khela.setOnClickListener(this);
        chakri.setOnClickListener(this);
        sikkha.setOnClickListener(this);
        binodon.setOnClickListener(this);
        liveTv.setOnClickListener(this);
        liveRadio.setOnClickListener(this);
        islamicRadio.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.zilaVittik)
        {
            Intent intent=new Intent(MainActivity.this,zillavittik.class);
            startActivity(intent);

        }

    }
}
