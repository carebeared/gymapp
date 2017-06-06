package com.landart.martin.gymapp.Entidades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.landart.martin.gymapp.LoadLift;
import com.landart.martin.gymapp.MainActivity;
import com.landart.martin.gymapp.R;

public class GreetingsPage extends Fragment {

    public final static String EXTRA_MESSAGE = "com.landart.martin.gymapp.MESSAGE";
    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;
    private ListView menuList;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_greeting, container, false);

        mDrawerList = (ListView)v.findViewById(R.id.navList);
        menuList = (ListView) v.findViewById(R.id.menuList);
        addDrawerItems();
        addExerciseMenuItems();



        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startLoadLiftFrag();
//                        Intent nextActivity = new Intent(MainActivity.this, LoadLift.class);
//                        startActivity(nextActivity);
                        break;
                    case 1:
                        break;
                }

            }
        });

        return v;
    }
    private void startLoadLiftFrag(){

        Fragment fragment = new LoadLift();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();

    }

    private void addDrawerItems() {
        String[] osArray = {"Android", "iOS", "Windows", "OS X", "Linux"};
        mAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);
    }
    private void addExerciseMenuItems(){
        String[] stringArray = { getString(R.string.item1), getString(R.string.item2)};
        mAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_selectable_list_item, stringArray);
        menuList.setAdapter(mAdapter);
    }
}


