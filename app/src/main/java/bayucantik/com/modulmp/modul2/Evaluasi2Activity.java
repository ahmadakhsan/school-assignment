package bayucantik.com.modulmp.modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bayucantik.com.modulmp.R;
import bayucantik.com.modulmp.modul1.Evaluasi1Activity;
import bayucantik.com.modulmp.modul2.soal1.Soal1Activity;
import bayucantik.com.modulmp.modul2.soal2.Soal2Activity;
import bayucantik.com.modulmp.modul2.soal3.Soal3Activity;
import bayucantik.com.modulmp.modul3.Evaluasi3Activity;

public class Evaluasi2Activity extends AppCompatActivity {

    Button soal1, soal2, soal3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi2);
        soal1 = (Button) findViewById(R.id.soal1);
        soal2 = (Button) findViewById(R.id.soal2);
        soal3 = (Button) findViewById(R.id.soal3);


        soal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Evaluasi2Activity.this, Soal1Activity.class);
                startActivity(intent);
            }
        });
        soal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(Evaluasi2Activity.this, Soal2Activity.class);
                startActivity(intent);
            }
        });
        soal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(Evaluasi2Activity.this, Soal3Activity.class);
                startActivity(intent);
            }
        });
    }
}
