package com.inkadroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtNumero1;
    private EditText edtNumero2;
    private TextView txtResultado;
    private Button btnSumar,btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtNumero1=(EditText) findViewById(R.id.edtNumero1);
        edtNumero2=(EditText) findViewById(R.id.edtNumero2);
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        btnSumar=(Button) findViewById(R.id.btnSumar);
        btnSalir=(Button) findViewById(R.id.btnSalir);
        btnSumar.setOnClickListener(this);
        btnSalir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnSumar:
                int numero1 = Integer.parseInt(edtNumero1.getText().toString());
                int numero2 = Integer.parseInt(edtNumero2.getText().toString());
                int suma=numero1+numero2;
                txtResultado.setText(String.valueOf(suma));
                break;
            case R.id.btnSalir:
                finish();
                break;
        }
    }
}