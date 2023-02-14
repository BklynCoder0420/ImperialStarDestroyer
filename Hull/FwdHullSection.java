package Hull;

import ISD.*;
public class FwdHullSection extends HullSection {
    
    private String HullType = "Fwd";
    private String ISD1 = "Imperial_I";

    public FwdHullSection(String StarDestroyerType) {
        //super("Fwd", "Imperial_I", 900, 100, 75, 350);
        super("Fwd", "Imperial_I", 900, 100, 75, 350);
        if(getStarDestroyerType().equals(ISD1)) {
            setHullType("Fwd");
            setLength(900);
            setHeight(100);
            setWidth(75);
            setWeight(350);
        }
        else {
            setHullType("Fwd");
            setLength(900);
            setHeight(100);
            setWidth(200);
            setWeight(400);
        }
    }

/* 
    public FwdHullSection(String ISDI) {
        super("Fwd", "Imperial_II", 900, 100, 75, 350);
    }
*/
    public String getHullType() {
        return HullType;
    }

    public void setHullType(String hullType) {
        HullType = hullType;
    }
}
