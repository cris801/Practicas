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
        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText("Align.RIGHT",width/2,160,paint);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("Align.CENTER",width/2,120,paint);
        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("Align.LEFT",width/2,80,paint);

        paint.setTextSkewX(0.2f);
        canvas.drawText("skewX 0.2",20,210,paint);
        paint.setTextSkewX(-0.2f);
        canvas.drawText("skewX -0.2",width/2,210,paint);
        paint.setTextSkewX(0f);

        paint.setTextScaleX(2f);
        canvas.drawText("TextScaleX 2",10,250,paint);
        paint.setTextScaleX(-2f);
        canvas.drawText("TextScaleX -2",width,290,paint);
        paint.setTextSize(60);
        paint.setTextScaleX(0.5f);
        canvas.drawText("TextScaleX 0.5",width/2,360,paint);
        paint.setTextScaleX(1f);
        paint.setTextSize(30);

        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawText("Sans serief",20,330,paint);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("default bold",20,370,paint);
        paint.setTypeface(Typeface.MONOSPACE);
        canvas.drawText("monospace",20,410,paint);
        paint.setTypeface(Typeface.SERIF);
        canvas.drawText("serif",20,450,paint);
        paint.setTypeface(Typeface.DEFAULT);

        paint.setTextSize(50);
        paint.setAntiAlias(false);
        canvas.drawText("Antialias false",20,500,paint);
        paint.setAntiAlias(true);
        canvas.drawText("Antialias true",20,550,paint);
    }
}