/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2020039003 김성연
 * 작성일 : 2022.04.03
 *프로그램 설명 :  체크박스를 선택할 때마다, 버튼의 속성이 설정되도록 프로젝트를 작성하라
 ************************************************/


package com.example.yeonandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3;
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice4_7);

        checkBox1 = findViewById(R.id.Checkbox1);
        checkBox2 = findViewById(R.id.Checkbox2);
        checkBox3 = findViewById(R.id.Checkbox3);

        Button = findViewById(R.id.Button);


        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox1.isChecked() == true){
                    Button.setEnabled(true);
                } else {
                    Button.setEnabled(false);
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox2.isChecked() == true){
                    Button.setClickable(true);
                } else {
                    Button.setClickable(false);
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox3.isChecked() == true){
                    Button.setRotation(45);
                } else {
                    Button.setRotation(0);
                }
            }
        });
    }
}