package com.example.practicas.Graficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;


public class CanvasSiguiendoCurva extends View {

    public CanvasSiguiendoCurva(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);
        //creamos un pinchel
        Paint paint = new Paint();
        paint.setTextSize(60);
        paint.setAntiAlias(true);
        int width = canvas.getWidth();

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        Path.Direction direction = Path.Direction.CCW;
        float radio = 200;
        path.addCircle(width/2,500,radio,direction);
        path.offset(0,0);
        float hOffset=0;
        float vOffset=-20;
        canvas.drawPath(path,paint);
        paint.setColor(Color.BLACK);
        canvas.drawTextOnPath("GRANDE TESCHA"+hOffset,path,hOffset,vOffset,paint);

        hOffset = 200;
        vOffset = 100;

        paint.setStyle(Paint.Style.FILL);
        //paint.setColor(Color.BLUE);
        //paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawTextOnPath("PODEROSO TESCHA",path,hOffset,vOffset,paint);

    }
}