package cn.edu.sdwu.android02.home.sn170507180206;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);
        Button button = (Button) findViewById(R.id.work1);
        class myclass implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                //界面跳转
                Intent intent = new Intent(MainActivity01.this, Work1Activity1.class);
                startActivity(intent);

            }
        }
    }
}
