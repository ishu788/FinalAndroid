package com.example.finalpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainName = findViewById(R.id.textView);
        ImageView mainImg = findViewById(R.id.mainPage);
        Button mainBtn = findViewById(R.id.mainPageBtn);


        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class );

                intent.putExtra("mainName", mainName.getText().toString());

                startActivity(intent);
            }
        });



    }
}