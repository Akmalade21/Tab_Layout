package com.example.mdltab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Tab3 extends Fragment {

    public Tab3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tab3, container, false);

        TextView programTextView = view.findViewById(R.id.tvUniversityProgram);
        programTextView.setText(getUniversityProgram());

        return view;
    }

    private String getUniversityProgram() {
        return "Program Studi di Universitas Kuningan (UNIKU):\n\n" +
                "FKIP : Fakultas Keguruan dan Ilmu Pendidikan\n" +
                "- Bahasa dan Sastra Indonesia (S1)\n" +
                "- Pendidikan Biologi (S1)\n" +
                "- Pendidikan Ekonomi (S1)\n" +
                "- Pendidikan Bahasa Inggris (S1)\n" +
                "- Pendidikan Guru Sekolah Dasar (S1)\n" +
                "- Pendidikan Matematika (S1)\n\n" +
                "FEB : Fakultas Ekonomi dan Bisnis\n" +
                "- Manajemen (S1)\n" +
                "- Akuntansi (S1)\n" +
                "- Bisnis Digital (S1)\n\n" +
                "FHUT : Fakultas Kehutanan dan Ilmu Lingkungan\n" +
                "- Kehutanan (S1)\n" +
                "- Ilmu Lingkungan (S1)\n\n" +
                "FKOM : Fakultas Ilmu Komputer\n" +
                "- Sistem Informasi (S1)\n" +
                "- Teknik Informatika (S1)\n" +
                "- Teknik Sipil (S1)\n" +
                "- Desain Komunikasi Visual (S1)\n" +
                "- Manajemen Informatika (D3)\n\n" +
                "FH : Fakultas Hukum\n" +
                "- Ilmu Hukum (S1)\n\n" +
                "Sekolah Pascasarjana\n" +
                "- Manajemen (S2)\n" +
                "- Biologi (S2)\n" +
                "- Ekonomi (S2)\n\n" +
                "UNIKU menawarkan beragam program studi yang relevan dan berkualitas tinggi untuk membantu mahasiswa dalam mencapai potensi terbaik mereka.";
    }
}
