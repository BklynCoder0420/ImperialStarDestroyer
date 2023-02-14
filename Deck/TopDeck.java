package Deck;

import ISD.*;

public class TopDeck extends ShipDeck {
    
    private String DeckType;
    private String ISD1 = "Imperial_I";

    public TopDeck(String StarDestroyerType) {
        super("Top Deck", "Imperial_I", 300, 30, 250, 125);
        if(getStarDestroyerType().equals("Imperial_I")) {
            setDeckType("Top Deck");
            setLength(300);
            setHeight(30);
            setWidth(250);
            setWeight(125);
        }
        else {
            setDeckType("Top Deck");
            setLength(350);
            setHeight(34);
            setWidth(300);
            setWeight(150);
        }
    }

    public String getDeckType() {
        return DeckType;
    }

    public void setDeckType(String deckType) {
        DeckType = deckType;
    }
}
