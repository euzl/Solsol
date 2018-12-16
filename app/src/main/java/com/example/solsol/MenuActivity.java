package com.example.solsol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void onMenuClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.button:
                intent = new Intent(getApplicationContext(), DoActivity.class);
                startActivity(intent); //activity 시작!
                break;
            case R.id.button2:
                intent = new Intent(getApplicationContext(), ReActivity.class);
                startActivity(intent); //activity 시작!
                break;
            case R.id.button3:
                intent = new Intent(getApplicationContext(), MiActivity.class);
                startActivity(intent); //activity 시작!
                break;
            case R.id.button4:
                intent = new Intent(getApplicationContext(), PaActivity.class);
                startActivity(intent); //activity 시작!
                break;
            case R.id.button5:
                intent = new Intent(getApplicationContext(), SolActivity.class);
                startActivity(intent); //activity 시작!
                break;
       }

    }
}
