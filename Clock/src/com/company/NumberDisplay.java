package com.company;

public class NumberDisplay
{
    private int limit;
    private int value;

    //کانستراکتور
    public NumberDisplay(int limitOfNumber)
    {
        limit=limitOfNumber;
        value=0;
    }

    //متود گرفتن value
    public void setValue(int input)
    {
        if(input>0 && input<value)
            value=input;
    }

    // گتر value
    public int getValue()
    {
        return value;
    }
    // نمایش عدد
    public String getDisplay()
    {
        if(value<10)
            return "0" + value;
        else
            return "" + value;
    }
    public void increment()
    {
        value = (value + 1) % limit;
    }

}

