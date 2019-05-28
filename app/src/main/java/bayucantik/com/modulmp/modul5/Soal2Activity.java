package bayucantik.com.modulmp.modul5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import bayucantik.com.modulmp.R;

public class Soal2Activity extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    TextView nim, nama, alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);
        nim = (TextView) findViewById(R.id.detnim5);
        nama = (TextView) findViewById(R.id.detnama5);
        alamat = (TextView) findViewById(R.id.detalamat5);
        dbHelper = new DataHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata WHERE nama = '" +
                getIntent().getStringExtra("nama") + "'",null);
        cursor.moveToFirst();
        if (cursor.getCount()>0)
        {
            cursor.moveToPosition(0);
            nim.setText(cursor.getString(0).toString());
            nama.setText(cursor.getString(1).toString());
            alamat.setText(cursor.getString(2).toString());

        }

    }
}
