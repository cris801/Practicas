package com.example.practicas.Graficos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class CanvasTraslacionesRotaciones extends View {

    public CanvasTraslacionesRotaciones(Context context) {
        super(context);
    }

    //en este método se define la parte grafica
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setTextSize(60);
        paint.setAntiAlias(true);
        // traslada el origen de canvas
        int x = 50;
        int y = 60;
        canvas.translate(x,y);

        // rectangulo bounding-box de un texto
        String texto="Rotacion del canvas";
        Rect bounds = new Rect();
        paint.getTextBounds(texto,0,texto.length(),bounds);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(bounds,paint);
        canvas.save();

        // centro del rextangulo
        float centerX = bounds.exactCenterX();
        float centerY = bounds.exactCenterY();

        // rotación canvas
        canvas.rotate(-45,centerX,centerY);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(texto,0,0,paint);

        // restablece canvas
        canvas.restore();
        canvas.drawText("Tras la rotacion restore",100,300,paint);
    }
}
