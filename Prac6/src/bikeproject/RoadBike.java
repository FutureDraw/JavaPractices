package bikeproject;

public class RoadBike extends Bike implements RoadParts{
	
	private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 20);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor

	@Override
	public void setTyreWidth(int newValue) {
		this.tyreWidth = newValue;
	}

	@Override
	public void setPostHeight(int newValue) {

	}

	@Override
	public int getTyreWidth() {
		return tyreWidth;
	}

	@Override
	public int getPostHeight() {
		return postHeight;
	}

	public void printDescription()
	{
		super.printDescription();
		System.out.println("This Roadbike bike has " + getTyreWidth() + "mm tyres and a post height of " + getPostHeight() + ".");
	}//end method printDescription
}//end class RoadBike
