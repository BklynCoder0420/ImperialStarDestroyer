package Hull;

public abstract class HullSection {
    
    private String HullType;
    private String StarDestroyerType;
    private int Length;
    private int Height;
    private int Width;
    private int Weight;

    public HullSection(String hullType, String starDestroyerType, int length, int height, int width, int weight) {
        this.HullType = hullType;
        this.StarDestroyerType = new String(starDestroyerType);
        this.Length = length;
        this.Height = height;
        this.Width = width;
        this.Weight = weight;
    }

    public HullSection() {
        
    }

    public String getHullType() {
        return HullType;
    }

    public void setHullType(String hullType) {
        HullType = hullType;
    }

    public String getStarDestroyerType() {
        return StarDestroyerType;
    }

    public void setStarDestroyerType(String starDestroyerType) {
        starDestroyerType = new String(starDestroyerType);
        this.StarDestroyerType = starDestroyerType;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public String HullInfo() {
        return "Hello";
    }
}
