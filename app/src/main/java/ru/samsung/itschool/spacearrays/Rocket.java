package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Rocket {

    Paint paint = new Paint();
    Bitmap image;
    float x, y, vx, vy;

    Rocket (float x, float y, Bitmap image) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.vx = (float)(Math.random() * 0.5 - 1);
        this.vy = (float)(Math.random() * 0.5 - 1);
    }
    
    void draw(Canvas canvas) {
        Matrix matrix = new Matrix();
        matrix.setScale(0.2f, 0.2f);
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(image, matrix, paint);
    }
    
    void move() {
        x += vx;
        y += vy;
        
    }
}
