package com.example.administrator.bmi_mat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btChuandoan;
    EditText edTen, edChieucao, edCannang, edBMI, edChuandoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btChuandoan = (Button) findViewById(R.id.button);
        btChuandoan.setOnClickListener(this);
        edTen = (EditText) findViewById(R.id.editText);
        edChieucao = (EditText) findViewById(R.id.editText2);
        edCannang = (EditText) findViewById(R.id.editText3);
        edBMI = (EditText) findViewById(R.id.editText4);
        edChuandoan = (EditText) findViewById(R.id.editText5);

    }

    @Override
    public void onClick(View v) {
        double H = Double.parseDouble(edChieucao.getText()+" ");
        double W = Double.parseDouble(edCannang.getText()+" ");
        double BMI = W/Math.pow(H,2);
        String chuandoan = "";
        if(BMI < 18){
            chuandoan = "bạn gầy";
        } else if(BMI <=24.9){
            chuandoan = "bạn bình thường";
        } else if(BMI<=29.9){
            chuandoan = "bạn béo phì mức độ 1";
        } else if(BMI <=34.9){
            chuandoan = "bạn béo phì mức độ 2";
        } else {
            chuandoan = "bạn béo phì mức độ 3";
        }
        DecimalFormat dcf = new DecimalFormat("#.0");
        edBMI.setText(dcf.format(BMI));
        edChuandoan.setText(chuandoan);
    }
}
