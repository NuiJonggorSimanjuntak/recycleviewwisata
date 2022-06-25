package marfel.app.recycleviewwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.app.GameManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class WisataActivity extends AppCompatActivity {

    ImageView wisataImage;
    TextView nama_Wisata, ket_Wisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        wisataImage = findViewById(R.id.wisataImage);
        nama_Wisata = findViewById(R.id.nama_Wisata);
        ket_Wisata = findViewById(R.id.ket_Wisata);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("image") && getIntent().hasExtra("nama_Wisata") && getIntent().hasExtra("ket_Wisata")) {
            Integer GambarWisata = getIntent().getIntExtra("image", 0);
            String NamaWisata = getIntent().getStringExtra("nama_Wisata");
            String KetWisata = getIntent().getStringExtra("ket_Wisata");

            setDataActivity(GambarWisata, NamaWisata, KetWisata);
        }
    }

    private void setDataActivity(Integer GambarWisata, String NamaWisata, String KetWisata) {
        Glide.with(this).asBitmap().load(GambarWisata).into(wisataImage);
        nama_Wisata.setText(NamaWisata);
        ket_Wisata.setText(KetWisata);
    }
}