package com.example.finalpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    int Cost = 72;
    int res = 0;
    String choice;
    int number = 0;
    int selected = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent1 = getIntent();
        String title = intent1.getStringExtra("mainName");
        TextView titleView = findViewById(R.id.secondTitle);
        titleView.setText(title);


        EditText editAthletes = findViewById(R.id.editAthletes);
        Button btnSecond = findViewById(R.id.btnSecond);
        TextView result = findViewById(R.id.result);

        final Spinner group = (Spinner) findViewById(R.id.spinnerSecond);


        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = group.getSelectedItem().toString();
                selected = group.getSelectedItemPosition();

                number = Integer.parseInt(editAthletes.getText().toString());


                if(selected == 0){
                    Toast.makeText(SecondActivity.this, "first", Toast.LENGTH_SHORT).show();
                }
                else if(selected == 1){
                    Toast.makeText(SecondActivity.this, "sec", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(SecondActivity.this, "third", Toast.LENGTH_SHORT).show();

                }
                result.setText("SelectedChoice is : " + choice + " and total  cost is :  " +  (number * Cost));

            }
        });



    }
}