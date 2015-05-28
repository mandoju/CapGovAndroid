package com.example.pesc.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;


public class CadastroRealizado extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_realizado);

        Bundle extras = getIntent().getExtras();


        SharedPreferences mprefs = this.getSharedPreferences("usuario" , Context.MODE_PRIVATE);

        String nome =  mprefs.getString("nome", null);
        String email =  mprefs.getString("email",null);
        String senha =  mprefs.getString("senha",null);


        //Pessoa pessoa = (Pessoa) extras.get("pessoa");
        Pessoa pessoa = new Pessoa(nome,email,senha);


        final TextView textViewNome = (TextView) findViewById(R.id.textViewNomeCadastrado);
        textViewNome.setText(pessoa.getNome());
        final TextView textViewEmail = (TextView) findViewById(R.id.textViewEmailCadastrado);
        textViewEmail.setText(pessoa.getEmail());
        final TextView textViewSenha = (TextView) findViewById(R.id.textViewSenhaCadastrado);
        textViewSenha.setText(pessoa.getSenha());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cadastro_realizado, menu);
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
