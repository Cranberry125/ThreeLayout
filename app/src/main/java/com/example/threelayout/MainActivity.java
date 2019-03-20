package com.example.threelayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Intent it=new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                it.setClass(MainActivity.this,layoutActivity.class);
                startActivity(it);
                break;
            case R.id.btn2:
                it.setClass(MainActivity.this,layout2Activity.class);
                startActivity(it);
                break;
            case R.id.btn3:
                it.setClass(MainActivity.this,layout3Activity.class);
                startActivity(it);
                break;
        }
    }
}
