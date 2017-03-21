package com.example.daou.week6_hw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by daou on 2017-03-17.
 */

public class ProfileAdapter extends BaseAdapter {
    private ArrayList<Profile> profileList;
    private ListView listView;
    private Context context;
    private Button button;
    private TextView text1;
    private TextView text2;
    int position;

    public ProfileAdapter(ArrayList<Profile> profileList, Context context) {
        this.profileList = profileList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return profileList.size();
    }

    @Override
    public Object getItem(int position) {
        return profileList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.profile_list, parent, false);
        listView = (ListView) itemView.findViewById(R.id.profileView);

        button = (Button) itemView.findViewById(R.id.btn);
        text1 = (TextView) itemView.findViewById(R.id.name);
        text2 = (TextView) itemView.findViewById(R.id.age);

        this.position = position;

        fillViews(listView, position);
        return itemView;
    }

    // 리스트 뷰에 띄우기
    private void fillViews(ListView List, int position) {
        text1.setText(profileList.get(position).getName());
        text2.setText(profileList.get(position).getAge());

        button.setOnClickListener(new profileViewListener(position));

    }

    private class profileViewListener implements View.OnClickListener{
        int position;

        public profileViewListener(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,profileList.get(position).getName() + " /" + profileList.get(position).getAge(), Toast.LENGTH_LONG ).show();
        }
    }
}
