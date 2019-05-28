package bayucantik.com.modulmp.modul5;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import bayucantik.com.modulmp.R;

public class Soal1Activity extends AppCompatActivity {
    DataHelper dbHelper;
    Button simpan;
    EditText text1, text2, text3;
    EditText pencarian;
    ListView isibiodata;
    String[] daftar;
    DataHelper dbcenter;
    protected Cursor cursor;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal4);
        isibiodata = (ListView) findViewById(R.id.isibiodata);

        dbcenter = new DataHelper(this);



        dbHelper = new DataHelper(this);
        text1 = (EditText) findViewById(R.id.editText1);
        text2 = (EditText) findViewById(R.id.editText2);
        text3 = (EditText) findViewById(R.id.editText3);
        pencarian = (EditText) findViewById(R.id.pencarian);
        simpan = (Button) findViewById(R.id.simpan5);
        RefreshList();
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into biodata(nim, nama, alamat) values('" +
                        text1.getText().toString() + "','" +
                        text2.getText().toString() + "','" +
                        text3.getText().toString() + "')");
                RefreshList();

            }
        });


    }


    public void RefreshList() {
        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc = 0; cc < cursor.getCount(); cc++) {
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(1).toString();
        }
        isibiodata = (ListView) findViewById(R.id.isibiodata);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, daftar);
        isibiodata.setAdapter(adapter);

        pencarian.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Soal1Activity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

        isibiodata.setSelected(true);


        isibiodata.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                final String selection = daftar[arg2]; //.getItemAtPosition(arg2).toString();
                final CharSequence[] dialogitem = {"Soal 2"};
                AlertDialog.Builder builder = new AlertDialog.Builder(Soal1Activity.this);
                builder.setTitle("Pilihan");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        switch (item) {
                            case 0:
                                Intent i = new Intent(getApplicationContext(), Soal2Activity.class);
                                i.putExtra("nama", selection);
                                startActivity(i);
//                                break;

                        }
                    }
                });
                builder.create().show();
            }
        });
        ((ArrayAdapter) isibiodata.getAdapter()).notifyDataSetInvalidated();
    }


}
