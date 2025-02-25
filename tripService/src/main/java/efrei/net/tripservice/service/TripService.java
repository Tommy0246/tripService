package efrei.net.tripservice.service;

import efrei.net.tripservice.data.Trip;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TripService {

    private List<Trip> tripList = new ArrayList<Trip>();

    public TripService() {
        tripList.add(new Trip("Paris", "REF1", 100));
        tripList.add(new Trip("London", "REF2", 200));
        tripList.add(new Trip("New York", "REF3", 300));
    }

    public List<Trip> getTripList() {
        return tripList;
    }

    public void addTrip(Trip trip) {
        this.tripList.add(trip);
    }
}
