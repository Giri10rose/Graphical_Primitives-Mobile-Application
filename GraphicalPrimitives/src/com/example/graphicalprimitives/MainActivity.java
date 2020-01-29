package com.example.graphicalprimitives;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(new GraphPrim(this));
}
class GraphPrim extends View
{
public GraphPrim(Context context)
{
super(context);
}
Paint paint=new Paint();
@Override
protected void onDraw(Canvas canvas) {
canvas.drawColor(Color.BLACK);
paint.setColor(Color.BLUE);
paint.setStrokeWidth(6);
canvas.drawCircle(100, 100, 50, paint);
paint.setStyle(Paint.Style.STROKE);
canvas.drawCircle(250, 250, 50, paint);
canvas.drawRect(150,400,300,500, paint);
paint.setColor(Color.RED);
canvas.drawRect(450,50,400,350, paint);
paint.setColor(Color.YELLOW);
canvas.drawLine(520, 850, 520, 1150, paint);
canvas.drawLine(250, 600, 350, 600, paint);
}
}
}
