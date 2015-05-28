package com.example.pesc.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        final TextView hello = (TextView) findViewById(R.id.textView2);

        final EditText input = (EditText) findViewById(R.id.editText);


        final Button button_dinamic = new Button(MainActivity2Activity.this);
        TextView textview_dinamic = new TextView(MainActivity2Activity.this);



        final LinearLayout layout = (LinearLayout) findViewById(R.id.text);



        AnalogClock relogio = (AnalogClock) findViewById(R.id.analogClock);

        relogio.animate();

                String texto = getIntent().getStringExtra("extra");

        hello.setText(texto);
        Button button = (Button) findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                AlertDialog.Builder  alertDialogBuilder = new AlertDialog.Builder(MainActivity2Activity.this);
                alertDialogBuilder.setCancelable(false);
                alertDialogBuilder.setMessage(input.getText());
                alertDialogBuilder.setNeutralButton(getString(R.string.fight, 1), null);

                AlertDialog alert = alertDialogBuilder.create();

                alert.show();

                layout.addView(button_dinamic);
               // hello.setText(input.getText());

            }
        });
    }

    private void OnBackPressed(){
      super.onBackPressed();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
        Intent intent = new Intent(MainActivity2Activity.this, MainActivity.class);
        startActivity(intent);

    }*/
}
