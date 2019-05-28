package bayucantik.com.modulmp.modul2.soal2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import bayucantik.com.modulmp.R;

public class Soal2Activity extends AppCompatActivity {
    RadioGroup radioGroup ;
    RadioButton samarinda, kendari, palu, makassar;
    TextView hasil2;
    Button simpan;


    int hasil=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);
        radioGroup=(RadioGroup)findViewById(R.id.item);
        samarinda =(RadioButton)findViewById(R.id.samarinda);
        kendari =(RadioButton)findViewById(R.id.kendari);
        palu =(RadioButton)findViewById(R.id.palu);
        makassar =(RadioButton)findViewById(R.id.makassar);
        hasil2 =(TextView)findViewById(R.id.hasil2);
        simpan =(Button)findViewById(R.id.simpan1);


        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int item = radioGroup.getCheckedRadioButtonId();

                if (item==samarinda.getId()){
                    hasil-=2;
                }

                if (item==kendari.getId()){
                    hasil+=10;
                }
                if (item==palu.getId()){
                    hasil-=2;

                }
                if (item==makassar.getId()){
                    hasil-=2;

                }



                hasil2.setText(String.valueOf(hasil));


            }
        });


    }
}
