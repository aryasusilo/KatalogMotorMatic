package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class GaleriActivityHonda extends AppCompatActivity {

    String jenisMotor;
    TextView txJenis,txCC,txTahun,txDeskripsi,txJudul;
    ImageView ivFotoHewan;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_honda);
        Intent intent = getIntent();
        jenisMotor = intent.getStringExtra(KatalogHonda.JENIS_GALERI_KEY);
        inisialisasiView();
        if(jenisMotor.equalsIgnoreCase ("scoopy")){
            txJenis.setText("scoopy");
            txCC.setText("CC : 108,2");
            txTahun.setText("Tahun : 2020");
            txDeskripsi.setText("Mesin\\t4 Tak, SOHC, Liquid Cooled\\n\" +\n" +
                    "                    \"Kapasitas\\t108,2 cc\\n\" +\n" +
                    "                    \"Daya Maksimum\\t9,1 PS / 7.500 rpm\\n\" +\n" +
                    "                    \"Torsi Maksimum\\t9,4 Nm  / 6.000 rpm\\n\" +\n" +
                    "                    \"Transmisi\\tOtomatis\\n\" +\n" +
                    "                    \"Ban Depan\\tTubeless\\n\" +\n" +
                    "                    \"Ban Depan\\t100/90 – 12 59J\\n\" +\n" +
                    "                    \"Ban Belakang\\t110/90 – 12 64J\\n\" +\n" +
                    "                    \"Rem Depan\\tCakram Hidrolik\\n\" +\n" +
                    "                    \"Rem Belakang\\tTromol\\n\" +\n" +
                    "                    \"Suspensi Depan\\tTeleskopik\\n\" +\n" +
                    "                    \"Suspensi Belakang\\tMonoshock\\n\" +\n" +
                    "                    \"Harga\\tRp. 18.300.000");
            ivFotoHewan.setImageResource (R.drawable.scoopy);
        }
        else if(jenisMotor.equalsIgnoreCase ("Vario150")){
            txJenis.setText("Vario 150");
            txCC.setText("CC : 150");
            txTahun.setText("Tahun : 2020");
            txDeskripsi.setText("Mesin\\t4 Tak, SOHC, Liquid Cooled\\n\" +\n" +
                    "                    \"Kapasitas\\t150 cc\\n\" +\n" +
                    "                    \"Daya Maksimum\\t9.7 kW (13.1 PS) / 8500 rpm\\n\" +\n" +
                    "                    \"Torsi Maksimum\\t13.4 Nm (1.37 kgf.m) / 5000 rpm\\n\" +\n" +
                    "                    \"Transmisi\\tOtomatis, V-matic\\n\" +\n" +
                    "                    \"Tipe Ban\\tTubeless\\n\" +\n" +
                    "                    \"Ban Depan\\t90/80-14M/C 43P\\n\" +\n" +
                    "                    \"Ban Belakang\\t100/80-14M/C 48P\\n\" +\n" +
                    "                    \"Rem Depan\\tCakram Hidrolik\\n\" +\n" +
                    "                    \"Rem Belakang\\tTromol\\n\" +\n" +
                    "                    \"Suspensi Depan\\tTeleskopik\\n\" +\n" +
                    "                    \"Suspensi Belakang\\tMonoshock\\n\" +\n" +
                    "                    \"Harga\\tRp. 22.600.000");
            ivFotoHewan.setImageResource (R.drawable.vario_150);
        }
        else if (jenisMotor.equalsIgnoreCase ("BeateSP")){
            txJenis.setText("BeateSP");
            txCC.setText("CC : 108,2");
            txTahun.setText("Tahun : 2018");
            txDeskripsi.setText("Mesin\\t4 Tak, SOHC, Liquid Cooled\\n\" +\n" +
                    "                    \"Kapasitas\\n\" +\n" +
                    "                    \"Daya Maksimum\\t8,2 kW / 8.500 rpm\\n\" +\n" +
                    "                    \"Torsi Maksimum\\t10,8 Nm / 5.000 rpm\\n\" +\n" +
                    "                    \"Transmisi\\tOtomatis\\n\" +\n" +
                    "                    \"Ban Depan\\tTubeless\\n\" +\n" +
                    "                    \"Ban Depan\\t80/90-14M/C 40P\\n\" +\n" +
                    "                    \"Ban Belakang\\t90/90-14M/C 46P\\n\" +\n" +
                    "                    \"Rem Depan\\tCakram Hidrolik\\n\" +\n" +
                    "                    \"Rem Belakang\\tTromol\\n\" +\n" +
                    "                    \"Suspensi Depan\\tTeleskopik\\n\" +\n" +
                    "                    \"Suspensi Belakang\\tMonoshock\\n\" +\n" +
                    "                    \"Harga\\t\\n\" +\n" +
                    "                    \"Rp. 19.200.000 (CBS)\\n\" +\n" +
                    "                    \"Rp. 20.000.000 (CBS-ISS)");
            ivFotoHewan.setImageResource (R.drawable.beat_esp);
        }
        else if (jenisMotor.equalsIgnoreCase ("Beatstreet")){
            txJenis.setText("Beatstreet");
            txCC.setText("CC : 108,1");
            txTahun.setText("Tahun : 2017");
            txDeskripsi.setText("Mesin\\t4 Tak, SOHC, Air Cooled\\n\" +\n" +
                    "                    \"Kapasitas\\n\" +\n" +
                    "                    \"Daya Maksimum\\t6,38 kW / 7.500 rpm\\n\" +\n" +
                    "                    \"Torsi Maksimum\\t9,01 Nm  / 6.000 rpm\\n\" +\n" +
                    "                    \"Transmisi\\tOtomatis\\n\" +\n" +
                    "                    \"Ban Depan\\tTubeless\\n\" +\n" +
                    "                    \"Ban Depan\\t80/90-14M/C 40P\\n\" +\n" +
                    "                    \"Ban Belakang\\t90/90-14M/C 46P\\n\" +\n" +
                    "                    \"Rem Depan\\tCakram Hidrolik\\n\" +\n" +
                    "                    \"Rem Belakang\\tTromol\\n\" +\n" +
                    "                    \"Suspensi Depan\\tTeleskopik\\n\" +\n" +
                    "                    \"Suspensi Belakang\\tMonoshock\\n\" +\n" +
                    "                    \"Harga\\tRp. 16.175.000");
            ivFotoHewan.setImageResource (R.drawable.beatstreet);
        }

    }

    private void inisialisasiView() {
        txJenis = findViewById(R.id.txJenis);
        txCC = findViewById(R.id.txCC);
        txTahun = findViewById(R.id.txTahun);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarMotor);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Motor "+jenisMotor);
    }


}