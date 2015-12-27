package com.example.adminpc.testing;

/**
 * Created by Aiyu on 12/25/2015.
 */
public class Events {
    int eventId;//Auto Generated (though I havent figure out how to do this)
    String eName,eLoc,eTime,description;

    public void setEventId(int id){eventId=id;}
    public int getEventId(){return eventId;}

    public void setEName(String name){eName=name;}
    public String getEname(){return eName;}

    public void setELoc(String loc){eLoc=loc;}
    public String getELoc(){return eLoc;}

    public void setETime(String time){eTime=time;}
    public String getETime(){return eTime;}

    public void setDescription(String des){description=des;}
    public String getDescription(){return description;}


}
