package com.yful_coding.resepmakanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView listHistory;
    LinearLayoutManager linear;

    List<PolaItem> items;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listHistory = (RecyclerView)findViewById(R.id.list);

        linear = new LinearLayoutManager(this);
        listHistory.setLayoutManager(linear);

        items = new ArrayList<>();
        items.add(new PolaItem(R.drawable.gambar1,"Pisang Goreng","Pisang Goreng Krispi","\n" +
                "\n" +
                "    4 buah pisang uli\n" +
                "\n" +
                "     5 sdm tepung terigu\n" +
                "\n" +
                "   2 sdm susu bubuk\n" +
                "\n" +
                "    1 sdt gula\n" +
                "\n" +
                "   Secukupnya garam\n" +
                "\n" +
                "    100 ml air (secukupnya)\n" +
                "\n" +
                "   3 sdm tepung roti\n" +
                "\n" +
                "   Secukupnya minyak untuk menggoreng  \n" +
                "\n"
                ,"   Potong pisang uli menjadi tiga bagian atau sesuai selera. Sisihkan.\n" +
                "    Campur terigu, susu bubuk, gula, garam dan air, aduk. Kekentalan adonan tidak terlalu kental tapi tidak terlalu cair.\n" +
                "    Masukan potongan pisang kedalam adonan terigu, lalu gulingkan diatas tepung roti hingga rata. Goreng hingga kuning keemasan, angkat, sajikan.\n" ));
        items.add(new PolaItem(R.drawable.gambar2,"Ayam Kecap ","Ayam Kecap Manis","\n" +
                "    1/2 ekor ayam, potong 6 bagian, tambahkan 1/2 sendok teh garam dan 2 sendok makan air jeruk nipis, aduk rata\n" +
                "    4 siung bawang putih, memarkan\n" +
                "    1/2 ruas jari jahe, memarkan\n" +
                "    1/2 butir bawang bombai, potong panjang\n" +
                "    2 tangkai daun bawang, potong serong\n" +
                "    5 sendok makan kecap manis\n" +
                "    1/4 sendok teh garam\n" +
                "    1 buah tomat, potong panjang\n" +
                "    100 ml air\n" +
                "    Minyak goreng secukupknya untuk menggoreng\n" +
                "    1 sendok makan margarin, untuk menumis\n"

                ,"\n" +
                "    Panaskan minyak, goreng ayam dalam minyak panas hingga matang tapi tidak kering, angkat, sisihkan.\n" +
                "    Panaskan margarin, tumis jahe dan bawang putih hingga harum, lalu masukkan bawang bombai, tumis hingga layu.\n" +
                "    Rebus dalam air mendidih dengan api sedang hingga mengapung.\n" +
                "    Masukkan ayam, aduk sebentar.\n" +
                "    Tambahkan kecap manis, air, garam, lada, tumis hingga matang. Masukkan tomat dan daun bawang, aduk sebentar, angkat.\n" +
                "    Sajikan hangat.\n" +
                "\n" ));
        items.add(new PolaItem(R.drawable.gambar3,"Bubur Sagu ","Bubur Sagu Mutiara","\n" +
                "100 gr Sagu mutiara cap kucing atau Sebungkus.\n" +
                " 750 ml air atau secukupnya\n" +
                "125 gr gula pasir (manis sesuai selera).\n" +
                "1/2 sdt vanilli bubuk (optional).\n" +
                "Kuah Santan :\n" +
                "Gula pasir secukupnya.\n" +
                "400 cc santan kental atau secukupnya.\n" +
                "1 sdt garam.\n" +
                "2 lembar daun pandan simpulkan.\n"  ,"\n" +
                " Didihkan terlebih dahulu air dalam panci,lalu langsung masukan sebungkus sagu mutiara.\n" +
                "Lalu masukan gulapasir,vanili bubuk,aduk sesekali agar bubur tidak melengket didasar panci.\n" +
                "Masak hingga matang ciri2nya butiran mutiara akan berwarna bening kenyal selama 30-40 menit.\n" +
                "Kuah santan : masak semua bahan hingga mendidih tpi santan tidak pecah.\n" +
                "saat bubur sudah hangat,masukan secukupnya dalam mangkok/gelas bubur mutiara siram dgn kuah santan,aduk rata,siap disantap.\n"
                 ));
        items.add(new PolaItem(R.drawable.gambar5,"Seblak ","Seblak Ceker Pedas","\n" +
                "300 gram ceker.\n" +
                "1.000 ml air.\n" +
                "Telur ayam 4 butir\n" +
                "2 butir telur, kocok lepas.\n" +
                "200 gram kerupuk merah, rendam.\n" +
                "2 batang caisim, potong 2 cm.\n" +
                "50 gram taoge.\n" +
                "1 1/2 sendok makan kecap manis.\n" +
                "3 1/4 sendok teh garam.\n" +
                "1/4 sendok teh kaldu ayam bubuk.\n" +
                "1/4 sendok teh merica bubuk.\n" +
                "2 sendok teh gula pasir.\n" +
                "2 sendok makan minyak untuk menumis.\n" +
                "Bumbu halus:\n" +
                "2 siung bawang putih.\n" +
                "3 buah bawang merah.\n" +
                "3 cm kencur.\n" +
                "1 buah cabai merah besar.\n" +
                "4 buah cabai rawit merah.\n" ,"\n" +
                "\n" +
                "Rebus ceker bersama air sampai matang dan empuk. Ukur kaldunya 400 ml. Sisihkan.\n" +
                "Tumis bumbu halus sampai harum. Sisihkan bumbu di sisi wajan. Masukkan telur. Aduk sampai berbutir. Tambahkan ceker dan kerupuk. Aduk rata.\n" +
                "Masukkan caisim dan taoge. Aduk sampai layu. Tuangkan air rebusan ceker. Aduk rata. Masukkan kecap manis. Aduk rata.\n" +
                "Bubuhi garam, kaldu ayam bubuk, merica bubuk dan gula pasir. Aduk rata. Masak sampai matang. \n"
                ));
        items.add(new PolaItem(R.drawable.gambar4,"Soto","Soto Ayam","\n" +
                "1 ekor ayam utuh (bersihkan).\n" +
                "200 gram kol.\n" +
                "200 gram tauge (rebus sebentar).\n" +
                "4 buah kentang (rebus atau kukus, kupas, dan goreng).\n" +
                "2 buah tomat.\n" +
                "50 gr soun (rendam dalam air panas).\n" +
                "3 telur rebus.\n" +
                "air secukupnya\n" +
                "Bawang goreng.\n" ,"\n" +
                "\n" +
                "Tumis bumbu yang dihaluskan dengan api kecil hingga harum.\n" +
                "Rebus ayam di dalam panci bersama dengan bumbu yang sudah ditumis, lengkuas, daun jeruk, daun salam, dan daun serai selama paling sedikit 30 menit sampai daging ayam menjadi empuk. Waktu memasak bisa disingkat dengan menggunakan panci presto.\n" +
                "Bila kuah masih kurang enak boleh ditambah garam atau merica secukupnya.\n" +
                "Pisahkan daging dari tulang dengan menggunakan garpu dan pisau.\n" +
                "Masukkan kembali tulang ke dalam kuah di panci.\n" +
                "Masukkan potong daun bawang.\n" +
                "Kuah perlu dididihkan kembali sebelum dihidangkan.\n"
                  ));


        adapter = new Adapter(this,items);
        listHistory.setAdapter(adapter);
    }
}
