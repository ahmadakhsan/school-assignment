package bayucantik.com.modulmp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bayucantik.com.modulmp.modul1.Evaluasi1Activity;
import bayucantik.com.modulmp.modul2.Evaluasi2Activity;
import bayucantik.com.modulmp.modul3.Evaluasi3Activity;
import bayucantik.com.modulmp.modul4.Evaluasi4Activity;
import bayucantik.com.modulmp.modul5.Evaluasi5Activity;

public class MainActivity extends AppCompatActivity {

    Button modul1, modul2, modul3, modul4, modul5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modul1 =(Button) findViewById(R.id.modul1);
        modul2=(Button)findViewById(R.id.modul2);
        modul3 =(Button)findViewById(R.id.modul3);
        modul4=(Button)findViewById(R.id.modul4);
        modul5=(Button)findViewById(R.id.modul5);


        modul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Evaluasi1Activity.class);
                startActivity(intent);
            }
        });

        modul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Evaluasi2Activity.class);
                startActivity(intent);
            }
        });
        modul3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Evaluasi3Activity.class);
                startActivity(intent);
            }
        });
        modul4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Evaluasi4Activity.class);
                startActivity(intent);
            }
        });
        modul5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Evaluasi5Activity.class);
                startActivity(intent);
            }
        });

    }
}
