package com.soniyaarockiya.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.soniyaarockiya.myaarlibrary.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.app_info_text);
        final EditText editText = findViewById(R.id.user_input);
        final Button main_button = findViewById(R.id.main_button);

        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String Url =   editText.getText().toString();
              System.out.println(Url);
                Intent intent=  new Intent(MainActivity.this,AarActivity.class);
                intent.putExtra("url",Url);

                ComponentName component = new ComponentName(MainActivity.this, AarActivity.class);
                intent.setComponent(component);
                startActivity(intent);


            }
        });



    }
}
