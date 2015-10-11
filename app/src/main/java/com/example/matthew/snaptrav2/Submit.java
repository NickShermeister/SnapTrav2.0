package com.example.matthew.snaptrav2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * Created by Matthew on 10/10/2015.
 */
public class Submit extends Activity {

    String[] items;
    Spinner station;
    int hi;
    ArrayAdapter<String> adapter;
    TravsOverview appState;
    Spinner time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        appState = ((TravsOverview)this.getApplication());
        super.onCreate(savedInstanceState);

        hi = 0;
        setContentView(R.layout.submit);
        Button map = (Button) findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent login = new Intent("com.example.matthew.snaptrav2.MainActivity");
                startActivity(login);
                finish();
            }
        });
//        Button submit = (Button) findViewById(R.id.report);
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent login = new Intent("com.example.matthew.snaptrav2.Submit");
//                startActivity(login);
//                finish();
//            }
//        });
        Button summary = (Button) findViewById(R.id.summary);
        summary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent login = new Intent("com.example.matthew.snaptrav2.WrittenSummary");
                startActivity(login);
                finish();
            }
        });

        Spinner line = (Spinner) findViewById(R.id.train);

        station = (Spinner) findViewById(R.id.station);

        items = new String[]{"215st Street", "207th Street", "Dyckman Street", "191st Street", "181st Street", "168th Street", "157th Street", "145th Street", "137th Street", "125th Street", "116th Street", "110th Street", "103rd Street", "69th Street", "86th Street", "79th Street", "72nd Street", "66th Street", "59th Street", "50th Street", "42nd Street", "34th Street", "28th Street", "23rd Street", "18th Street", "14th Street", "Christopher Street", "Houston Street", "Canal Street", "Franklin Street", "City Hall", "Futton Street", "Wall Street"};

        adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, items);

        line.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Intent info = new Intent("");
                switch (position) {
                    case 0:
                        // This is what it's set at initially
                        break;
                    case 1:
                        station.setAdapter(adapter);
                        break;
                    case 2:

                        break;

                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        time = (Spinner) findViewById(R.id.time);

        Button finish = (Button) findViewById(R.id.button1);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hi = station.getSelectedItemPosition();
                int bye = time.getSelectedItemPosition();
                appState.changeTime(hi, bye);
                Intent login = new Intent("com.example.matthew.snaptrav2.Submit");
                startActivity(login);
                finish();
            }
        });




    }
}
