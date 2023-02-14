package Deck;

public class MainDeck extends ShipDeck {
    
    private String DeckType;
    private String ISD1 = "Imperial_I";

    public MainDeck(String StarDestroyerType) {
        super("Main Deck", "Imperial_I", 600, 50, 400, 250);
        if(getStarDestroyerType().equals(ISD1)) {
            setDeckType("Main Deck");
            setLength(600);
            setHeight(50);
            setWidth(400);
            setWeight(250);
        }
        else {
            setDeckType("Main Deck");
            setLength(700);
            setHeight(56);
            setWidth(450);
            setWeight(300);
        }
    }

    public String getDeckType() {
        return DeckType;
    }

    public void setDeckType(String deckType) {
        DeckType = deckType;
    }
}
