package com.example.practicas.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.Scale;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.practicas.R;

public class TweenActivity extends AppCompatActivity {

    // declaración global de las variables a utilizar a lo largo del código
    private ImageView ivBumeran;
    private Button btnRun;
    private Button btnAlpha;
    private Button btnRotate;
    private Button btnScale;
    private Button btnTranslate;
    private Animation animation;
    private Animation animationAlpha;
    private Animation animationRotate;
    private Animation animationScale;
    private Animation animationTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        // conectando los componentes visuales con la parte logica de la app
        ivBumeran = (ImageView) findViewById(R.id.imageViewBlue);
        btnRun = (Button) findViewById(R.id.buttonAnimations);
        btnAlpha = (Button) findViewById(R.id.buttonAlpha);
        btnRotate = (Button) findViewById(R.id.buttonRotate);
        btnScale = (Button) findViewById(R.id.buttonScale);
        btnTranslate = (Button) findViewById(R.id.buttonTranslate);

        //conectamos el componente xml que contiene las intrucciones por medio de item's a los Animations
        animation = AnimationUtils.loadAnimation(TweenActivity.this, R.anim.animation);
        animationAlpha = AnimationUtils.loadAnimation(TweenActivity.this, R.anim.alpha);
        animationRotate = AnimationUtils.loadAnimation(TweenActivity.this, R.anim.rotate);
        animationScale = AnimationUtils.loadAnimation(TweenActivity.this, R.anim.scale);
        animationTranslate = AnimationUtils.loadAnimation(TweenActivity.this, R.anim.translate);


        // Asignando el setOnClickListener
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // iniciando la animación
                ivBumeran.startAnimation(animation);
            }
        });
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // iniciando la animación
                ivBumeran.startAnimation(animationAlpha);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // iniciando la animación
                ivBumeran.startAnimation(animationRotate);
            }
        });
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // iniciando la animación
                ivBumeran.startAnimation(animationScale);
            }
        });
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // iniciando la animación
                ivBumeran.startAnimation(animationTranslate);
            }
        });

        // para el boton de back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}