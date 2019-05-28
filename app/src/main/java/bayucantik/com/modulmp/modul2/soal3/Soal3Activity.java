package bayucantik.com.modulmp.modul2.soal3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import bayucantik.com.modulmp.R;

public class Soal3Activity extends AppCompatActivity {

    EditText nama, stambuk;
    Button tambah;
    ListView listView;

    ArrayList<String> isi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);
        nama = (EditText) findViewById(R.id.nama);
        stambuk = (EditText) findViewById(R.id.stambuk);
        tambah = (Button) findViewById(R.id.tambah);
        listView = (ListView) findViewById(R.id.list_item);

        final ArrayAdapter adapter = new ArrayAdapter(Soal3Activity.this, android.R.layout.simple_list_item_1, isi);

        listView.setAdapter(adapter);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isinama = nama.getText().toString();
                String isistb = stambuk.getText().toString();


                isi.add(isinama);
                isi.add(isistb);
                adapter.notifyDataSetChanged();

            }
        });


    }
}
