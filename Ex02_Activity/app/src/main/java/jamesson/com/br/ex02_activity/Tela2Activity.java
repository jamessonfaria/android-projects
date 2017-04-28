package jamesson.com.br.ex02_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView txt = (TextView) findViewById(R.id.txtTexto);

        Intent it = getIntent();

        Cliente cliente = it.getParcelableExtra("cliente");
        ClienteSerializable pessoa = (ClienteSerializable) it.getSerializableExtra("pessoa");

        if(cliente != null){
            String texto = String.format("Nome: %s / Idade: %d", cliente.nome, cliente.codigo);
            txt.setText(texto);
        }else{
            if(pessoa != null){
                String texto2 = String.format("Nome: %s / Idade: %d", pessoa.nome, pessoa.idade);
                txt.setText(texto2);
            }else{
                String nome = it.getStringExtra("nome");
                int idade = it.getIntExtra("idade", -1);
                txt.setText(String.format("Nome: %s / Idade: %d", nome, idade));
            }
        }



    }
}
