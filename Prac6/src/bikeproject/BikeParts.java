package bikeproject;

public interface BikeParts {
    final String companyName = "Trek";
    public default String getCompanyName(){
        return companyName;
    }
}
