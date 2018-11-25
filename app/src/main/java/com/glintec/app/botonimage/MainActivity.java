package com.glintec.app.botonimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnImg;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImg = findViewById(R.id.BtnImg);
        tv = findViewById(R.id.txtView);

        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Viendo Imagen");
            }
        };

        btnImg.setOnClickListener(cl);

    }
}
