package efrei.net.tripservice.web;

import efrei.net.tripservice.data.Trip;
import efrei.net.tripservice.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class TripController {
    private TripService tripService;

    @Autowired
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping("/trips")
    public List<Trip> getTrips() {
        return tripService.getTripList();
    }

    @PostMapping("/trip")
    public ResponseEntity<Trip> addTrip(@RequestBody Trip trip) throws URISyntaxException {
        tripService.addTrip(trip);
        return ResponseEntity.created(new URI("/trip/" + trip.getTripReference())).body(trip);
    }
}
