package com.example.matthew.snaptrav2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Matthew on 10/10/2015.
 */
public class WrittenSummary extends Activity{

    TravsOverview appState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        appState = ((TravsOverview)this.getApplication());


        setContentView(R.layout.writtensummary);
        Button map = (Button) findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent login = new Intent("com.example.matthew.snaptrav2.MainActivity");
                startActivity(login);
                finish();
            }
        });
        Button submit = (Button) findViewById(R.id.report);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent("com.example.matthew.snaptrav2.Submit");
                startActivity(login);
                finish();
            }
        });
        Button summary = (Button) findViewById(R.id.summary);
//        summary.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent login = new Intent("com.example.matthew.snaptrav2.Summary");
//                startActivity(login);
//                finish();
//            }
//        });
        TextView stations = (TextView) findViewById(R.id.station);
        stations.setText(appState.stations());

        TextView scheduled = (TextView) findViewById(R.id.scheduled);
        scheduled.setText(appState.scheduledTime());

        TextView expected = (TextView) findViewById(R.id.actual);
        expected.setText(appState.expectedTime());






    }
}
