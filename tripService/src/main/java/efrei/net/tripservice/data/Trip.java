package efrei.net.tripservice.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "trips")
public class Trip {
    @Id
    private String tripReference;
    private String destination;
    private int price;

    @OneToMany(mappedBy = "trip", fetch = FetchType.LAZY)
    private List<Dates> dates;

    public Trip(String destination, String tripReference, int price) {
        this.destination = destination;
        this.tripReference = tripReference;
        this.price = price;
    }

    public Trip() {

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
