package bikeproject;

public interface MountainParts {
    final public String TERRAIN = "off_road";
    public void setSuspension(String newValue);
    public void setType(String newValue);

    public String getSuspension();
    public String getType();
}
