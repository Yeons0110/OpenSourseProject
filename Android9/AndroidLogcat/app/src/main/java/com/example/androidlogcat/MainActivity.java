/* **************************************
 * 프로그램명: 실습 10-3 로그캣을 이용하여 액티비티 생명주기 확인하기
 * 작성자: 2020039003 김성연
 * 작성일: 2022. 5. 4.
 * 프로그램 설명:
    - <전화걸기>를 클릭해서 다른 액티비티가 나타난 후
    - 키패드의 돌아가기 버튼을 눌러서 메인 액티비티로 돌아간 후
    - <끝내기>를 클릭해서 메인 액티비티를 마친 후 [Logcat]에서 확인
 * ***************************************/

package com.example.androidlogcat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle("로그캣 예제");

        android.util.Log.i("액티비티 테스트", "onCreate()");// onCreate()

        Button btnDial, btnFinish;// 버튼 변수 선언

        btnDial = (Button) findViewById(R.id.btnDial);// 버튼 객체 접근하기
        btnFinish = (Button) findViewById(R.id.btnFinish);

        btnDial.setOnClickListener(new View.OnClickListener() { // 전화걸기 버튼 클릭
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:01085479094");
                Intent telIntent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(telIntent);
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener() { // 끝내기 버튼 클릭
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() { // onDestroy()
        super.onDestroy();
        android.util.Log.i("액티비티 테스트", "onDestroy()");
    }

    @Override
    protected void onPause() {// onPause()
        super.onPause();
        android.util.Log.i("액티비티 테스트", "onPause()");
    }

    @Override
    protected void onRestart() {// onRestart()
        super.onRestart();
        android.util.Log.i("액티비티 테스트", "onRestart()");
    }

    @Override
    protected void onStart() { // onStart()
        super.onStart();
        android.util.Log.i("액티비티 테스트", "onStart()");
    }

    @Override
    protected void onStop() { // onStop()
        super.onStop();
        android.util.Log.i("액티비티 테스트", "onStop()");
    }
}