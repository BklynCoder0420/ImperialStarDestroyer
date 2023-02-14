package Deck;

public class Bridge extends ShipDeck {
    
    private String DeckType;
    private String ISD1 = "Imperial_I";

    public Bridge(String StarDestroyerType) {
        super("Bridge", "Imperial_I", 150, 20, 100, 75);
        if(getStarDestroyerType().equals(ISD1)) {
            setDeckType("Bridge");
            setLength(150);
            setHeight(20);
            setWidth(100);
            setWeight(75);
        }
        else {
            setDeckType("Bridge");
            setLength(200);
            setHeight(22);
            setWidth(150);
            setWeight(100);
        }
    }

    public String getDeckType() {
        return DeckType;
    }

    public void setDeckType(String deckType) {
        DeckType = deckType;
    }
}
