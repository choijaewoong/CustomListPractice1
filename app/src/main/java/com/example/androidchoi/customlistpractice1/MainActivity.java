package com.example.androidchoi.customlistpractice1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        mAdapter = new MyAdapter();
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemData data = (ItemData)listView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Title : " + data.articleContent, Toast.LENGTH_SHORT).show();
            }
        });
        initData();
    }

    private void initData(){

        ItemData data1 = new ItemData();
        data1.articleTitle = "Blown MNF call shifted win odds dramatically";
        data1.articleContent = "espn.go.com / Brian Burke | ESPN Stats & Information * By now every NFL fan knows...";
        data1.contentImage = getResources().getDrawable(R.drawable.soccer);
        data1.logoImage = getResources().getDrawable(R.drawable.manchester);
        data1.logoName = "Manchester";

        ItemData data2 = new ItemData();
        data2.articleTitle = "USC Athletic Dirextor Pat Haden writes letter to UCLA's Myles Jack";
        data2.articleContent = "latimes.com / Los Angeles Times * UCLA linebacker Myles Jack ...";
        data2.contentImage = getResources().getDrawable(R.drawable.swim);
        data2.logoImage = getResources().getDrawable(R.drawable.liverful);
        data2.logoName = "Liverful";

        ItemData data3 = new ItemData();
        data3.articleTitle = "Elisbury out of Yankees lineup for wild-card game";
        data3.articleContent = "hosted.ap.org / Associated Press * Latest News Advertisement";
        data3.contentImage = getResources().getDrawable(R.drawable.basketball);
        data3.logoImage = getResources().getDrawable(R.drawable.chelsea);
        data3.logoName = "Chelsea";

        mAdapter.add(data1);
        mAdapter.add(data2);
        mAdapter.add(data3);
    }
}
