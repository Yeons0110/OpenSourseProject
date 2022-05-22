/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2020039003 김성연
 * 작성일 : 2022.04.03
 *프로그램 설명 :  버튼에도 이미지가 들어가도록 할 수 있다. 다음과 같이 버튼을 클릭하면 이미지가 10도씩 회전되도록 프로젝트를 작성하라.
 ************************************************/

package com.example.practiceimage10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    ImageView img1;
    int trun = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-9");

        btn1 = (Button) findViewById(R.id.btn1);
        img1 = (ImageView) findViewById(R.id.img1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trun = trun+10;
                img1.setRotation(trun);
            }
        });
    }
}