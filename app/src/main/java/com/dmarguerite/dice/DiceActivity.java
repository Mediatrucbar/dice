package com.dmarguerite.dice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.security.SecureRandom;

/**
 * Created by damien on 01/06/16.
 */
public class DiceActivity extends Activity implements View.OnClickListener {
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText("6 sided dice");

        textResult = ((TextView) findViewById(R.id.textResult));
        textResult.setText("");

        Button buttonRoll = (Button) findViewById(R.id.buttonRoll);
        buttonRoll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(6) + 1;
        textResult.setText(String.valueOf(result));
    }
}
