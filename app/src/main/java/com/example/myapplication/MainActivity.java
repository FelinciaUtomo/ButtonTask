package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11;
TextView T1;
private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=findViewById(R.id.button7);
        B2=findViewById(R.id.button8);
        B3=findViewById(R.id.button9);
        B4=findViewById(R.id.button4);
        B5=findViewById(R.id.button5);
        B6=findViewById(R.id.button6);
        B7=findViewById(R.id.button);
        B8=findViewById(R.id.button2);
        B9=findViewById(R.id.button3);
        B10=findViewById(R.id.button10);
        B11=findViewById(R.id.button11);
        B11.setVisibility(View.INVISIBLE);
        T1=findViewById(R.id.textView);
        B1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick (View view){
            update("1");
            }
        }
        );
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("2");
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("3");
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("4");
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("5");
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("6");
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("7");
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("8");
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("9");
            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update("0");
            }
        });
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {hapus();
            }
        });
    }
private void update(String AngkaBaru){
        String AngkaLama = T1.getText().toString();
        if (AngkaLama.length()<12){
            T1.setText(AngkaLama + AngkaBaru);
            i++;
        }else {
            Toast.makeText(this, "Limit Number", Toast.LENGTH_SHORT).show();
        }
}
private void hapus (){
        String Angka = T1.getText().toString();
        if (Angka.length()>0){
            String NewNumber = Angka.substring(0, Angka.length()-1);
            T1.setText(NewNumber);
            if (NewNumber.isEmpty()){
                B11.setVisibility(View.INVISIBLE);
            }
        }
}
}

