package com.example.practicas.Graficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class CanvasGraficoInteractivo extends View {
    // declaramos las variables para que puedan ser accedidas desde cualquier punto de la clase
    float x = 50;
    float y = 50;

    public CanvasGraficoInteractivo(Context context) {
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
        // Una vez reescritos los valores de las variables en el método onTouchEvent los imprimos en pantalla
        canvas.drawText("X = "+x,100,50,paint);
        canvas.drawText("Y = "+y,100,90,paint);
    }

    //metodo que se ejecuta cada vez que se toca la pantalla
    @Override
    public boolean onTouchEvent(MotionEvent evento) {
        if (evento.getAction()==MotionEvent.ACTION_DOWN){
            //obteniendo las coordenadas del evento en curso
            x = evento.getX();
            y = evento.getY();
            invalidate();
        }
        return true;
    }
}
