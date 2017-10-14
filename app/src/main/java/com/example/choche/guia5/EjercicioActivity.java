package com.example.choche.guia5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity {
    private Button btnIzq,btnCentro,btnDer;
    private ImageView imgIzq,imgCentro,imgDer;

    Animation bajar_aparecer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        btnIzq=(Button) findViewById(R.id.btnIzq);
        btnCentro=(Button) findViewById(R.id.btnCentro);
        btnDer=(Button) findViewById(R.id.btnDer);

        imgIzq=(ImageView)findViewById(R.id.imageView2);
        imgCentro=(ImageView)findViewById(R.id.imageView3);
        imgDer=(ImageView)findViewById(R.id.imageView4);

        bajar_aparecer= AnimationUtils.loadAnimation(this,R.anim.bajar_aparecer);

        btnIzq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgIzq.startAnimation(bajar_aparecer);
            }
        });

        btnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgCentro.startAnimation(bajar_aparecer);
            }
        });

        btnDer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgDer.startAnimation(bajar_aparecer);
            }
        });
    }
}
