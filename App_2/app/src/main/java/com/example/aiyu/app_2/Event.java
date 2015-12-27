package com.example.aiyu.app_2;

/**
 * Created by Aiyu on 12/25/2015.
 */
public class Event {

    //Data List

    public enum location{
        OBS,Burke,Junker,Reed,Lawrence
    };// Enum here for better searching and sorting in DB

    //Data List
    int eventId;//Auto Generated (though I havent figure out how to do this)
    String eName,eTime,description;
    location eLoc;

    public void setEventId(int id){eventId=id;}
    public int getEventId(){return eventId;}

    public void setEName(String name){eName=name;}
    public String getEname(){return eName;}

    public void setELoc(String loc){eLoc=location.valueOf(loc);}
    public String getELoc(){return eLoc.name();}

    public void setETime(String time){eTime=time;}
    public String getETime(){return eTime;}

    public void setDescription(String des){description=des;}
    public String getDescription(){return description;}


}
