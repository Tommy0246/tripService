package efrei.net.tripservice.web;

import efrei.net.tripservice.data.Trip;
import efrei.net.tripservice.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    @Autowired
    private TripService tripService;

    @GetMapping("/")
    public ResponseEntity<List<Trip>> getAllTrips() {
        List<Trip> trips = tripService.getAllTrips();
        return new ResponseEntity<>(trips, HttpStatus.OK);  // Retourner la liste des trips avec un code 200
    }

    @PostMapping("/")
    public ResponseEntity<Trip> addTrip(@RequestBody Trip trip) {
        Trip newTrip = tripService.addTrip(trip);
        return new ResponseEntity<>(newTrip, HttpStatus.CREATED);  // Retourner le nouveau trip avec un code 201
    }
}
