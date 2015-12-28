package com.example.aiyu.app_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Aiyu on 12/28/2015.
 */
public class CreatePublicEvent extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_public_event);
    }

    public void onCreateClick(View v){

        EventDatabaseHelper dbHelper=new EventDatabaseHelper(this);

        if(v.getId()==R.id.CreateButton){

            //Read data from layout
            EditText name = (EditText)findViewById(R.id.TFeventName);
            EditText loc = (EditText)findViewById(R.id.TFeventLoc);
            EditText description = (EditText)findViewById(R.id.TFeventDescription);
            EditText time = (EditText)findViewById(R.id.TFeventDescription);//TBC

            //Convert data to required datatype
            String nameStr = name.getText().toString();
            String locStr = loc.getText().toString();
            String dscrptStr = description.getText().toString();
            String timeStr = time.getText().toString();//TBC

            //Insert new data into DB
            Event e = new Event();
            e.setEName(nameStr);
            e.setELoc(locStr); //TBC, I want loc saved be exactly Burke or OBS
            e.setETime(timeStr);
            e.setDescription(dscrptStr);

            dbHelper.insertEvent(e);


        }
    }
}
