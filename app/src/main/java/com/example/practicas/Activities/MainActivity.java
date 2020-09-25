package com.example.practicas.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.practicas.R;

public class MainActivity extends AppCompatActivity {

    private Button btnCanvas;
    private Button btnTween;
    private Button btnFotograma;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCanvas = (Button) findViewById(R.id.buttonUno);
        btnTween = (Button) findViewById(R.id.buttonFormatoTexto);
        btnFotograma = (Button) findViewById(R.id.buttonAltura);

        btnCanvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irCanvas();
            }
        });

        btnTween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irTween();
            }
        });

        btnFotograma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irFotograma();
            }
        });
    }

    private void irFotograma() {
        intent = new Intent(this,FotogramaActivity.class);
        startActivity(intent);
    }

    private void irTween() {
        intent = new Intent(this,TweenActivity.class);
        startActivity(intent);
    }

    private void irCanvas() {
        intent = new Intent(this,CanvasActivity.class);
        startActivity(intent);
    }


}