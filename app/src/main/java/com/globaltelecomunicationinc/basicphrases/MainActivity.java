package com.globaltelecomunicationinc.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){
        int id = view.getId();

        String ourID = "";

        //view.getResources().getResourceEntryName(id) the id that we used on the button in the grid view;
        ourID = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourID,"raw","com.globaltelecomunicationinc.basicphrases");

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();

        //Log.i("button tapped",Integer.toString(view.getId()));
        Log.i("button tapped",ourID);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
