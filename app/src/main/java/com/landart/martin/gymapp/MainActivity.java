package com.landart.martin.gymapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.landart.martin.gymapp.Entidades.Fragments;
import com.landart.martin.gymapp.Entidades.GreetingsPage;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends Fragments{
//    public final static String EXTRA_MESSAGE = "com.landart.martin.gymapp.MESSAGE";
//    private ListView mDrawerList;
//    private ArrayAdapter<String> mAdapter;
//    private ListView menuList;

    @Override
    protected GreetingsPage createFragment() {
        return new GreetingsPage();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mDrawerList = (ListView)findViewById(R.id.navList);
//        menuList = (ListView) findViewById(R.id.menuList);
//        addDrawerItems();
//        addExerciseMenuItems();
//
//        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                switch(position){
//                    case 0:
//                        Intent nextActivity = new Intent(MainActivity.this, LoadLift.class);
//                        startActivity(nextActivity);
//                        break;
//                    case 1:
//                        break;
//                }
//
//            }
//        });

    }



//    private void addDrawerItems() {
//        String[] osArray = {"Android", "iOS", "Windows", "OS X", "Linux"};
//        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
//        mDrawerList.setAdapter(mAdapter);
//    }
//    private void addExerciseMenuItems(){
//        String[] stringArray = { getString(R.string.item1), getString(R.string.item2)};
//        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, stringArray);
//        menuList.setAdapter(mAdapter);
//    }
    /** Called when the user clicks the Send button*/
    /**
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    */
}
