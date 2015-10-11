package com.example.matthew.snaptrav2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;


public class MainActivity extends Activity {

    private float mx, my;
    private float curX, curY;

    private ScrollView vScroll;
    private HorizontalScrollView hScroll;

    TravsOverview appState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appState = ((TravsOverview)this.getApplication());
        vScroll = (ScrollView) findViewById(R.id.vScroll);
        hScroll = (HorizontalScrollView) findViewById(R.id.hScroll);


        setContentView(R.layout.activity_main);
        Button map = (Button) findViewById(R.id.map);
//        map.setOnClickListener(new OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent login = new Intent("com.example.matthew.snaptrav2.MainActivity");
//                startActivity(login);
//                finish();
//            }
//        });
        Button submit = (Button) findViewById(R.id.report);
        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent("com.example.matthew.snaptrav2.Submit");
                startActivity(login);
                finish();
            }
        });
        Button summary = (Button) findViewById(R.id.summary);
        summary.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent login = new Intent("com.example.matthew.snaptrav2.WrittenSummary");
                startActivity(login);
                finish();
            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("215th Street")
                        .setMessage("Scheduled Time:" + appState.stations[0].getTimeScheduled() + "\nExpected Time:" + appState.stations[0].getTimeExpected())
                        .setPositiveButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case DialogInterface.BUTTON_POSITIVE: // Yes button clicked

                                        dialog.dismiss();
                                        break;
                                }
                                dialog.cancel();
                            }
                        })
                        .show();


            }
        });


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float curX, curY;

        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                mx = event.getX();
                my = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                curX = event.getX();
                curY = event.getY();
                vScroll.scrollBy((int) (mx - curX), (int) (my - curY));
                hScroll.scrollBy((int) (mx - curX), (int) (my - curY));
                mx = curX;
                my = curY;
                break;
            case MotionEvent.ACTION_UP:
                curX = event.getX();
                curY = event.getY();
                vScroll.scrollBy((int) (mx - curX), (int) (my - curY));
                hScroll.scrollBy((int) (mx - curX), (int) (my - curY));
                break;
        }

        return true;
    }
}
