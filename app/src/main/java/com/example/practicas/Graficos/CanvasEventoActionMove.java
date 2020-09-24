package com.example.practicas.Graficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class CanvasEventoActionMove extends View {
    float x = 50;
    float y = 50;
    String texto="";
    public CanvasEventoActionMove(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.LTGRAY);

        //creamos un pinchel
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        //dibujamos un circulo
        canvas.drawCircle(x,y,20,paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(35);
        canvas.drawText("X = "+x,100,50,paint);
        canvas.drawText("Y = "+y,100,90,paint);

    }

    @Override
    public boolean onTouchEvent(MotionEvent evento) {
        x = evento.getX();
        y = evento.getY();

        if (evento.getAction() == MotionEvent.ACTION_DOWN){
            texto = "Action Down";
        }

        if (evento.getAction() == MotionEvent.ACTION_UP){
            texto = "Action Up";
        }
        if (evento.getAction() == MotionEvent.ACTION_MOVE){
            texto = "Action move";
        }
        invalidate();
        return true;
    }
}
