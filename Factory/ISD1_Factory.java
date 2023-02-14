package Factory;

import java.util.*;

import Hull.Hull;
import ISD.*;
public class ISD1_Factory extends ISDFactory{
    
    private String buildType = "Imperial I";

    public ISD1_Factory(String name) {
        super(name);
        this.setDryDock(new ArrayList<StarDestroyer>());
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }
    
    //@Override
    public boolean buildISDs(int count) {
        for(int i = 0; i < count; i++) {
            int ISD1SN = 83 + i;
            int ISD1Name = 1 + i;
            String I1ShpNumber = "ISD-" + Integer.toString(ISD1SN);
            String I1ShpName = "SD-00" + Integer.toString(ISD1Name) + "_I";
            Imperial_I imp1 = new Imperial_I(I1ShpNumber, I1ShpName);
            this.getDryDock().add(imp1);
        }
        return true;
    }

    public void displayISDs(int count) {
        for(StarDestroyer s : this.getDryDock()) {
            s.displayInfo();
        }
    }
}
