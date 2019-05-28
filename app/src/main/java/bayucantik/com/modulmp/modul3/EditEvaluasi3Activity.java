package bayucantik.com.modulmp.modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import bayucantik.com.modulmp.R;

public class EditEvaluasi3Activity extends AppCompatActivity {

    EditText tvnama, tvalamat, tvnohp;

    Button edit;
    String nmbaru, ambaru, hpbaru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_evaluasi3);
        tvnama = (EditText) findViewById(R.id.editnama);
        tvalamat = (EditText) findViewById(R.id.editalamat);
        tvnohp = (EditText) findViewById(R.id.editnohp);
        edit = (Button) findViewById(R.id.edit);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String alamat = intent.getStringExtra("alamat");
        String nohp = intent.getStringExtra("nohp");

        tvnama.setText(nama);
        tvalamat.setText(alamat);
        tvnohp.setText(nohp);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nmbaru = tvnama.getText().toString();
                ambaru = tvalamat.getText().toString();
                hpbaru = tvnohp.getText().toString();

            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("nama", nmbaru);
        outState.putString("alamat", ambaru);
        outState.putString("nohp", hpbaru);

        super.onSaveInstanceState(outState);

    }
}
