package efrei.net.tripservice.service;

import efrei.net.tripservice.data.Trip;
import efrei.net.tripservice.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public TripService() {}

    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    public Trip addTrip(Trip trip) {
        return tripRepository.save(trip); // Sauvegarde un nouveau trip dans la base de données
    }
}
