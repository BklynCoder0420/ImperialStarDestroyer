package Engine;

import ISD.*;
import java.util.*;
public class Engine {
    
    private String IDNumber;
    private String starDestroyerType;
    private ShipEngine[] Engines = new ShipEngine[3];

    public Engine(String iDNumber, String StarDestroyerType) {
        this.IDNumber = iDNumber;
        this.starDestroyerType = StarDestroyerType;
        this.Engines[0] = new Engine_S(this.starDestroyerType);
        this.Engines[1] = new Engine_C(this.starDestroyerType);
        this.Engines[2] = new Engine_S(this.starDestroyerType);
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
        this.IDNumber = iDNumber;
    }

    public ShipEngine[] getEngines() {
        Engines[0] = new Engine_S(this.starDestroyerType);
        return Engines;
    }

    public void setEngines(ShipEngine[] engines) {
        this.Engines = engines;
    }

    public void displayEngineSpecs() {
        System.out.println("______Engine Specifications______" + "\nEngines: E" + this.getIDNumber() + 
        "\nStarboard Engine: Engine Type: " + Engines[0].getEngineType() + "  Length: " + Engines[0].getLength() + "\tHeight: " + Engines[0].getHeight() + "   Power: " + Engines[0].getPower() + "\tWeight: " + Engines[0].getWeight() +
        "\nCenter Engine: Engine Type: " + Engines[1].getEngineType() + "\t  Length: " + Engines[1].getLength() + "\tHeight: " + Engines[1].getHeight() + "   Power: " + Engines[1].getPower() + "\tWeight: " + Engines[1].getWeight() +
        "\nPort Engine: Engine Type: " + Engines[2].getEngineType() + "\t  Length: " + Engines[2].getLength() + "\tHeight: " + Engines[2].getHeight() + "   Power: " + Engines[2].getPower() + "\tWeight: " + Engines[2].getWeight());
    }
}
