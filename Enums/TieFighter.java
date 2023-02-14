package Enums;

import java.util.*;
public enum TieFighter {
    
    TieFighter_S("Standard Fighter", 15, 5, "NOT_READY"), 
    TieFighter_H("Heavy Fighter", 20, 7, "NOT_READY"), 
    TieFighter_I("Stealth Fighter", 10, 6, "NOT_READY");

    private final String TF_type;
    private final double TF_length;
    private final double TF_width;
    private final Status TF_status;

    private TieFighter (String TF_type, double TF_length, double TF_width, Status TF_status) {
        this.TF_type = TF_type;
        this.TF_length = TF_length;
        this.TF_width = TF_width;
        this.TF_status = TF_status;
    }

    public String getTFtype() {
        return TF_type;
    }


    public double getTFlength() {
        return TF_length;
    }


    public double getTFwidth() {
        return TF_width;
    }

    public Status getTFstatus() {
        return TF_status;
    }

    public void ready() {
        this.TF_status = Status.READY;
    }

    public void display() {
        System.out.println("Tie Fighter" + "\nFighter Type: " + getTFtype() + "\nLength: " + getTFlength() + "\nWidth: " + getTFwidth() + "\nStatus: " + getTFstatus());
    }
}
