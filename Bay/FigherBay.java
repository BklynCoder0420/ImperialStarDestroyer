package Bay;

import java.util.*;
import Enums.*;
public abstract class FigherBay extends Bay {
    
    private String bayType = "Tie Fighter";
    private ArrayList<TieFighter> Slots;

    public FigherBay(String bayName, String bayID) {
        super(bayName, bayID, "Tie Figher");
        this.Slots = new ArrayList<TieFighter>();
    }

    public ArrayList<TieFighter> getSlots() {
        return Slots;
    }

    public void setSlots(ArrayList<TieFighter> slots) {
        Slots = slots;
    }

    public abstract void displayTieFighters();
}
