package com.example.fravorsversionesdecompilacion;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void probarVersion(View vista){
        Toast.makeText(this, "esta version es gratis", Toast.LENGTH_SHORT).show();
    }

    // esto e spara verificar en los activitis comunes que version de app es
/*    if (BuildConfig.FLAVOR.equals("admin")) {
    ...
    }*/

}
