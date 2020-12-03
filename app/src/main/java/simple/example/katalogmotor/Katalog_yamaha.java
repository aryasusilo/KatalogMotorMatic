package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class Katalog_yamaha extends AppCompatActivity {
    ImageButton btnaerox,btnnmax,btnxmax,btnnewfino;
    public static final String JENIS_GALERI_KEY_YAMAHA = "JENIS_GALERI_YAMAHA";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_katalog_yamaha);


        btnaerox = findViewById(R.id.aerox);
        btnaerox.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity aerox");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "aerox");
            startActivity(intent);
        });
        btnnmax = findViewById (R.id.nmax);
        btnnmax.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity nmax");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "nmax");
            startActivity(intent);
        });
        btnxmax = findViewById (R.id.xmax);
        btnxmax.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity xmax");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "xmax");
            startActivity(intent);
        });
        btnnewfino = findViewById (R.id.newfino);
        btnnewfino.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity newfino");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "New Fino");
            startActivity(intent);
        });
    }
}