package com.example.practicas.Activities;

import androidx.appcompat.app.AppCompatActivity;

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
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        // conectando los componentes visuales con la parte logica de la app
        ivBumeran = (ImageView) findViewById(R.id.imageViewBlue);

        //
        animation = AnimationUtils.loadAnimation(TweenActivity.this, R.anim.animation);

        // Asignando el setOnClickListener
        btnRun = (Button) findViewById(R.id.buttonAnimations);
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // iniciando la animación
                ivBumeran.startAnimation(animation);
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