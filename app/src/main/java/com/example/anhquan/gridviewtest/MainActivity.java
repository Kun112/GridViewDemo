package com.example.anhquan.gridviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gv;
    TextView name;
    ImageView img;
    Button back;
    MyAdapter adapter;
    Integer[] array;
    Bundle backup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        backup = savedInstanceState;
        setContentView(R.layout.activity_main);
        gv = (GridView)findViewById(R.id.gridView1);
        array = new Integer[]{R.drawable.beckham, R.drawable.ibra, R.drawable.messi, R.drawable.neymar, R.drawable.rooney, R.drawable.ronaldo};
        adapter = new MyAdapter(this, array);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showDetail(position);
            }
        });
    }

    private void showDetail(int position) {
        setContentView(R.layout.image_layout);
        img = (ImageView)findViewById(R.id.image);
        name = (TextView)findViewById(R.id.name);
        back = (Button)findViewById(R.id.back);
        name.setText("Position: " + (position+1));
        img.setImageResource(array[position]);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreate(backup);
            }
        });
    }
}
