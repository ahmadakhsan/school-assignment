package bayucantik.com.modulmp.modul2.soal1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import bayucantik.com.modulmp.R;

public class Soal1Activity extends AppCompatActivity {

    CheckBox bandung, bogor, banjarmasin, bontang;
    Button simpan;
    TextView nilai;

    int hasil=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);

        bandung = (CheckBox) findViewById(R.id.bandung);
        bogor = (CheckBox) findViewById(R.id.bogor);
        banjarmasin = (CheckBox) findViewById(R.id.banjarmasin);
        bontang = (CheckBox) findViewById(R.id.bontang);
        nilai =(TextView)findViewById(R.id.nilai1);
        simpan = (Button) findViewById(R.id.simpan);


        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bandung.isChecked()) {
                    hasil+=10;

                }
                if (bogor.isChecked()) {

                    hasil-=5;
                }
                if (banjarmasin.isChecked()) {

                    hasil+=10;

                }
                if (bontang.isChecked()) {

                    hasil-=5;
                }

                nilai.setText(String.valueOf(hasil));

            }
        });


    }
}
