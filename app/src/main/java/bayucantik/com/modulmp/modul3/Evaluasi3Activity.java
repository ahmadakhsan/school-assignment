package bayucantik.com.modulmp.modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import bayucantik.com.modulmp.R;

public class Evaluasi3Activity extends AppCompatActivity {

    ListView listView;
    ArrayList<model> nama;
    ArrayList<String> namalist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi3);
        listView = (ListView) findViewById(R.id.listview);
        nama = new ArrayList<>();
        namalist = new ArrayList<>();

        nama.add(new model("Bayu Tamvan", " Antang ", "0865555555"));
        nama.add(new model("Ucup Tamvan", " Sudiang ", "08655554488"));
        nama.add(new model("Parul Tamvan", " Antang ", "088383944949"));

        namalist.add("Bayu Tamvan");
        namalist.add("Ucup Tamvan");
        namalist.add("Parul Tamvan");


        final ArrayAdapter adapter = new ArrayAdapter(Evaluasi3Activity.this, android.R.layout.simple_list_item_1, namalist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Evaluasi3Activity.this, DetailEvaluasi3Activity.class);
                if (namalist.get(i).equals(nama.get(i).getNama())){
                    intent.putExtra("nama", nama.get(i).getNama());
                    intent.putExtra("alamat", nama.get(i).getAlamat());
                    intent.putExtra("nohp", nama.get(i).getNohp());
                    startActivity(intent);
                }
            }
        });


    }
}
