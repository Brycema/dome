package com.example.jonma;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private  Button button;
    private  Button button1;
    private TextView textView;
    private TextView textView1;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menumain,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_itme:
                Toast.makeText(this,"add ok",Toast.LENGTH_SHORT).show();
            case  R.id.remove:
                Toast.makeText(this,"remove ok",Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        button = (Button)findViewById(R.id.inser);
        button1 = (Button)findViewById(R.id.jion) ;
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        textView = (TextView)findViewById(R.id.main);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode){
            case 1:
                if (requestCode == 1){
                    String returnData = data.getStringExtra("data_return");
                    textView.setText(returnData);
                    Log.d("MainActivity",returnData);
                }
                break;
                default:
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.inser:
                String date = "MainActivity import date";
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("tel",date);
                startActivity(intent);
                break;
            case R.id.jion:
                Intent intent1 = new Intent(MainActivity.this,phoneActivity.class);
                intent1.putExtra("data","首页传入的数据");
                startActivityForResult(intent1,1);
                break;
                default:
                    break;
        }
    }
}
