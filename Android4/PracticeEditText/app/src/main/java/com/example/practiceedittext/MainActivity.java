/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2020039003 김성연
 * 작성일 : 2022.04.03
 *프로그램 설명 :  에디트텍스트에 키가 눌릴 때마다, 바뀐 글자가 Toast 메시지로 나오도록 프로젝트를 작성하라.
 ************************************************/

package com.example.practiceedittext;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-8");

        editText1 =(EditText) findViewById(R.id.editTest1);
        editText1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                result = editText1.getText().toString();
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}