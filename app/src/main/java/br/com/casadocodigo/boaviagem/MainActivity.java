package br.com.casadocodigo.boaviagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usuario;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);
    }

    public void entrarOnClick(View view) {
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

        if ("jonas".equals(usuarioInformado) && "123456".equals(senhaInformada)) {
            startActivity(new Intent(this, DashboardActivity.class));
        } else {
            String mensagemErro = getString(R.string.erro_autenticacao);
            Toast.makeText(this, mensagemErro, Toast.LENGTH_SHORT).show();
        }
    }
}