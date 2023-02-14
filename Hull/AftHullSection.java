package Hull;

public class AftHullSection extends HullSection {
    
    private String HullType;
    private String ISD1 = "Imperial_I";

    public AftHullSection(String StarDestroyerType) {
        super("Aft", "Imperial_I", 700, 200, 325, 550);
        if(getStarDestroyerType().equals(ISD1)) {
            setHullType("Aft");
            setLength(700);
            setHeight(200);
            setWidth(325);
            setWeight(550);
        }
        else {
            setHullType("Aft");
            setLength(900);
            setHeight(275);
            setWidth(300);
            setWeight(700);
        }
    }
    
    public String getHullType() {
        return HullType;
    }

    public void setHullType(String hullType) {
        HullType = hullType;
    }
}
