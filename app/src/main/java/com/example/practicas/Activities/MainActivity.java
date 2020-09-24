package com.example.practicas.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.practicas.R;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2;
    private ImageView imageView;
    private AnimationDrawable animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        //intancia donde el construcotor nos pide que estemos trabajando en esta actividad
        CanvasEventoActionMove pantalla = new CanvasEventoActionMove(this);
        setContentView(pantalla);
        */
        //
        porFotograma();
    }

    public void porFotograma() {
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
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
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animacion.stop();
            }
        });
    }

}