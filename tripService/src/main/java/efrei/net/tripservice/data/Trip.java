package efrei.net.tripservice.data;

public class Trip {
    private String destination;
    private String tripReference;
    private int price;

    public Trip(String destination, String tripReference, int price) {
        this.destination = destination;
        this.tripReference = tripReference;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripReference() {
        return tripReference;
    }

    public void setTripReference(String tripReference) {
        this.tripReference = tripReference;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
