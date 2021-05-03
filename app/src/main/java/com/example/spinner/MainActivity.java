package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spin;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin = (Spinner) findViewById(R.id.spinner);
        textview = (TextView) findViewById(R.id.textView);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.days, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        
        spin.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        textview.setText("Monday");
                        break;
                    case 1:
                        textview.setText("Tuesday");
                        break;
                    case 2:
                        textview.setText("Wednesday");
                        break;
                    case 3:
                        textview.setText("Thursday");
                        break;
                    case 4:
                        textview.setText("Friday");
                        break;
                    case 5:
                        textview.setText("Saturday");
                        break;
                    case 6:
                        textview.setText("Sunday");
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


}