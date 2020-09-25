package com.example.practicas.Graficos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class CanvasCurvas extends View {

    public CanvasCurvas(Context context) {
        super(context);
    }

    //en este método se define la parte grafica
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setAntiAlias(true);
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        // dibuja la forma geométrica especificada utilizando el dibujo especificado
        Path path = new Path();
        path.moveTo(0,0);
        for (int i = 1 ; i < width ; i++){
            path.lineTo(i,(float) Math.sin(i/20f)*(-50f));
        }
        path.offset(0,100);
        canvas.drawPath(path,paint);

        // manipulamos la percepción de la líneas por medio de intervalos que tienen diferentes valores
        // 10 valores en canvas 10 en espacios
        float [] intervalos = {10,10};
        DashPathEffect dashPathEffect = new DashPathEffect(intervalos,1);
        paint.setPathEffect(dashPathEffect);
        path.offset(0,100);
        canvas.drawPath(path,paint);

        float [] intervalos1 = {10,10,2,10};
        DashPathEffect dashPathEffect1 = new DashPathEffect(intervalos1,1);
        paint.setPathEffect(dashPathEffect1);
        path.offset(0,100);
        canvas.drawPath(path,paint);

        float [] intervalos2 = {2,4};
        DashPathEffect dashPathEffect2 = new DashPathEffect(intervalos2,1);
        paint.setPathEffect(dashPathEffect2);
        path.offset(0,100);
        canvas.drawPath(path,paint);
    }
}
