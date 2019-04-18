package com.example.lat2_10116383;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class almost_there extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

        button = (Button) findViewById(R.id.almost);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityVerify();
            }
        });
    }
    public void openActivityVerify(){
        Intent intent = new Intent(this, verify.class);
        startActivity(intent);
    }
}
