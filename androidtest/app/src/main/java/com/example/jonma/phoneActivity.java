package com.example.jonma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class phoneActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.phone);
        textView = (TextView)findViewById(R.id.thrid);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        Log.d("phone","传入成功");
        textView.setText(data);

    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","传回首页数据成功");
        setResult(1,intent);
        finish();
    }

    public void onClick(View view) {

        Intent intent1 = new Intent();
        intent1.putExtra("data_return","传回首页数据成功");
        setResult(RESULT_OK,intent1);
        finish();
        Log.i("艹你吗","回传成功");

    }
}
