package com.example.pesc.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int count = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

         super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        final TextView hello = (TextView) findViewById(R.id.textView);
        hello.setText( getString(R.string.fight,count));



        Button button = (Button) findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, MainActivity2Activity.class);
                //intent.putExtra("extra", hello.getText().toString());
                count++;

                if(count == 3) {
                    hello.setText(getString(R.string.scorpion));
                    count = 0;
                }
                else {
                    hello.setText(getString(R.string.fight, count));
                }


               // startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   /* public void mudaPagina(View view)
    {
        Intent intent = new Intent(MainActivity.this, MainActivity2Activity.class);
        startActivity(intent);

    }*/
}
