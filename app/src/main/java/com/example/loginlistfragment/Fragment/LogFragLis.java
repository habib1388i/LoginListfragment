package com.example.loginlistfragment.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.loginlistfragment.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LogFragLis extends Fragment {



    String[] nameanimal = {"rusa", "ikan", "kupu-kupu", "bebek", "kucing"};
    String[] sangpencipta = {"HERBIFORA", "OMNIVORA", "HERBIFORA", "OMNIFORAt", "KARNIFORA"};
    int[] imagehewan = {R.drawable.reindeer, R.drawable.salmon, R.drawable.butterfly, R.drawable.duckling, R.drawable.cat};

    String name = "nameanimal";
    String pencipta = "sangpencipta";
    String image = "imagehewan";

    ListView lvcontact;


    public LogFragLis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_log_frag_lis, container, false);

        lvcontact = view.findViewById(R.id.lv_animal);

        List<HashMap<String, String>> LisContact = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 5; i++){

        HashMap<String, String> hm = new HashMap<>();
        hm.put(name, nameanimal[i]);
        hm.put(pencipta, sangpencipta[i]);
        hm.put(image, Integer.toString(imagehewan[i]));

        LisContact.add(hm);

            }

    String[] from = {name, pencipta, image};
    int[] to = {R.id.txt_name, R.id.txt_sangpencipta, R.id.img_animal};
    SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), LisContact, R.layout.logfrag_lis, from,to);
    lvcontact.setAdapter(simpleAdapter);
    lvcontact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    Toast.makeText(getActivity(), "ini rusa", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(getActivity(), "ini ikan", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(getActivity(), "ini kupu_kupu", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Toast.makeText(getActivity(), "ini bebek", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(getActivity(), "ini kucing", Toast.LENGTH_SHORT).show();
                    break;
            }

        }
    });
    return view;


    }



}
