package com.example.practicas.Graficos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CanvasAltura extends View {

    public CanvasAltura(Context context) {
        super(context);
    }

    //en este método se define la parte grafica
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // recuperamos el ancho de la pantalla y el largo por medio del método .getWidth y getHeight
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.drawColor(Color.WHITE);

        // creamos un pincel - creamos un objeto Paint
        Paint paintBlack = new Paint();
        Paint paintGray = new Paint();

        // ponemos un color al lienzo en este caso blanco
        paintBlack.setColor(Color.BLACK);
        paintGray.setColor(Color.GRAY);

        paintBlack.setTextSize(30);
        // colocamos un ciclo for encargado de pintar la altura a la que se encuentra
        // y un texto que va indicando su misma altura
        for (int i = 30 ; i < height ; i+=30){
            // pintamos el canvas con el método drawPaint y pasándole el pincel
            canvas.drawLine(0,i,width,i,paintGray);
            canvas.drawText(""+i,30,i,paintBlack);
        }

        // cambiamos el tamaño del texto
        paintBlack.setTextSize(40);
        paintBlack.setAntiAlias(true);
        canvas.drawText("height= "+height, 100,height/2,paintBlack);
    }
}
