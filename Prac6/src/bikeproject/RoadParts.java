package bikeproject;

public interface RoadParts {
    final public String terrain = "track_racing";

    public void setTyreWidth(int newValue);
    public void setPostHeight(int newValue);

    public int getTyreWidth();
    public int getPostHeight();
}
