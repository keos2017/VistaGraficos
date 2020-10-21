package com.example.vistagraficosejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MiPropiaVista(this));
    }

    public class MiPropiaVista extends View {

        public MiPropiaVista(Context context){

            super(context);
        }

        protected void onDraw(Canvas canvas){

            Paint miPincel= new Paint();

            //miPincel.setColor(Color.BLUE);

            miPincel.setColor(Color.argb(185,168,155,255));

            miPincel.setStrokeWidth(8);

            miPincel.setStyle(Paint.Style.STROKE);

            canvas.drawCircle(500,500,300,miPincel);

            //Relleno
            int micolor;

            micolor= ContextCompat.getColor(getContext(), R.color.rellenoCirculo);

            miPincel.setColor(micolor);

            miPincel.setStyle(Paint.Style.FILL);

            canvas.drawCircle(500,500,300,miPincel);

        }
    }
}