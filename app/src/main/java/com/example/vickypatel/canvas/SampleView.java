package com.example.vickypatel.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Vicky Patel on 2/23/2017.
 */

public class SampleView extends View {

    public SampleView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);

        int width = getWidth();
        int height = getHeight();
        int totalInRow = 5;
        int totalInColumn = 5;
        int circleWidth = width / totalInRow;
        int circleHeight = height / totalInColumn;
        int radius = circleWidth / 2;

        if (radius * totalInColumn * 2 < height) {
            System.out.println("width = " + width);
            System.out.println("height = " + height);
            System.out.println("circleWidth = " + circleWidth);
            System.out.println("circleHeight = " + circleHeight);



            for (int j = 0; j < totalInColumn; j++) {

                for (int i = 0; i < totalInRow; i++) {
                    System.out.println("start pixel= " + circleWidth * i);

                    if (i%2 == 0){
                        paint.setColor(Color.RED);
                    }else {
                        paint.setColor(Color.BLUE);
                    }

                    canvas.drawCircle(
                            (circleWidth / 2) * (2 * i + 1),
                            (circleHeight / 2) * (2 * j + 1),
                            radius,
                            paint);
                }

            }
        }

    }
}
