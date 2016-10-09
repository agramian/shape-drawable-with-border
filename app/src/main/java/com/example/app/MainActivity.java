package com.example.app;

import android.graphics.Color;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View content = findViewById(R.id.content);
        ShapeDrawableWithBorder shapeDrawable = new ShapeDrawableWithBorder(new OvalShape());
        shapeDrawable.getPaint().setDither(true);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.setStrokeColor(Color.parseColor("red"));
        shapeDrawable.setStrokeWidth(20);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            content.setBackground(shapeDrawable);
        } else {
            content.setBackgroundDrawable(shapeDrawable);
        }
    }

}
