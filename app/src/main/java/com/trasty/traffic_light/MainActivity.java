package com.trasty.traffic_light;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private boolean state = false;
    private Button buttonStart;
    private LinearLayout bulb_1, bulb_2, bulb_3;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bulb_1 = findViewById(R.id.bulb_1);
        bulb_2 = findViewById(R.id.bulb_2);
        bulb_3 = findViewById(R.id.bulb_3);
        buttonStart = findViewById(R.id.button_start);
    }

    public void onClickStart(View view){
        counter = -1;
        if (!state) {
            buttonStart.setText(R.string.stop);
            state = true;
            new Thread((Runnable) () -> {
                    while (state) {
                        counter = (counter + 1) % 3;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                switch (counter) {
                                    case 0:
                                        bulb_1.setBackgroundColor(getResources().getColor(R.color.green));
                                        bulb_2.setBackgroundColor(getResources().getColor(R.color.grey));
                                        bulb_3.setBackgroundColor(getResources().getColor(R.color.grey));
                                        break;
                                    case 1:
                                        bulb_1.setBackgroundColor(getResources().getColor(R.color.grey));
                                        bulb_2.setBackgroundColor(getResources().getColor(R.color.yellow));
                                        bulb_3.setBackgroundColor(getResources().getColor(R.color.grey));
                                        break;
                                    case 2:
                                        bulb_1.setBackgroundColor(getResources().getColor(R.color.grey));
                                        bulb_2.setBackgroundColor(getResources().getColor(R.color.grey));
                                        bulb_3.setBackgroundColor(getResources().getColor(R.color.red));
                                        break;
                                }
                            }
                        });
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            }).start();
        } else {
            buttonStart.setText(R.string.start);
            state = false;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        state = false;
    }
}