package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //[2] Evento de Cluque TOAST
        Button btn = (Button)findViewById(R.id.botao);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"bem Vindo ao meu primeiro Toast",Toast.LENGTH_SHORT).show();
            }
        });
        //[2] Evento de clique TOAST
    }
//[1]codigo que puxa o menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater = getMenuInflater();
        Inflater.inflate(R.menu.menu_backgraund,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //[1]
}
