package com.example.lessonon2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtW, edtH;
    TextView txtBMI, txtST;
    ImageView IMGbmi;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                double w = Double.parseDouble(edtW.getText().toString());
                double h = Double.parseDouble(edtH.getText().toString());
                double BMI = w / (h * h);
                String s = "";
                if(BMI < 15){
                    s = "Very severly underweight";
                    IMGbmi.setImageResource(R.drawable.pic1);
                }
                else if(BMI < 16){
                    s = "Severly underweight";
                    IMGbmi.setImageResource(R.drawable.pic1);
                }
                else{
                    s = "very severly obese";
                    IMGbmi.setImageResource(R.drawable.pic2);
                }
                DecimalFormat df = new DecimalFormat("#.0");
                double BMII = Double.parseDouble(df.format(BMI));
                txtBMI.setText(String.valueOf(BMII));
                txtST.setText(s);
            }
        });
    }

    private void initWidgets(){
        btn = (Button) findViewById(R.id.btn);
        txtBMI = (TextView) findViewById(R.id.txtIBM);
        txtST = (TextView) findViewById(R.id.txtST);
        edtW = (EditText) findViewById(R.id.edtW);
        edtH = (EditText) findViewById(R.id.edtH);
        IMGbmi= (ImageView) findViewById(R.id.IMGbmi);
    }
}