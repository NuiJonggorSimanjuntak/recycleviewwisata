package marfel.app.recycleviewwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> gbrWisata = new ArrayList<>();
    private ArrayList<String> namaWisata = new ArrayList<>();
    private ArrayList<String> ket_Wisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

    }

    private void prosesRecyclerViewAdapter() {

        RecyclerView recyclerView = findViewById(R.id.rvWisata);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(gbrWisata, namaWisata, ket_Wisata, this);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getData() {
        gbrWisata.add(R.drawable.wisata1);
        namaWisata.add("Pulau Seribu Dewa");
        ket_Wisata.add("Pulau Seribu Dewa satu ini memang tidak perlu diragukan lagi terkait keindahan dan pesonanya dalam memikat para wisatawan dalam negeri maupun mancanegara. Di Bali, ada satu tempat wisata yang begitu cantik, yakni Nusa Dua. \n" +
                "\n" +
                "Objek wisata pantai ini memiliki pasir putih yang lembut dan air laut yang berwarna biru jernih. Kamu akan dimanjakan dengan berbagai fasilitas saat berkunjung ke tempat satu ini. Mulai dari penginapan dan resort yang berkelas, restoran, pusat perbelanjaan, hingga aktivitas berselancar di pantainya.");

        gbrWisata.add(R.drawable.wisata2);
        namaWisata.add("Kepulauan Raja Ampat");
        ket_Wisata.add("Surga dunia di Indonesia selanjutnya adalah kepulauan Raja Ampat yang terletak di Papua Barat dengan kekayaan laut terlengkap di bumi.\n" +
                "\n" +
                "Raja Ampat atau Empat Raja merupakan 4 pulau indah yang merupakan penghasil lukisan batu kuno. Empat pulau utama yang dimaksud adalah Waigeo, Salawati, Batanta, dan Misool.\n" +
                "\n" +
                "Nama-nama tersebut berasal dari mitos lokal dari warga di sekitar pulau Raja Ampat. Keindahan dan kemegahan dari objek wisata populer asal Indonesia ini mampu mengundang para wisatawan dari seluruh dunia untuk datang ke sini dan merasakan pengalaman sekaligus pemandangan yang tidak akan terlupakan.\n" +
                "\n" +
                "Dengan wilayah pulau mencakup hingga 4,6 juta hektar tanah dan laut, kita bisa menemukan 540 jenis karang, 1.511 spesies ikan, serta 700 jenis moluska.\n" +
                "\n" +
                "Perlu diketahui Toppers, menurut laporan The Nature Conservancy and Conservation International, ada sekitar 75% spesies laut dunia yang tinggal di pulau indah nan menakjubkan ini.");

        gbrWisata.add(R.drawable.wisata3);
        namaWisata.add("Taman Nasional Wakatobi");
        ket_Wisata.add("Taman Nasional Wakatobi juga merupakan salah satu tujuan wisata bawah laut yang populer dan mendunia.\n" +
                "\n" +
                "Dengan luas mencapai 13.900 km2, tujuan wisata terkenal asal Indonesia ini memiliki tak kurang dari 112 jenis terumbu karang yang bersimbiosis dengan ikan-ikan bawah laut sehingga menciptakan panorama bawah laut yang tiada tanding.\n" +
                "\n" +
                "Semuanya itu menjadikan Wakatobi sebagai salah satu surga menyelam bagi para traveler dari berbagai penjuru dunia.");

        gbrWisata.add(R.drawable.wisata4);
        namaWisata.add("Danau Toba");
        ket_Wisata.add("Toppers pernah berkunjung ke Danau Toba? Danau dengan keindahan yang tidak tertandingi ini merupakan danau vulkanik terbesar di Asia Tenggara dan terbesar kedua di dunia setelah Danau Victoria.\n" +
                "\n" +
                "Danau Toba sudah lama terkenal sebagai salah satu objek wisata Indonesia favorit yang sering dikunjungi sejak tahun 1980-an lho!\n" +
                "\n" +
                "Objek wisata Indonesia yang terkenal di dunia ini memiliki luas 1.145 kilometer persegi. Di tengah danau terdapat Pulau Samosir yang luasnya hampir sebanding dengan negara Singapura. Bisa bayangin kan Toppers, betapa megahnya Danau Toba ini?\n" +
                "\n" +
                "Selain terluas, danau ini juga termasuk salah satu danau terdalam di dunia dengan kedalaman sekitar 450 meter.\n" +
                "\n" +
                "Buat Toppers yang sedang atau ingin berkunjung ke Sumatera Utara, sempatkan mampir untuk menikmati keindahan Danau Toba, ya");

        gbrWisata.add(R.drawable.wisata5);
        namaWisata.add("Gunung Rinjani");
        ket_Wisata.add("Di Nusa Tenggara Barat juga terdapat wisata yang tak kalah populer dan cocok bagi kamu yang suka mendaki, yakni Gunung Rinjani. Gunung ini adalah gunung berapi tertinggi kedua yang ada di Indonesia. \n" +
                "\n" +
                "Gunung Rinjani memiliki pemandangan terindah se-Asia dengan hamparan bunga edelweis dan Danau Segara Anak. Di tempat ini juga bisa menjadi spot menarik bagi para pendaki untuk mendirikan tenda, mandi air hangat, maupun memancing ikan. \n" +
                "\n" +
                "Namun sebelum itu, buatlah persiapan yang matang sebelum memutuskan untuk mendaki. Kamu juga perlu menyiapkan bekal mental dan stamina agar tidak menyerah di tengah jalan.");

        gbrWisata.add(R.drawable.wisata6);
        namaWisata.add("Candi Borobudur");
        ket_Wisata.add("Salah satu ikon wisata budaya Indonesia yang mendunia lainnya adalah Candi Borobudur. Sebagai candi Budha terbesar di dunia dengan luas tak kurang dari 123 X 123 meter, candi yang dibangun pada masa kerajaan Mataram kuno ini merupakan warisan budaya dan sejarah Indonesia yang terkenal akan arsitektur yang memukau.\n" +
                "\n" +
                "Setiap tahunnya, tak cuma wisatawan domestik tetapi banyak juga wisatawan asing yang tertarik untuk mengamati keindahan dari Candi Borobudur.\n" +
                "\n" +
                "Berbagai relief yang menceritakan mengenai berbagai ajaran dalam agama Budha dan perjalanan hidup Sidharta Gautama hingga mencapai pencerahan sempurna bisa Toppers temukan di tempat wisata favorit asal Indonesia.\n" +
                "\n" +
                "Candi Borobudur sendiri memiliki total tak kurang dari 504 arca Buddha dan 2.672 panel relief pada dinding-dindingnya. Menakjubkan sekali, bukan?");

        gbrWisata.add(R.drawable.wisata7);
        namaWisata.add("Pulau Komodo");
        ket_Wisata.add("Destinasi wisata Indonesia yang tersohor di mata dunia selanjutnya adalah Pulau Komodo. Pulau yang berlokasi di Kepulauan Nusa Tenggara Timur ini merupakan rumah bagi ratusan Komodo, hewan endemik yang hanya ada di Indonesia.\n" +
                "\n" +
                "Selain bisa mengamati perilaku dan mengeksplorasi habitat dari hewan purba ini, Pulau Komodo juga menawarkan panorama alam yang menakjubkan.\n" +
                "\n" +
                "Salah satunya adalah pantai dengan pasir berwarna merah muda yang dikenal dengan nama “Pink Beach“.\n" +
                "\n" +
                "Pantai seperti ini hanya terdapat tujuh di seluruh dunia sehingga menjadikannya sebagai salah satu tujuan wisata Indonesia yang mendunia.");

        gbrWisata.add(R.drawable.wisata8);
        namaWisata.add("Gunung Bromo");
        ket_Wisata.add("Salah satu gunung berapi yang masih aktif ini memiliki pesona khas berupa gurun pasir yang sangat luat.\n" +
                "\n" +
                "Meskipun bukan salah satu gunung tertinggi di Indonesia, namun keindahan Gunung Bromo tidak ada duanya dan membuat para pengunjung dapat merasakan pemandangan yang fantastis dan spektakuler.\n" +
                "\n" +
                "Wisatawan dapat berkuda dan mendaki gunung bromo untuk menikmati keindahan yang menawan saat matahari terbit dan terbenam.\n" +
                "\n" +
                "Bisa jadi pengalaman secara langsung yang tidak terlupakan lho Toppers! Dengan keindahan yang menakjubkan itu tidak heran jika objek wisata di Indonesia satu ini menjadi para wisatawan mancanegara yang berkunjung ke Indonesia.");

        gbrWisata.add(R.drawable.wisata9);
        namaWisata.add("Nusa Penida");
        ket_Wisata.add("Pulau Bali, sudah tidak bisa dipungkiri lagi namanya memang merajalela ke seluruh dunia karena pemandangannya yang indah, budayanya yang masih kental terasa dan pantai nya yang eksotis.\n" +
                "\n" +
                "Saat Toppers berkunjung ke Bali jangan heran kalau banyak banget turis berlalu lalang di sana, bahkan beberapa ada yang menetap di Bali lho!\n" +
                "\n" +
                "Salah satu objek wisata di Bali yang populer di mata dunia saat ini adalah Nusa Penida. Tempat wisata Indonesia favorit ini adalah pilihan tepat untuk Toppers yang suka melakukan Island Hoping, dan menikmati keindahan bawah laut dengan snorkeling.\n" +
                "\n" +
                "Dengan panorama pantai yang indah Nusa Penida dan pulau-pulau kecil sekitarnya menawarkan pengalaman berbeda dan tentunya akan memanjakan Toppers yang juga memiliki hobi fotografi.");

        gbrWisata.add(R.drawable.wisata10);
        namaWisata.add("Gili Trawangan");
        ket_Wisata.add("Untuk pecinta pantai, Gili Trawangan merupakan tujuan wisatawan dari seluruh dunia. Dengan kombinasi langit biru dengan semburat awan putih, jernihnya air laut dibingkai pasir putih menjadikan Gili Trawangan sebagai tujuan wisata populer baik bagi wisatawan dalam negeri maupun luar negeri.\n" +
                "\n" +
                "Selain pantai dan alam bawah laut, tempat wisata Nusantara yang berada di Provinsi Nusa Tenggara Barat ini juga memiliki berbagai lansekap menakjubkan dan juga spot-spot foto yang instagramable, lho.");
        prosesRecyclerViewAdapter();

    }

}
