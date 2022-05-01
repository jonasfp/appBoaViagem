package br.com.casadocodigo.boaviagem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void selecionarOpcao(View view){
        TextView textView = (TextView) view;
        String opcao = "Opção:"+textView.getText().toString();
        Toast.makeText(this, opcao, Toast.LENGTH_SHORT).show();

        switch (view.getId()){
            case R.id.nova_viagem: startActivity(new Intent(this,ViagemActivity.class));
            break;
            case R.id.novo_gasto:startActivity(new Intent(this,GastoActivity.class));
            break;
        }
    }

}
