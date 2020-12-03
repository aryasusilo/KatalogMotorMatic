package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GaleriActivityYamaha extends AppCompatActivity {

    String jenisMotorYamaha;
    TextView txJenis,txCC,txTahun,txDeskripsi,txJudul;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_yamaha);
        Intent intent = getIntent();
        jenisMotorYamaha = intent.getStringExtra(Katalog_yamaha.JENIS_GALERI_KEY_YAMAHA);
        if(jenisMotorYamaha.equalsIgnoreCase ("Aerox")){
            inisialisasiView();
            txJenis.setText("Aerox");
            txCC.setText("CC : 155");
            txTahun.setText("Tahun : 2020");
            txDeskripsi.setText("Spesifikasi\\t\\n\" +\n" +
                    " \"Tipe : Liquid cooled 4-stroke, SOHC\\n\" +\n" +
                    " \\n\" +\n" +
                    "                    \"Tenaga : 11.0 kW / 8000 rpm\\n\" +\n" +
                    "                    \"Torsi : 13.8 Nm / 6250 rpm\\n\" +\n" +
                    "                    \"Sistem Pembakaran : Fuel Injection\\n\" +\n" +
                    "                    \"Harga\\t\\n\" +\n" +
                    "                    \"S-Version : Rp 26.900.000\\n\" +\n" +
                    "                    \"R-Version : Rp 24.050.000\\n\" +\n" +
                    "                    \"VVA : Rp. 22.550.000");
            ivFotoHewan.setImageResource (R.drawable.aerox_155);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("Nmax")){
            inisialisasiView();
            txJenis.setText("Nmax");
            txCC.setText("CC : 250");
            txTahun.setText("Tahun : 2019");
            txDeskripsi.setText("Spesifikasi\\t\\n\" +\n" +
                    "                    \"Tipe : Liquid cooled 4-stroke, SOHC\\n\" +\n" +
                    "                    \\n\" +\n" +
                    "                    \"Tenaga : 11.1 kW/8000 rpm\\n\" +\n" +
                    "                    \"Torsi : 14.4 Nm/6000 rpm\\n\" +\n" +
                    "                    \"Sistem Pembakaran : Fuel Injection\\n\" +\n" +
                    "                    \"Harga\\t\\n\" +\n" +
                    "                    \"Non-ABS : Rp. 25,700,000\\n\" +\n" +
                    "                    \"ABS : Rp. 29.600.000");
            ivFotoHewan.setImageResource (R.drawable.nmax);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("Xmax")){
            inisialisasiView();
            txJenis.setText("Xmax");
            txCC.setText("CC : 200");
            txTahun.setText("Tahun : 2020");
            txDeskripsi.setText("Spesifikasi\\t\\n\" +\n" +
                    "                    \"Tipe : Liquid cooled 4-stroke, SOHC\\n\" +\n" +
                    "                    \\n\" +\n" +
                    "                    \"Tenaga : 15 kW @ 7,500 rpm\\n\" +\n" +
                    "                    \"Torsi : 21 Nm @ 6,000 rpm\\n\" +\n" +
                    "                    \"Sistem Pembakaran : Fuel Injection\\n\" +\n" +
                    "                    \"Harga\\t\\n\" +\n" +
                    "                    \"Rp. 55.000.000");
            ivFotoHewan.setImageResource (R.drawable.xmax);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("New Fino")){
            inisialisasiView();
            txJenis.setText("New fino");
            txCC.setText("CC : 150");
            txTahun.setText("Tahun : 2020");
            txDeskripsi.setText("Spesifikasi\\t\\n\" +\n" +
                    "                    \"Tipe : Air cooled, 4-stroke, SOHC\\n\" +\n" +
                    "                    \\n\" +\n" +
                    "                    \"Tenaga : 7.0 kW (9.52 PS) / 8000rpm\\n\" +\n" +
                    "                    \"Torsi : 9.6 N.m (0,98 kgf.m) / 5500rpm\\n\" +\n" +
                    "                    \"Sistem Pembakaran : Fuel Injection\\n\" +\n" +
                    "                    \"Harga\\t\\n\" +\n" +
                    "                    \"Premium : Rp. 17,200,000\\n\" +\n" +
                    "                    \"Grande : Rp. 18,400,000");
            ivFotoHewan.setImageResource (R.drawable.newfino);
        }

    }

    private void inisialisasiView() {
        txJenis = findViewById(R.id.txJenis);
        txCC = findViewById(R.id.txCC);
        txTahun = findViewById(R.id.txTahun);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarMotor);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Motor "+jenisMotorYamaha);
    }
}