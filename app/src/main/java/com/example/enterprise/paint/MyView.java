package com.example.enterprise.paint;

/**
 * Created by Enterprise on 5-9-2016.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

    Paint paint;
    Path path;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init(){
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(4);
        paint.setStyle(Paint.Style.STROKE);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
       // paint.setStrokeWidth(5);
        canvas.drawRect(30, 50, 200, 350, paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(100, 100, 300, 400, paint);
        paint.setColor(Color.RED);
        paint.setTextSize(70);
        canvas.drawText("The best is yet to come", 300, 180, paint);
        //drawRect(left, top, right, bottom, paint)
        canvas.drawCircle(500,400,160,paint);  // x middle point circle, y middle point circle, raduis straal



    }

}