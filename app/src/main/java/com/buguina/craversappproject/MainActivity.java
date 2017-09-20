package com.buguina.craversappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Spinner s = (Spinner) findViewById(R.id.spin);
    s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });

    }
    public void cafes_more(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void dining_out(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void desserts(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
    public void drinks_night(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}
