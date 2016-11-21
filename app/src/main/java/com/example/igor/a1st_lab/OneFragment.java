package com.example.igor.a1st_lab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class OneFragment extends Fragment{

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_one, container, false);
        ArrayAdapter adapter = new ArrayAdapter<String>(getContext(),
                R.layout.activity_listview, getResources().getStringArray(R.array.list_content));
        ListView listView = (ListView) v.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        return v;
    }

}