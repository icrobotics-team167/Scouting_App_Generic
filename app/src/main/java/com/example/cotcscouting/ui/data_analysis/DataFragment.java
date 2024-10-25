package com.example.cotcscouting.ui.data_analysis;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cotcscouting.data.model.AppDatabase;
import com.example.cotcscouting.data.model.Pit;
import com.github.mikephil.charting.charts.BarChart;

import com.example.cotcscouting.R;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        AppDatabase database = AppDatabase.Companion.getDatabase(requireContext()); // Get the AppDatabase singleton

        List<Pit> pitData = database.pitDAO().getAll();

        for(Pit pit : pitData) {
            // Use reflection to get methods
            Method[] methods = pit.getClass().getMethods();

            ArrayList<Method> components = findMethodNamesWhichMatch(methods, "component[0-9]+");

            // Testing stuff
            try {
                System.out.println(components.get(0).invoke(pit));
            } catch (InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }

        }


        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setBarWidth(4.0f);

        chart.setData(data);
        chart.setFitBars(true);
        chart.invalidate(); // Still need to figure out what this line does
    }

    ArrayList<Method> findMethodNamesWhichMatch(Method[] methods, String pattern) {
        ArrayList<Method> matchingMethods = new ArrayList<>();

        for(Method method : methods) {
            if(method.getName().matches(pattern)) { matchingMethods.add(method); }
        }

        return matchingMethods;
    }
}