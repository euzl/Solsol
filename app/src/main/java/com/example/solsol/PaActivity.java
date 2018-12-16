package com.example.solsol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaActivity extends AppCompatActivity {

    private EditText mEditText;

    private int dcnt; // 남은 입력 횟수
    private TextView mTextCnt; // 띄어줄거

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pa);
        mEditText = findViewById(R.id.editText);


        dcnt = 3;
        if(savedInstanceState != null){
            dcnt = savedInstanceState.getInt("number", 3);
        }
        mTextCnt = findViewById(R.id.textCnt);
        mTextCnt.setText("남은 횟수 : "+dcnt);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("number", dcnt);

    }

    public void onPaClick(View v){


        String dazim = mEditText.getText().toString();
        if(dcnt>1) {
            if (dazim.length() > 0) {
                Toast.makeText(this, dazim, Toast.LENGTH_SHORT).show();
                dcnt--;
            } else {
                Toast.makeText(this, "세뇌하세요!", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            if(dcnt==1)
                dcnt--;
            Toast.makeText(this,"세뇌되었습니다!", Toast.LENGTH_SHORT).show();
        }
        mTextCnt.setText("남은 횟수 : "+dcnt);
        mEditText.setText("");
    }
}
