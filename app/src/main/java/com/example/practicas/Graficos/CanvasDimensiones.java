package com.example.practicas.Graficos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class CanvasDimensiones extends View {

    public CanvasDimensiones(Context context) {
        super(context);
    }

    //en este método se define la parte grafica
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        //creamos un pincel - creamos un objeto Paint
        Paint paint = new Paint();
        //ponemos un color al lienzo en este caso blanco
        paint.setColor(Color.BLACK);
        paint.setTextSize(30);
        paint.setAntiAlias(true);

        // recuperamos los valores de la pantalla
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        int bottom = getBottom();
        int right = getRight();
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("Width "+width, width/2, 40, paint);
        canvas.drawText("Height "+height, width/2, 80, paint);
        canvas.drawText("Right "+right, width/2, 120, paint);
        canvas.drawText("Bottom "+bottom, width/2, 160, paint);

        // damos un color al pincel
        paint.setColor(Color.BLUE);

        // pintamos una linea del punto de origen al punto maximo de la pantalla
        canvas.drawLine(0,0,right,bottom,paint);
        // pintamos otra linea a la inversa de la anterior
        canvas.drawLine(right,0,0,bottom,paint);
    }
}