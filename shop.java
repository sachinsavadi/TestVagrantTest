package sachin;

import java.util.*;
class shop
{
    public static void main(String args[])
    {
       
        int Wallet,umbrella,Cigarette,honey, LeatherWALLET, Cigarett;
        int Total;
        Wallet=(1100*18)/100;
        umbrella=(900*4*12)/100;
        Cigarette=(200*3*28)/100;
        honey=(100*2);
        if(umbrella>Wallet&&umbrella>Cigarette&&umbrella>honey)
        System.out.println("product for highest GST amount Is Umbrella with amount calculated="+umbrella);
        else
        System.out.println("other commodity");
        LeatherWALLET=(1100*5)/100;
        Cigarett=(900*5)/100;
        Total=(1100- LeatherWALLET)+(900- Cigarett)+200+100;
        System.out.println("total amount to paid to the shopkeeper="+Total);
    }
}