package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class CateringService{
    public final int PRICE_PER_PERSON = 35;
    private int nrInvitati;

    CateringService() {
    }

    public int totalPrice(){
        return 35*PRICE_PER_PERSON;
    }
    public boolean bigEvent(){
        return nrInvitati > 50;
    }



    public int getNrInvitati() {
        return nrInvitati;
    }

    public void setNrInvitati(int nrInvitati) {
        this.nrInvitati = nrInvitati;
    }


}
