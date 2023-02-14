package Deck;

import java.util.*;
import ISD.*;
public class Deck {
    
    private String IDNumber;
    private String starDestroyerType;
    private Bridge Deck_Bridge;
    private TopDeck Deck_Top;
    private MainDeck Deck_Main;

    public Deck(String iDNumber, String StarDestroyerType) {
        this.IDNumber = iDNumber;
        this.setStarDestroyerType(StarDestroyerType);
        this.setDeckBridge(new Bridge(StarDestroyerType));
        this.setDeckTop(new TopDeck(getStarDestroyerType()));
        this.setDeckMain(new MainDeck(StarDestroyerType));
    }

    public String getStarDestroyerType() {
        return starDestroyerType;
    }

    public void setStarDestroyerType(String StarDestroyerType) {
        this.starDestroyerType = StarDestroyerType;
    }
    
    public String getIDNumber() {
        if(this.starDestroyerType == "Imperial_I")
        return "1";
        else
        return "2";
    }

    public void setIDNumber(String iDNumber) {
        IDNumber = iDNumber;
    }

    public Bridge getDeckBridge() {
        return Deck_Bridge;
    }

    public void setDeckBridge(Bridge deck_Bridge) {
        this.Deck_Bridge = deck_Bridge;
    }

    public TopDeck getDeckTop() {
        return Deck_Top;
    }

    public void setDeckTop(TopDeck deck_Top) {
        this.Deck_Top = deck_Top;
    }

    public MainDeck getDeckMain() {
        return Deck_Main;
    }

    public void setDeckMain(MainDeck deck_Main) {
        this.Deck_Main = deck_Main;
    }

    public void displayDeckSpecs() {
        System.out.println("______Deck Specifications______" + "\nDeck: D" + getIDNumber() + 
        "\nBridge: Deck Type: " + Deck_Bridge.getDeckType() + "\tStar Destroyer Type: " + getStarDestroyerType() + "\t Length: " + Deck_Bridge.getLength() + "\tHeight: " + Deck_Bridge.getHeight() + "\tWidth: " + Deck_Bridge.getWidth() + "\tWeight: " + Deck_Bridge.getWeight() +
        "\nTop Deck: Deck Type: " + Deck_Top.getDeckType() + "\tStar Destroyer Type: " + this.starDestroyerType + "\t Length: " + Deck_Top.getLength() + "\tHeight: " + Deck_Top.getHeight() + "\tWidth: " + Deck_Top.getWidth() + "\tWeight: " + Deck_Top.getWeight() +
        "\nMain Deck: Deck Type: " + Deck_Main.getDeckType() + "\tStar Destroyer Type: " + this.starDestroyerType + "\t Length: " + Deck_Main.getLength() + "\tHeight: " + Deck_Main.getHeight() + "\tWidth: " + Deck_Main.getWidth() + "\tWeight: " + Deck_Main.getWeight());
    }
}
