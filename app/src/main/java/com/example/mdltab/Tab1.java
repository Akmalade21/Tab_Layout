package com.example.mdltab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Tab1 extends Fragment {

    public Tab1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tab1, container, false);

        TextView historyTextView = view.findViewById(R.id.tvUniversityHistory);
        historyTextView.setText(getUniversityHistory());

        ImageView logoImageView = view.findViewById(R.id.logoImageView);
        logoImageView.setImageResource(R.drawable.logouniku);

        return view;
    }

    private String getUniversityHistory() {
        return "Universitas Kuningan (UNIKU) adalah buah dari tekad dan dedikasi Yayasan Pendidikan Sang Adipati Kuningan untuk meningkatkan kualitas sumber daya manusia demi kesejahteraan masyarakat. Walaupun gagasan pendirian universitas telah muncul sejak 1979, namun baru pada tahun 2003, UNIKU resmi berdiri setelah penggabungan empat sekolah tinggi yang dikelola oleh yayasan tersebut.\n\n" +
                "Sejarah UNIKU dimulai dengan berdirinya Sekolah Tinggi Keguruan dan Ilmu Pendidikan (STKIP) Kuningan pada tahun 1985. Kemudian, lahir Sekolah Tinggi Ilmu Ekonomi (STIE) pada tahun 1995, diikuti oleh Sekolah Tinggi Ilmu Kehutanan (STIKU) dan Sekolah Tinggi Manajemen Informatika dan Komputer (STMIK) pada tahun 2001. Dari pengalaman mengelola empat sekolah tinggi tersebut, Yayasan Pendidikan Sang Adipati Kuningan merasa sudah siap untuk mendirikan universitas.\n\n" +
                "Pada 6 Juni 2003, Universitas Kuningan resmi didirikan berdasarkan Surat Keputusan Menteri Pendidikan Nasional. Universitas ini diresmikan oleh Prof. A. Malik Fajar, M.Sc., Menteri Pendidikan Nasional pada saat itu, pada tanggal 17 Juni 2003. Sejak berdirinya, UNIKU terus berkembang dengan membuka berbagai program studi baru, termasuk Program Studi Pendidikan Bahasa Inggris, Pendidikan Ekonomi, dan Pendidikan Biologi.\n\n" +
                "Tak hanya itu, UNIKU juga terus melakukan inovasi dengan membuka program studi jenjang magister seperti Ilmu Hukum dan Manajemen. Pada tahun 2013, UNIKU membuka Program Studi Pendidikan Guru Sekolah Dasar (PGSD) dan Pendidikan Matematika. Pada tahun-tahun berikutnya, UNIKU terus memperluas jangkauan pendidikannya dengan membuka program studi Desain Komunikasi Visual dan Magister Manajemen.\n\n" +
                "Dengan komitmen yang kuat untuk meningkatkan mutu pendidikan dan menghasilkan lulusan berkualitas, UNIKU terus berupaya menjadi kebangaan masyarakat Kuningan dan berperan aktif dalam memajukan pendidikan di Indonesia.";
    }

}
