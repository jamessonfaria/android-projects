package jamesson.com.br.ex02_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTexto = (EditText) findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button btnTela2 = (Button) findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(this);

        Button btnTela2Parcelable = (Button) findViewById(R.id.button3);
        btnTela2Parcelable.setOnClickListener(this);

        Button btnTela2Serializable = (Button) findViewById(R.id.button4);
        btnTela2Serializable.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                String texto = edtTexto.getText().toString();
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnTela2:
                Intent it = new Intent(this, Tela2Activity.class);
                it.putExtra("nome", "Jamesson");
                it.putExtra("idade", 37);
                startActivity(it);
                break;
            case R.id.button3:
                Cliente cliente = new Cliente(2, "Amanda Faria");
                Intent intent = new Intent(this, Tela2Activity.class);
                intent.putExtra("cliente", cliente);
                startActivity(intent);
                break;
            case R.id.button4:
                ClienteSerializable clienteSerializable = new ClienteSerializable("Leo", 11);
                Intent it2 = new Intent(this, Tela2Activity.class);
                it2.putExtra("pessoa", clienteSerializable);
                startActivity(it2);
                break;
        }

    }
}
