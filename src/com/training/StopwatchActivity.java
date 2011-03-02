package com.training;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Chronometer;
import android.widget.Button;


public class StopwatchActivity extends Activity
{
    Chronometer mChronometer;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sw_main);

        mChronometer = (Chronometer)findViewById(R.id.chronometer);
        
        Button button = (Button)findViewById(R.id.btnStartStop);
        button.setOnClickListener( mStartListener );
        
    }

    View.OnClickListener mStartListener = new OnClickListener()
    {
        public void onClick(View v)
        {
            Button button = (Button)findViewById(R.id.btnStartStop);
            button.setOnClickListener( mStopListener );
            button.setText(R.string.btn_Stop);
            
            mChronometer.start();
        }
    };
    
    View.OnClickListener mStopListener = new OnClickListener()
    {
        public void onClick(View v)
        {
            Button button = (Button)findViewById(R.id.btnStartStop);
            button.setOnClickListener( mStartListener );
            button.setText(R.string.btn_Start);

            mChronometer.stop();
        }
    };
}