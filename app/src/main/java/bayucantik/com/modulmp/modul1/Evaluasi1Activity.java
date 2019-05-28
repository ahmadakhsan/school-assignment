package bayucantik.com.modulmp.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import bayucantik.com.modulmp.R;

public class Evaluasi1Activity extends AppCompatActivity {

    EditText panjang, lebar;
    TextView hasil;
    Button hitung;
    String  p,l;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi1);
        panjang = (EditText) findViewById(R.id.panjang);
        lebar = (EditText) findViewById(R.id.lebar);
        hasil= (TextView)findViewById(R.id.hasil);

        hitung=(Button)findViewById(R.id.hitung);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            p= panjang.getText().toString();
            l= lebar.getText().toString();

            total = Double.valueOf(p) * Double.valueOf(l) ;

            hasil.setText(String.valueOf(total));

            }
        });



    }
}
