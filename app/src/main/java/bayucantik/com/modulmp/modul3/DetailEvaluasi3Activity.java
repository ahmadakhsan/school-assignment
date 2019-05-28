package bayucantik.com.modulmp.modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import bayucantik.com.modulmp.R;

public class DetailEvaluasi3Activity extends AppCompatActivity {

    TextView detnama, detalamat, detnohp;
    Button edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_evaluasi3);
        detnama = (TextView) findViewById(R.id.detnama);
        detalamat = (TextView) findViewById(R.id.detnalamat);
        detnohp = (TextView) findViewById(R.id.detnohp);
        edit = (Button) findViewById(R.id.edit);

        final Intent intent = getIntent();
        final String nama = intent.getStringExtra("nama");
        final String alamaat = intent.getStringExtra("alamat");
        final String nohp = intent.getStringExtra("nohp");

        detnama.setText(nama);
        detalamat.setText(alamaat);
        detnohp.setText(nohp);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(DetailEvaluasi3Activity.this, EditEvaluasi3Activity.class);
                intent1.putExtra("nama", nama);
                intent1.putExtra("alamat", alamaat);
                intent1.putExtra("nohp", nohp);
                startActivity(intent1);

            }
        });

    }


}
