package com.example.mpchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> earnings = new ArrayList<>();
        earnings.add(new BarEntry(1, 800000));
        earnings.add(new BarEntry(2, 980000));
        earnings.add(new BarEntry(3, 1300000));
        earnings.add(new BarEntry(4, 750000));
        earnings.add(new BarEntry(5, 900000));
        earnings.add(new BarEntry(6, 975000));
        earnings.add(new BarEntry(7, 1450000));

        BarDataSet barDataSet = new BarDataSet(earnings, "Earnings");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart Example");
        barChart.animateY(2000);
    }
}