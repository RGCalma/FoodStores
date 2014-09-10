package com.ryx.foodstores;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DapitanFragment extends android.support.v4.app.Fragment implements AdapterView.OnItemClickListener{
    String[] foodstore;
    ListView lv;
    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        foodstore=new String[]{"Jollibee", "Chezron", "Heaven's Touch","Chiquito","Chix ni Lolo","Liempuhan","Wendy's","KFC"
                                ,"New York 101","Alchemy","Love Lite"};
        View v = inflater.inflate(R.layout.dapitan, container, false);
        lv= (ListView) v.findViewById(R.id.dapitanListView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,foodstore);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
        Button button = (Button)getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return v;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "Store Name : " + foodstore[position], Toast.LENGTH_SHORT).show();
    }
}