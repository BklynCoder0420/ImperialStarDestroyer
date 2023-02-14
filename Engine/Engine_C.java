package Engine;

public class Engine_C extends ShipEngine {
    
    private String EngineType = "C";
    private String ISD1 = "Imperial_I";
    //private String starDestroyerType;

    public Engine_C(String StarDestroyerType) {
        super("C", "Imperial_I", 225, 75, 15000000, 125);
        if(getStarDestroyerType().equals(ISD1)) {
            setEngineType("C");
            setLength(225);
            setHeight(75);
            setPower(15000000);
            setWeight(125);
        }
        else if(StarDestroyerType == "Imperial_II") {
            setEngineType("C");
            setLength(275);
            setHeight(80);
            setPower(17000000);
            setWeight(125);
        }
    }

    public String getEngineType() {
        return EngineType;
    }

    public void setEngineType(String engineType) {
        EngineType = engineType;
    }
}
