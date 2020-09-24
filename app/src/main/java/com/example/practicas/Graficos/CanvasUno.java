package com.example.practicas.Graficos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CanvasUno extends View{

    public CanvasUno(Context context) {
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
        // sobrescribimos el método .setColor y damos un nuevo color al pincel
        paint.setColor(Color.BLACK);
        // cambiamos el tamaño del texto con el método .setTextSize
        paint.setTextSize(40);
        paint.setAntiAlias(true);
        // con el meodo drawText imprimimos texto en pantalla
        // para esto le pasamos 4 parámetros: el texto, coordenada X, coordenada Y y el objeto paint
        canvas.drawText("ancho" +width+ "  alto" +height,20,40,paint);

        // sobrescribimos el método .setcolor para darle una nueva tonalidad pero por rgb
        paint.setColor(Color.rgb(100,20,0));
        // colocamos una línea
        // pasándole dos coordenadas "X" y "Y" para el punto de inicio y otras dos para el punto de conclusión
        canvas.drawLine(0,40,width,40,paint);

        // cambiamos el grosor del pincel con el método setStrokeWidth
        paint.setStrokeWidth(10);
        paint.setColor(Color.rgb(0,100,20));
        canvas.drawLine(20,0,20,height,paint);
    }
}
