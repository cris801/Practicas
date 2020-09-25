package com.example.practicas.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.practicas.R;

public class FotogramaActivity extends AppCompatActivity {

    private Button btn1;
    private ImageView imageView;
    private AnimationDrawable animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotograma);

        porFotograma();


        // para el boton de back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void porFotograma() {

        btn1 = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);

        // en caso de un error nos mandara un mensaje con esta excepcion
        if (imageView == null) throw new AssertionError();
        // asignamos el xml animacion
        imageView.setBackgroundResource(R.drawable.animacion);
        // visible solo un misil sin animacion
        // invisible
        imageView.setVisibility(View.VISIBLE);

        // objeto para poder controlar la animacion
        // va tomar el fondo -
        animacion = (AnimationDrawable) imageView.getBackground();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!animacion.isRunning()){
                    animacion.start();
                    btn1.setText("STOP");
                } else {
                    animacion.stop();
                    btn1.setText("START");
                }
            }
        });
    }
}