package com.example.relojtuneado180610;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.ElKirbo); // Obtén la referencia al TextView

        AlphaAnimation fadeAnimation = new AlphaAnimation(1.0f, 0.0f); // Crea la animación de fundido
        fadeAnimation.setDuration(1000); // Establece la duración de la animación en milisegundos
        fadeAnimation.setFillAfter(true); // Mantén la opacidad final después de la animación

        textView.startAnimation(fadeAnimation);
    }


}