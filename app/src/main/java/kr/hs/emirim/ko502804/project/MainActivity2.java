package kr.hs.emirim.ko502804.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button main2_btn1 = findViewById(R.id.main2_btn1);
        main2_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        Button main2_btn2 = findViewById(R.id.main2_btn2);
        main2_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });

        Button main2_btn3 = findViewById(R.id.main2_btn3);
        main2_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(intent);
            }
        });

        Button main2_btn4 = findViewById(R.id.main2_btn4);
        main2_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(intent);
            }
        });

        Button main2_btn5 = findViewById(R.id.main2_btn5);
        main2_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity7.class);
                startActivity(intent);
            }
        });
    }
}