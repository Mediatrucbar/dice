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
