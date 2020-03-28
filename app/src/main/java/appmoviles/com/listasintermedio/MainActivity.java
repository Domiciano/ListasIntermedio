package appmoviles.com.listasintermedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private EditText nombreET;
    private EditText correoET;
    private Button agregarBtn;
    private ListView listaNombres;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreET = findViewById(R.id.nombreET);
        correoET = findViewById(R.id.correoET);
        agregarBtn = findViewById(R.id.agregarBtn);
        listaNombres = findViewById(R.id.listaNombres);
        adapter = new CustomAdapter();
        listaNombres.setAdapter(adapter);

        agregarBtn.setOnClickListener(
                (v)->{
                    String nombre = nombreET.getText().toString();
                    String correo = correoET.getText().toString();
                    UsuariosAdapter usuario = new UsuariosAdapter(nombre, correo);
                    adapter.agregarUsuario(usuario);
                }
        );
    }
}
