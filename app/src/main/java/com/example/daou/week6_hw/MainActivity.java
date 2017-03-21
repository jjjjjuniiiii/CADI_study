package com.example.daou.week6_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView profileView;
    private ArrayList<Profile> profileList;
    private ProfileAdapter pAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileView = (ListView)findViewById(R.id.profileView);
        profileList = new ArrayList<>();
        profileList.add(new Profile("이한주","14학번"));
        profileList.add(new Profile("이한주님","14학번"));
        profileList.add(new Profile("이한쥬","14학번"));
        profileList.add(new Profile("이한쥬짱","14학번"));
        profileList.add(new Profile("이한주먹거리","14학번"));
        profileList.add(new Profile("이한주주","14학번"));

        pAdapter = new ProfileAdapter(profileList,MainActivity.this);

        profileView.setAdapter(pAdapter);

    }
}
