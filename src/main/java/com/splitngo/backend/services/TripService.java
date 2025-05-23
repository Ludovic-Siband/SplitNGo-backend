package com.splitngo.backend.services;

import com.splitngo.backend.clients.TripClient;
import com.splitngo.backend.dtos.TripDTO;
import com.splitngo.backend.dtos.TripDetailDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    private final TripClient tripClient;

    public TripService(TripClient tripClient) {
        this.tripClient = tripClient;
    }

    /**
     * This method retrieves all trips from the TripClient.
     *
     * @return List of TripDTO objects representing all trips.
     */
    public List<TripDTO> getAllTrips() {
        return tripClient.getAllTrips();
    }

    /**
     * This method retrieves a single trip by its ID from the TripClient.
     *
     * @param id The ID of the trip to retrieve.
     * @return The TripDTO representing the requested trip.
     */
    public TripDetailDTO getTripById(Integer id) {
        return tripClient.getTripByID(id);
    }
}
