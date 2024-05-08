package com.example.mdltab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Tab2 extends Fragment {

    public Tab2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tab2, container, false);

        TextView facultyTextView = view.findViewById(R.id.tvUniversityFaculty);
        facultyTextView.setText(getUniversityFaculty());

        return view;
    }

    private String getUniversityFaculty() {
        return "Fakultas di Universitas Kuningan (UNIKU):\n\n" +
                "1. FKIP : Fakultas Keguruan dan Ilmu Pendidikan\n" +
                "2. FEB : Fakultas Ekonomi dan Bisnis\n" +
                "3. FHUT : Fakultas Kehutanan dan Ilmu Lingkungan\n" +
                "4. FKOM : Fakultas Ilmu Komputer\n" +
                "5. FH : Fakultas Hukum\n" +
                "6. Sekolah Pascasarjana\n\n" +
                "UNIKU memiliki beragam fakultas yang menyediakan program studi yang berkualitas untuk memenuhi kebutuhan pendidikan dan pengembangan sumber daya manusia di Indonesia.";
    }
}
