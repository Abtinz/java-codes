package com.company;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String display;

    //کانستراتور
    public ClockDisplay()
    {
        hours=new NumberDisplay(24);
        minutes=new NumberDisplay(60);
        updateDisplay();
    }

    //کانستراتور
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    //متود ست تایم برای عدد دهی به ساعت و دقیقه
    public void setTime(int hour,int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }
    public void updateDisplay()
    {
        display=hours.getDisplay() + ":" + minutes.getDisplay();
    }
    public String getTime()
    {
        return display;
    }
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }
}



