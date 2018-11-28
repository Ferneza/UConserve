package com.example.nfern.uconserve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button feedbackBtn = (Button)findViewById(R.id.feedbackBtn);
        feedbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), Feedback.class);
                startActivity(startIntent);

            }
        });
    }
}
