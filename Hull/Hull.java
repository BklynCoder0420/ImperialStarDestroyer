package Hull;

import ISD.*;

public class Hull {
    
    private String IDNumber;
    private FwdHullSection SectionFWD;
    private AftHullSection SectionAFT;
    private String StarDestroyerType; 

    public Hull(String iDNumber, String StarDestroyerType) {
        this.IDNumber = iDNumber;
        this.StarDestroyerType = StarDestroyerType;
        this.SectionFWD = new FwdHullSection(StarDestroyerType);
        this.SectionAFT = new AftHullSection(StarDestroyerType);
    }

    public String getStarDestroyerType() {
        return StarDestroyerType;
    }

    public void setStarDestroyerType(String starDestroyerType) {
        this.StarDestroyerType = starDestroyerType;
    }
    
    public String getIDNumber() {
        if(this.StarDestroyerType == "Imperial_I")
        return "1";
        else
        return "2";
    }

    public void setIDNumber(String iDNumber) {
        this.IDNumber = iDNumber;
    }
 
    public FwdHullSection getSectionFWD() {
        return SectionFWD;
    }

    public void setSectionFWD(FwdHullSection sectionFWD) {
        //sectionFWD = new FwdHullSection(StarDestroyerType);
        this.SectionFWD = sectionFWD;
    }

    public AftHullSection getSectionAFT() {
        return SectionAFT;
    }

    public void setSectionAFT(AftHullSection sectionAFT) {
        this.SectionAFT = sectionAFT;
    }
    public void displayHullSpecs() {
        System.out.println("______Hull Specifications______" + "\nHull: H" + getIDNumber() +
        "\nForward Hull: HullType: " + SectionFWD.getHullType() + "\tLength: " + SectionFWD.getLength() + "\tHeight: " + SectionFWD.getHeight() + "\tWidth: " + SectionFWD.getWidth() + "\tWeight: " + SectionFWD.getWeight() +
        "\nAft Hull: HullType: " + SectionAFT.getHullType() + "\t\tLength: " + SectionAFT.getLength() + "\tHeight: " + SectionAFT.getHeight() + "\tWidth: " + SectionAFT.getWidth() + "\tWeight: " + SectionAFT.getWeight());
    }
}
