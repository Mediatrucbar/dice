package com.dmarguerite.dice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button4 = (Button) findViewById(R.id.button4);
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                    intent.putExtra("max", 4);
                    startActivity(intent);
                }
            });
        }

        Button button6 = (Button) findViewById(R.id.button6);
        if (button6 != null) {
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                    intent.putExtra("max", 6);
                    startActivity(intent);
                }
            });
        }

        Button button8 = (Button) findViewById(R.id.button8);
        if (button8 != null) {
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                    intent.putExtra("max", 8);
                    startActivity(intent);
                }
            });
        }

        Button button10 = (Button) findViewById(R.id.button10);
        if (button10 != null) {
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                    intent.putExtra("max", 10);
                    startActivity(intent);
                }
            });
        }

        Button button12 = (Button) findViewById(R.id.button12);
        if (button12 != null) {
            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                    intent.putExtra("max", 12);
                    startActivity(intent);
                }
            });
        }

        Button button20 = (Button) findViewById(R.id.button20);
        if (button20 != null) {
            button20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                    intent.putExtra("max", 20);
                    startActivity(intent);
                }
            });
        }
    }
}
