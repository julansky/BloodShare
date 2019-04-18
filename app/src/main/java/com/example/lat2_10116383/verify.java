package com.example.lat2_10116383;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verify extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        button = (Button) findViewById(R.id.ver);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAkun();
            }
        });
    }
    public void openActivityAkun(){
        Intent intent = new Intent(this, akun.class);
        startActivity(intent);
    }
}
