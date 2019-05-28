package bayucantik.com.modulmp.modul5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bayucantik.com.modulmp.R;

public class Evaluasi5Activity extends AppCompatActivity {

    Button soal1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi5);
        soal1 = (Button) findViewById(R.id.soal1ev);


        soal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Evaluasi5Activity.this, Soal1Activity.class);
                startActivity(intent);
            }
        });


    }
}
