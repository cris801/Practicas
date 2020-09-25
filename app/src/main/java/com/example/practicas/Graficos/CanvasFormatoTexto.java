package com.example.practicas.Graficos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

public class CanvasFormatoTexto extends View {

    public CanvasFormatoTexto(Context context) {
        super(context);
    }

    //en este método se define la parte grafica
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //creamos un pincel - creamos un objeto Paint
        Paint paint = new Paint();
        //ponemos un color al lienzo en este caso blanco
        paint.setColor(Color.rgb(226,226,226));
        // pintamos el canvas con el método drawPaint y pasándole el pincel
        canvas.drawPaint(paint);

        // recuperamos el ancho de la pantalla y el largo por medio del método .getWidth y getHeight
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        paint.setTextSize(30);
        paint.setAntiAlias(true);
        paint.setColor(Color.rgb(0,100,20));
        canvas.drawLine(width/2,0,width/2,height,paint);
        paint.setColor(Color.BLACK);
        // para alinear a la derecha de las coordenadas
        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText("Align.RIGHT",width/2,160,paint);
        // para alinear al centro de las coordenadas
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("Align.CENTER",width/2,120,paint);
        // para alinear a la izquierda de las coordenadas
        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("Align.LEFT",width/2,80,paint);

        // manipular la inclinación
        // hacia la izquierda
        paint.setTextSkewX(0.6f);
        canvas.drawText("skewX 0.6",20,210,paint);
        // hacia la derecha
        paint.setTextSkewX(-0.2f);
        canvas.drawText("skewX -0.2",width/2,210,paint);
        // limpiamos el formato para que los demás no sean afectados
        paint.setTextSkewX(0f);

        // manipular la escala de cada elemento
        paint.setTextScaleX(3f);
        canvas.drawText("TextScaleX 3",10,250,paint);
        paint.setTextScaleX(-2f);
        canvas.drawText("TextScaleX -2",width,290,paint);

        paint.setTextSize(60);
        // toma este valor
        paint.setTextScaleX(0.5f);
        canvas.drawText("TextScaleX 0.5",width/2,360,paint);
        paint.setTextScaleX(1f);
        paint.setTextSize(30);

        // manipulando el tipo de funte
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawText("Sans serief",20,330,paint);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("default bold",20,370,paint);
        paint.setTypeface(Typeface.MONOSPACE);
        canvas.drawText("monospace",20,410,paint);
        paint.setTypeface(Typeface.SERIF);
        canvas.drawText("serif",20,450,paint);
        paint.setTypeface(Typeface.DEFAULT);

        //vemos la diferencia entre Antialias con estado True o False
        paint.setTextSize(50);
        paint.setAntiAlias(false);
        canvas.drawText("Antialias false",20,500,paint);
        paint.setAntiAlias(true);
        canvas.drawText("Antialias true",20,550,paint);
    }
}