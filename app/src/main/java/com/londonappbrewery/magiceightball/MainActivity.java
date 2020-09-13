package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    
    private ImageView imageViewBall;
    private Button askButton;
    private int myNumber;
    private int[] myBall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBall = new int[] {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5,};
        myNumber = new Random().nextInt(5);
        imageViewBall = (ImageView) findViewById(R.id.imageViewBall);
        askButton = (Button) findViewById(R.id.askButton);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Ask Me", Toast.LENGTH_SHORT).show();
                imageViewBall.setImageResource(myBall[myNumber]);
                myNumber = new Random().nextInt(5);
            }
        });

    }
}
