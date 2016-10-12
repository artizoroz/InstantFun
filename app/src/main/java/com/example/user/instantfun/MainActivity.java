package com.example.user.instantfun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewSubjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupSimpleList();


    }

    private void setupSimpleList() {
        // Actual data
        String[] data = {"COMBO BREAKER","DARTH VADER","DOH","FATALITY","GAAAAY","HADOUKEN","HOMER BOCADILLO","I´M BATMAN","IT´S A TRAP","KAMEHAMEHA","NYANCAT","STAR WARS NOOOOO"};

        List<String> subjectList = new ArrayList<String>(Arrays.asList(data));
        ArrayAdapter listViewAdapter =
                new ArrayAdapter<String>(
                        MainActivity.this, // Context: this activity
                        R.layout.activity_list_item, // ID of the listView
                        R.id.textViewItem, // ID of the textView insite
                        subjectList);

        ListView listViewSubjects = (ListView) findViewById(R.id.listViewSubjects);
        listViewSubjects.setAdapter(listViewAdapter);


        listViewSubjects.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.combo_breaker);
                    mp.start();
                }else if(position == 1){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.darth_vader);
                    mp.start();
                }else if(position == 2){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.doh);
                    mp.start();
                }else if(position == 3){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fatality);
                    mp.start();
                }else if(position == 4){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.gaaaay);
                    mp.start();
                }else if(position == 5){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.hadouken);
                    mp.start();
                }else if(position == 6){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.homer_bocadillo);
                    mp.start();
                }else if(position == 7){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.im_batman);
                    mp.start();
                }else if(position == 8){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.its_a_trap);
                    mp.start();
                }else if(position == 9){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.kamehameha);
                    mp.start();
                }else if(position == 10){
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.nyancat);
                    mp.start();
                }else{
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.star_wars_noooo);
                    mp.start();
                }

            }
        });

    }


}
