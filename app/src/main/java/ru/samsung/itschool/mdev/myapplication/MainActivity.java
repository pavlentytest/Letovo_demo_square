package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText objectA, objectB, objectC;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solve(View vv) {
        objectA = findViewById(R.id.editA);
        objectB = findViewById(R.id.editB);
        objectC = findViewById(R.id.editC);

        result = findViewById(R.id.result);

        String str = objectA.getText().toString();
        double a = Double.parseDouble(str);
        double b = Double.parseDouble(objectB.getText().toString());
        double c = Double.parseDouble(objectC.getText().toString());

        double d = b * b - 4 * a * c;
        DecimalFormat df = new DecimalFormat("###.###");

        if(d == 0) {
            double x = (-b + Math.sqrt(d))/ 2 * a;
            result.setText("Один корень: " + df.format(x));
        } else if (d < 0) {
            result.setText("Нет решений!");
        } else if( d > 0) {
            double x1 = (-b + Math.sqrt(d))/ 2 * a;
            double x2 = (-b - Math.sqrt(d))/ 2 * a;
            result.setText("Два корня x1 = "+ df.format(x1) + "; x2 = " +  df.format(x2));
        }





    }


}