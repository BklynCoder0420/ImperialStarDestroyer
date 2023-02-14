package ISD;

import Interfaces.*;
import Hull.*;
import Deck.*;
import Engine.*;
import Bay.*;

public class Imperial_II extends StarDestroyer implements Maneuvers, Docks, Launches{
    
    private String ShpClass;
    private int ShpCrew;

    public Imperial_II(String ShpNumber, String ShpName) {
        super(ShpNumber, ShpName);
        this.setShpClass("Imperial_II");
        this.ShpCrew = 12000;
        this.setShpHulls(new Hull(getShpNumber(), getShpClass()));
        this.setShpDecks(new Deck(getShpNumber(), getShpClass()));
        this.setShpEngines(new Engine(getShpNumber(), getShpClass()));
        this.setStarboardBay(new SBay(getShpNumber(), getShpClass()));
        this.setPortBay(new PBay(getShpNumber(), getShpClass()));
        this.setForwardBay(new FBay(getShpNumber(), getShpClass()));
    }

    @Override
    public boolean launchFighters() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean docks(String D) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean undocks(String D) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigatesToPosition(String p) {
        // TODO Auto-generated method stub
        
    }

   
    @Override
    public void displayInfo() {
        System.out.println("______Ship Specification______" + "\nShip Number: " + getShpNumber() + "\tShip Type: " + getShpType() + "\tShip Name: " 
        + getShpName() + "\tShip Class: " +  getShpClass() + "\tShip Crew: " + getShpCrew());
        hull.setStarDestroyerType(getShpClass());
        hull.displayHullSpecs();
        deck.setStarDestroyerType(getShpClass());
        deck.displayDeckSpecs();
        engines.setStarDestroyerType(getShpClass());
        engines.displayEngineSpecs();
        sbay.setStarDestroyerType(getShpClass());
        sbay.displayBayInfo();
        fbay.setStarDestroyerType(getShpClass());
        fbay.displayBayInfo();;
        pbay.setStarDestroyerType(getShpClass());
        pbay.displayBayInfo();
    }
}
