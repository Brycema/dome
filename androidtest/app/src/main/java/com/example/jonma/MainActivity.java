package com.example.jonma;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private  Button button;
    private  Button button1;

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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.inser:
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);
                Log.i("add","单击完成");
                Toast.makeText(this,"SD成功",Toast.LENGTH_SHORT).show();
                break;
            case R.id.jion:


                break;
                default:
                    break;

        }
    }


}
