package Factory;

import ISD.*;
public class ISD2_Factory  extends ISDFactory{
    
    private String buildType;

    public ISD2_Factory(String name) {
        super(name);
        this.buildType = "Imperial II";
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }
    
    //@Override
    public boolean buildISDs(int count) {
        boolean retVal = false;
        for(int i = 0; i < count; i++) {
            retVal = true;
        }
        return retVal;
    }

    public void displayISDs(int count) {
        Imperial_II[] IList = new Imperial_II[count];
        for(int i = 0; i < count; i++) {
            int ISD2SN = 901 + i;
            int ISD2Name = 1 + i;
            String I2ShpNumber = "ISD-" + Integer.toString(ISD2SN);
            String I2ShpName = "SD-00" + Integer.toString(ISD2Name) + "_II";
            IList[i] = new Imperial_II(I2ShpNumber, I2ShpName);
            IList[i].displayInfo();
        }
    }
}
