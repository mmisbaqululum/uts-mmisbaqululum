package com.example.uts_mmisbaqululum;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_mmisbaqululum.adapters.JenisAdapter;
import com.example.uts_mmisbaqululum.adapters.JenisDetailAdapter;
import com.example.uts_mmisbaqululum.models.Karawitan;

import java.util.ArrayList;
import java.util.List;

public class JenisActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Karawitan> teams = new ArrayList<>();
        teams.add(new Karawitan("https://cdn.statically.io/img/i2.wp.com/generasihijau.com/wp-content/uploads/2018/10/ricikan-demung-karawitan-jawa-alat-musik-tradisional-jawa-tengah-e1538636986176.png?resize=680%2C439&ssl=1", "Demung", "Demung adalah salah satu instrumen gamelan yang termasuk keluarga balungan.\n" +
                "\n" +
                "Dalam satu set gamelan biasanya terdapat 2 demung, keduanya memiliki versi pelog dan slendro. " +
                "\n Demung menghasilkan nada dengan oktaf terendah dalam keluarga balungan, " +
                "\ndengan ukuran fisik yang lebih besar. Demung memiliki wilahan yang relatif lebih tipis namun lebih lebar " +
                "\ndaripada wilahan saron, sehingga nada yang dihasilkannya lebih rendah. Tabuh demung biasanya terbuat dari kayu, " +
                "\ndengan bentuk seperti palu, lebih besar dan lebih berat daripada tabuh saron.\n" +
                "\n" +
                "Cara menabuhnya ada yang biasa sesuai nada, nada yang imbal, atau menabuh bergantian antara demung " +
                "\n1 dan demung 2, menghasilkan jalinan nada yang bervariasi namun mengikuti pola tertentu. " +
                "\nCepat lambatnya dan keras lemahnya penabuhan tergantung pada komando dari kendang dan jenis gendhingnya. " +
                "\nPada gendhing Gangsaran yang menggambarkan kondisi peperangan misalnya, demung ditabuh dengan keras dan cepat. " +
                "\nPada gendhing Gati yang bernuansa militer, demung ditabuh lambat namun keras. Ketika mengiringi lagu ditabuh " +
                "\npelan. Ketika sedang dalam kondisi imbal, maka ditabuh cepat dan keras."));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/42/Bonang_barung_and_panerus._STSI_Surakarta.jpg", "Bonang", "Bonang adalah alat musik Indonesia yang digunakan dalam gamelan Jawa. " +
                "\nIni adalah kumpulan gong-gong kecil (kadang-kadang disebut \"ceret\" atau \"pot\") " +
                "\nyang diletakkan secara horizontal ke dawai dalam bingkai kayu (rancak), lebar satu atau dua baris. " +
                "\nSemua ceret memiliki bos pusat, tetapi di sekitarnya ketel yang lebih rendah memiliki kepala yang rata, " +
                "\nsedangkan yang lebih tinggi memiliki yang melengkung. Masing-masing disetel ke nada tertentu " +
                "\ndalam skala yang sesuai; jadi ada bonang berbeda untuk pelog dan slendro. Mereka biasanya dipukul " +
                "\ndengan tongkat (tabuh). Ini mirip dengan gong pelukan lainnya dalam gamelan, kethuk, kempyang, dan kenong. " +
                "\nBonang dapat dibuat dari perunggu tempa, besi tempa dan palu dingin, atau kombinasi logam. " +
                "\nSelain bentuk ketong berbentuk gong, bonang ekonomis yang terbuat dari besi tempa atau lempengan " +
                "\nkuningan dengan atasan sering ditemukan di gamelan desa, gamelan gaya Suriname, " +
                "\ndan di beberapa gamelan Amerika."));
        teams.add(new Karawitan("https://i.ytimg.com/vi/hs0Hq_sFVAs/hqdefault.jpg", "Peking", "peking yaitu termasuk dalam jenis kelompok ricikan balungan berlaras slendro dan pelog. Bentuk instrumen saron penerus " +
                "\ntermasuk dalam instrumen bilah dari segi ukuran lebih kecil dibanding saron barung, bilah maupun rancakan. "));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/7/7e/Traditional_indonesian_instruments04.jpg", "Gong", "Gong merupakan sebuah alat musik pukul yang terkenal di Asia Tenggara " +
                "\ndan Asia Timur. Gong ini digunakan untuk alat musik tradisional. " +
                "\nSaat ini tidak banyak lagi perajin gong seperti ini.\n" +
                "\n" +
                "Gong yang telah ditempa belum dapat ditentukan nadanya. Nada gong baru terbentuk setelah dibilas dan dibersihkan. " +
                "\nApabila nadanya masih belum sesuai, gong dikerok sehingga lapisan perunggunya menjadi lebih tipis."));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/8/88/Traditional_indonesian_drums.jpg", "Kendang", "Kendang atau kendhang adalah instrumen dalam gamelan Jawa Tengah dan " +
                "\nJawa Barat yang salah satu fungsi utamanya mengatur irama. " +
                "\nInstrument ini dibunyikan dengan tangan, tanpa alat bantu. Jenis kendang yang kecil disebut ketipung, " +
                "\nyang menengah disebut kendang ciblon/kebar. Pasangan ketipung ada satu lagi bernama kendang gedhe biasa " +
                "\ndisebut kendang kalih. Kendang kalih dimainkan pada lagu atau gendhing yang berkarakter halus seperti ketawang, " +
                "\ngendhing kethuk kalih, dan ladrang irama dadi. Bisa juga dimainkan cepat pada pembukaan lagu jenis lancaran, " +
                "\nladrang irama tanggung. Untuk wayangan ada satu lagi kendhang yang khas yaitu kendhang kosek.\n" +
                "\n" +
                "Kendang kebanyakan dimainkan oleh para pemain gamelan profesional, yang sudah lama menyelami budaya Jawa. " +
                "\nKendang kebanyakan di mainkan sesuai naluri pengendang, sehingga bila dimainkan oleh satu orang dengan " +
                "\norang lain maka akan berbeda nuansanya."));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/3/37/Turkey.Konya027.jpg", "Rebab", "Rebab (Arab الربابة atau ربابة - \"busur (instrumen)\"),[1] " +
                "\njuga rebap, rabab, rebeb, rababah, atau al-rababa) adalah jenis alat musik senar yang dinamakan " +
                "\ndemikian paling lambat dari abad ke-8 dan menyebar melalui jalur-jalur perdagangan Islam yang lebih banyak " +
                "\ndari Afrika Utara, Timur Tengah, bagian dari Eropa, dan Timur Jauh. Beberapa varietas sering memiliki " +
                "\ntangkai di bagian bawah agar rebab dapat bertumpu di tanah, dan dengan demikian disebut rebab tangkai " +
                "\ndi daerah tertentu, tetapi terdapat versi yang dipetik seperti kabuli rebab (kadang-kadang disebut sebagai " +
                "\nrobab atau rubab).\n" +
                "\n" +
                "Ukuran rebab biasanya kecil, badannya bulat, bagian depan yang tercakup dalam suatu membran seperti perkamen atau " +
                "\nkulit domba dan memiliki leher panjang terpasang. Ada leher tipis panjang dengan pegbox pada akhir dan ada satu, " +
                "\ndua atau tiga senar. Tidak ada papan nada. Alat musik ini dibuat tegak, baik bertumpu di pangkuan atau di lantai. " +
                "\nBusurnya biasanya lebih melengkung daripada biola.\n" +
                "\n" +
                "Rebab, meskipun dihargai karena nada suara, tetapi memiliki rentang yang sangat terbatas (sedikit lebih dari " +
                "\nsatu oktaf), dan secara bertahap diganti di banyak dunia Arab oleh biola dan kemenche. Hal ini terkait dengan " +
                "\ninstrumen Irak, Joza, yang memiliki empat senar.\n" +
                "\n" +
                "Pengenalan rebab ke Eropa Barat telah mungkin bersamaan dengan penaklukan Spanyol oleh bangsa Moor, di Semenanjung " +
                "\nIberia. Namun, ada bukti adanya alat musik ini pada abad ke-9 juga di Eropa Timur: ahli geografi Persia " +
                "\nabad ke-9 Ibnu Khurradadhbih mengutip lira Bizantium (atau lūrā) sebagai alat musik busur khas Bizantium dan " +
                "\nsetara dengan rabāb Arab.[2]"));
        teams.add(new Karawitan("https://www.dictio.id/uploads/db3342/original/3X/3/8/385ac38d94b23465352d4a736b0f994158954d48.jpg", "Slentem", "Slenthem merupakan salah satu instrumen gamelan yang terdiri " +
                "\ndari lembaran lebar logam tipis yang diuntai dengan tali dan direntangkan di atas tabung-tabung " +
                "\ndan menghasilkan dengungan rendah atau gema yang mengikuti nada saron, ricik, dan balungan bila ditabuh. " +
                "\nBeberapa kalangan menamakannya sebagai gender penembung. Seperti halnya pada instrumen lain dalam satu " +
                "\nset gamelan, slenthem tentunya memiliki versi slendro dan versi pelog. " +
                "\nWilahan Slenthem Pelog umumnya memiliki rentang nada C hingga B, sedangkan " +
                "\nslenthem slendro memiliki rentang nada C, D, E, G, A, C'."));
        teams.add(new Karawitan("https://ak9.picdn.net/shutterstock/videos/16956919/thumb/1.jpg", "Kenong", "Kenong merupakan salah satu alat musik yang menyusun gamelan Jawa. " +
                "\nKenong biasanya dimainkan dengan dipukul oleh satu alat pemukul. " +
                "\nAlat ini merupakan pengisi akor atau harmoni dalam permainkan gamelan, " +
                "\nkenong berfungsi sebagai penentu batas-batas gatra, menegaskan irama. " +
                "\nKenong juga termasuk dalam alat musik berpencu, tetapi ukuran lebih besar daripada bonang. " +
                "\nAlat ini juga dipukul menggunakan alat pemukul kayu yang dililitkan kain. " +
                "\nJumlah dalam satu set bervariasi tetapi biasanya sekitar 10 buah. " +
                "\nKenong merupakan unsur instrumen pencon gamelan yang paling gemuk, " +
                "\ndibandingkan dengan kempul dan gong yang walaupun besar namun berbentuk pipih. " +
                "\nKenong ini disusun pada pangkon berupa kayu keras yang dialasi dengan tali, " +
                "\nsehingga pada saat dipukul kenong tidak akan bergoyang ke samping namun dapat bergoyang ke atas bawah, " +
                "\nsehingga menghasilkan suara. Bentuk kenong yang besar menghasilkan suara yang rendah namun " +
                "\nnyaring dengan timber yang khas (dalam telinga masyarakat Jawa ditangkap berbunyi ning-nong, " +
                "\nsehingga dinamakan kenong). Dalam gamelan, suara kenong mengisi sela-sela antara kempul."));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/3/32/Traditional_indonesian_instruments.jpg", "Saron", "Saron atau yang biasanya disebut juga ricik, " +
                "\nadalah salah satu instrumen gamelan yang termasuk keluarga balungan.\n" +
                "\n" +
                "Dalam satu set gamelan gaya Surakarta biasanya mempunyai 2 pasang saron, laras pelog dan slendro. " +
                "\nSaron menghasilkan nada satu oktaf lebih tinggi daripada demung atau saron panembung, " +
                "\ndengan ukuran fisik yang lebih kecil. Tabuh saron biasanya terbuat dari kayu, dengan bentuk seperti palu.\n" +
                "\n" +
                "\n" +
                "Dari kiri-kanan; saron panerus, saron barung, dan demung, dari STSI Surakarta\n" +
                "Cara menabuhnya ada yang biasa sesuai nada, nada yang imbal, atau menabuh bergantian antara saron 1 dan saron 2. " +
                "\nCepat lambatnya dan keras lemahnya penabuhan tergantung pada komando dari kendang dan jenis gendhingnya. " +
                "\nPada gendhing Gangsaran yang menggambarkan kondisi peperangan misalnya, ricik ditabuh dengan keras dan cepat. " +
                "\nPada gendhing Gati yang bernuansa militer, ricik ditabuh lambat namun keras. Ketika mengiringi lagu ditabuh pelan.\n" +
                "\n" +
                "Dalam memainkan saron, tangan kanan memukul wilahan / lembaran logam dengan tabuh, lalu tangan kiri memencet " +
                "\nwilahan yang dipukul sebelumnya untuk menghilangkan dengungan yang tersisa dari pemukulan nada sebelumnya. " +
                "\nTeknik ini disebut memathet (kata dasar: pathet = pencet)"));
        teams.add(new Karawitan("https://metrobali.com/wp-content/uploads/2014/06/gambang.jpg", "Gambang", "Gambang kayu merupakan alat musik tradisional yang terdiri dari " +
                "\nsebuah palung.[1] Bahan dasar alat musik ini adalah kayu.[1] " +
                "\nPalung yang menjadi tempat kayu itu disusun disebut grobokan.[1] Jumlah bilah kayu yang disusun " +
                "\nmelintang di atas grobokan ada 16 sampai 21 buah.[1] Kayu yang digunakan sebagai bahan dasar adalah kayu jati.[1] " +
                "\nNamun, ada pula yang menggunakan kayu rawan, kayu naangka, kayu sembir atau slanking untuk bahan dasar.[1] " +
                "\nBilah-bilah gambang ini disusun dengan alas jalinan rotan atau kain.[1] " +
                "\nTujuannya supaya suara yang dihasilkan jernih. Selain kayu, bahan yang digunakan untuk " +
                "\nmembuat bilah-bilah susun adalah bambu.[1] Menurut para pemain gamelan, gambang yang menghasilkan suara " +
                "\npaling jernih adalah gambang yang terbuat dari kayu rawan.[1] Akan tetapi, di Jawa jarang ditemui kayu rawan.[1] " +
                "\nMaka, untuk mendapatkan kayu rawan para pengrajin mendatangkannya dari Kalimantan.[1] " +
                "\nKayu rawan disebut juga kayu merawan.[2] Kayu ini dikenal awet dan tidak mudah lapuk.[2]"));

        JenisDetailAdapter adapter = new JenisDetailAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
