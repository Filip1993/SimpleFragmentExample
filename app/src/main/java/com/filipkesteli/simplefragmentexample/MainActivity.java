package com.filipkesteli.simplefragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void ActivityClick(View view) {
        Toast.makeText(MainActivity.this, R.string.abc, Toast.LENGTH_SHORT).show();
    }*/
}
