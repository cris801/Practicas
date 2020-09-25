package com.example.practicas.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.practicas.Graficos.CanvasAltura;
import com.example.practicas.Graficos.CanvasCurvas;
import com.example.practicas.Graficos.CanvasDimensiones;
import com.example.practicas.Graficos.CanvasEventoActionMove;
import com.example.practicas.Graficos.CanvasEventoActionUp;
import com.example.practicas.Graficos.CanvasFormatoTexto;
import com.example.practicas.Graficos.CanvasGraficoInteractivo;
import com.example.practicas.Graficos.CanvasSiguiendoCurva;
import com.example.practicas.Graficos.CanvasTraslacionesRotaciones;
import com.example.practicas.Graficos.CanvasUno;
import com.example.practicas.R;

public class CanvasActivity extends AppCompatActivity {

    private Button btnCanvasUno;
    private Button btnCanvasFormatoTexto;
    private Button btnCanvasAltura;
    private Button btnCanvasDimension;
    private Button btnCanvasCurvas;
    private Button btnCanvasTrasRot;
    private Button btnCanvasSigTexto;
    private Button btnCanvasD;
    private Button btnCanvasU;
    private Button btnCanvasM;

    private Boolean estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        estado=false;

        btnCanvasUno = (Button) findViewById(R.id.buttonUno);
        btnCanvasFormatoTexto = (Button) findViewById(R.id.buttonFormatoTexto);
        btnCanvasAltura = (Button) findViewById(R.id.buttonAltura);
        btnCanvasDimension = (Button) findViewById(R.id.buttonDimensiones);
        btnCanvasCurvas = (Button) findViewById(R.id.buttonCurvas);
        btnCanvasTrasRot = (Button) findViewById(R.id.buttonTraslacionesR);
        btnCanvasSigTexto = (Button) findViewById(R.id.buttonSiguiendoC);
        btnCanvasD = (Button) findViewById(R.id.buttonActionD);
        btnCanvasU = (Button) findViewById(R.id.buttonActionU);
        btnCanvasM = (Button) findViewById(R.id.buttonActionM);

        //intancia donde el construcotor nos pide que estemos trabajando en esta actividad
        final CanvasUno canvasUno = new CanvasUno(this);
        final CanvasFormatoTexto canvasFormatoTexto = new CanvasFormatoTexto(this);
        final CanvasAltura canvasAltura = new CanvasAltura(this);
        final CanvasDimensiones canvasDimensiones = new CanvasDimensiones(this);
        final CanvasCurvas canvasCurvas = new CanvasCurvas(this);
        final CanvasTraslacionesRotaciones canvasTraslacionesRotaciones = new CanvasTraslacionesRotaciones(this);
        final CanvasSiguiendoCurva canvasSiguiendoCurva = new CanvasSiguiendoCurva(this);
        final CanvasGraficoInteractivo graficoInteractivo = new CanvasGraficoInteractivo(this);
        final CanvasEventoActionUp canvasEventoActionUp = new CanvasEventoActionUp(this);
        final CanvasEventoActionMove canvasEventoActionMove = new CanvasEventoActionMove(this);

        btnCanvasUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasUno);
                estado = true;
            }
        });
        btnCanvasFormatoTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasFormatoTexto);
                estado = true;
            }
        });
        btnCanvasAltura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasAltura);
                estado = true;
            }
        });
        btnCanvasDimension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasDimensiones);
                estado = true;
            }
        });
        btnCanvasCurvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasCurvas);
                estado = true;
            }
        });
        btnCanvasTrasRot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasTraslacionesRotaciones);
                estado = true;
            }
        });
        btnCanvasSigTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasSiguiendoCurva);
                estado = true;
            }
        });
        btnCanvasD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(graficoInteractivo);
                estado = true;
            }
        });
        btnCanvasU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasEventoActionUp);
                estado = true;
            }
        });
        btnCanvasM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(canvasEventoActionMove);
                estado = true;
            }
        });


        // para el boton de back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        //onBackPressed();
        if(estado){
            refrescar();
            estado = false;
        } else {
            home();
        }
        return true;
    }

    private void home() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void refrescar() {
        Intent intent = new Intent(this,CanvasActivity.class);
        startActivity(intent);
    }
}