package com.example.matthew.snaptrav2;

public class Station {

    String name;
    int timeScheduled;
    int timeExpected;
    int minutes;

    public Station(String name, int timeScheduled)
    {
        this.name = name;
        this.timeScheduled = timeScheduled;
        this.timeExpected = timeScheduled;
    }

    public int getDifference()
    {
        return timeExpected - timeScheduled;
    }

    public int getHour(int time)
    {
        if(time > 780)
        {
            return (time/60)-12;
        }
        return time/60;
    }

    public int getMinute(int time)
    {
        return time%60;
    }

    public String getPeriod(int time)
    {
        if(time > 720){
            return "P.M.";
        }
        return "A.M.";
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getTimeScheduled() {
        return timeScheduled;
    }

    public void setTimeScheduled(int timeScheduled) {
        this.timeScheduled = timeScheduled;
    }

    public int getTimeExpected() {
        return timeExpected;
    }

    public void setTimeExpected(int timeExpected) {
        this.timeExpected = timeExpected;
    }

}
