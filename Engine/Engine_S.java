package Engine;

public class Engine_S extends ShipEngine {
    
    String EngineType = "S";
    private String ISD1 = "Imperial_I";
    //private String starDestroyerType;

    public Engine_S(String StarDestroyerType) {
        super("S", "Imperial_I", 100, 50, 8000000, 100);
        if(getStarDestroyerType().equals(StarDestroyerType)) {
            setEngineType("S");
            setLength(100);
            setHeight(50);
            setPower(8000000);
            setWeight(100);
        }
        else {
            setEngineType("S");
            setLength(115);
            setHeight(60);
            setPower(9000000);
            setWeight(100);
        }
    }

    public String getEngineType() {
        return EngineType;
    }

    public void setEngineType(String engineType) {
        EngineType = engineType;
    }
}
