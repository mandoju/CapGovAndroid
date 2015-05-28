package com.example.pesc.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Cadastro extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final EditText editTextNome = (EditText) findViewById(R.id.editTextNome);

        final EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);

        final EditText editTextSenha = (EditText) findViewById(R.id.editTextSenha);

        Button button = (Button) findViewById(R.id.buttonCadastro);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



                Intent intent = new Intent(Cadastro.this, CadastroRealizado.class);

                Pessoa pessoa = new Pessoa(editTextNome.getText().toString(),editTextEmail.getText().toString(),editTextSenha.getText().toString());

                SharedPreferences mPrefs = getSharedPreferences("usuario",MODE_PRIVATE);

                SharedPreferences.Editor prefsEditor = mPrefs.edit();

                prefsEditor.putString("nome", pessoa.getNome());
                prefsEditor.putString("email", pessoa.getEmail());
                prefsEditor.putString("senha", pessoa.getSenha());


                prefsEditor.commit();




                //intent.putExtra("pessoa",pessoa);

                startActivity(intent);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cadastro, menu);
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
}
