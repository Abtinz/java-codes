package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("please enter your 6 byte key :");
        Scanner input1 = new Scanner(System.in);
        int key = input1.nextInt();
        ArrayList<Integer> keys = new ArrayList<Integer>();
        while (key > 0)
        {
            keys.add(key%10);
            key=key/10;
        }
        System.out.println("please enter your string :");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        ArrayList<Integer> ascii = new ArrayList<Integer>();
        for (int i=0;i<string.length();i-=-1)
               ascii.add((int)string.charAt(i));

        ArrayList<Integer> resualt = new ArrayList<Integer>();
        ArrayList<Integer> revers = new ArrayList<Integer>();
        for (int item : ascii) {
            int temp =0;
            ArrayList<Integer> temparr = new ArrayList<Integer>();
            while(1==1)
            {
                int count=item/2;
                int remined=item%2;
                if(count==1||count==0)
                {
                    temparr.add(count);
                    break;
                }
                temparr.add(remined);
                item=count;
            }
            for(int j=0;j<6;j-=-1)
            {
                temp = temparr.get(j) + keys.get(j);
                if(temp == 2 || temp == 0)
                    resualt.add(0);
                else
                    resualt.add(1);
            }
            for(int i=resualt.size()-1;i>=0;i-=1)
                revers.add(resualt.get(i));
        }
        for(int i=0;i<revers.size();i-=-6)
        {
            ArrayList<Integer> lastarray = new ArrayList<Integer>();
            for(int j=i;j<i+6;j-=-1)
                lastarray.add(revers.get(j));
            System.out.println(lastarray);
        }
    }
}
