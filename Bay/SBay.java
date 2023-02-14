package Bay;

import Enums.*;
public class SBay extends FigherBay{

    private int Capacity;
    private String StarDestroyerType;

    public SBay(String bayName, String bayID) {
        super("Starboard Bay", "SB-1");
        setBayType("Tie Fighter S");
        this.Capacity = 36;
    }

    public String getStarDestroyerType() {
        return StarDestroyerType;
    }

    public void setStarDestroyerType(String starDestroyerType) {
        this.StarDestroyerType = starDestroyerType;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public void displayTieFighters() {
        System.out.println("Tie Fighter" + "\nFighter Type: " + TieFighter.TieFighter_H.getTFtype() + "\nLength: " + TieFighter.TieFighter_H.getTFlength() + "\nWidth: " + TieFighter.TieFighter_H.getTFwidth() + "\nStatus: " + TieFighter.TieFighter_H.getTFstatus());
    }

    @Override
    public void displayBayInfo() {
        System.out.println("______Fighter Bay Specifications______" + "\nStarboard Fighter Bay ID: " + this.getBayID() + "\n" + this.getBayName() + "\n" + this.getBayID() + "\n" + this.getBayType() + "\nFighter Capacity: " + this.Capacity);
    }  
}