package com.example.cotcscouting.ui.data_analysis;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.github.mikephil.charting.charts.BarChart;

import com.example.cotcscouting.R;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;
import java.util.Objects;

public class DataFragment extends Fragment {

    //private DataViewModel mViewModel;
    private BarChart chart;

    public static DataFragment newInstance() {
        return new DataFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_data, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceData) {

        chart = view.findViewById(R.id.chart_testing);
        chart.setPinchZoom(false);
        chart.setDrawBarShadow(false);
        chart.setDrawGridBackground(false);
        chart.animateY(1500);

        ArrayList<BarEntry> entries = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            entries.add(new BarEntry(i, i *2)); // Just decided to put i * 2 as the value. No actual reason for it being that.
        }

        BarDataSet set1 = new BarDataSet(entries, "Testing!");

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setBarWidth(4.0f);

        chart.setData(data);
        chart.setFitBars(true);
        chart.invalidate(); // Still need to figure out what this line does.
    }

}