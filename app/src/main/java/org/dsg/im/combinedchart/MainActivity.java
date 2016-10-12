package org.dsg.im.combinedchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LineView mLineView;
    YAxisView mLeftAxisView;
    YAxisView mRightAxisView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLineView = (LineView)findViewById(R.id.line_view);
        mLeftAxisView = (YAxisView)findViewById(R.id.v_left_line);
        mRightAxisView = (YAxisView) findViewById(R.id.v_right_line);
        ArrayList<String> test = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            test.add(i + 1 + "月");
        }
        mLineView.setBottomTextList(test);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            list.add((int)(Math.random() * 1000));
        }
        ArrayList<ArrayList<Integer>> lineList = new ArrayList<>();
        lineList.add(list);
        mLineView.setDataList(lineList, mRightAxisView, 200);
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i = 0; i < 12; i++){
            list2.add((int)(Math.random() * 100));
            list3.add((int)(Math.random() * 100));
        }
        ArrayList<ArrayList<Integer>> barList = new ArrayList<>();
        barList.add(list2);
        barList.add(list3);
        ArrayList<Integer> colorList = new ArrayList<>();
        colorList.add(getResources().getColor(R.color.colorAccent));
        colorList.add(getResources().getColor(R.color.colorPrimary));
        mLineView.setBarDataList(barList, mLeftAxisView, 20, colorList);
    }
}
