package com.splitngo.backend.clients;

import com.splitngo.backend.dtos.TripDTO;
import com.splitngo.backend.dtos.TripDetailDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "tripClient", url = "${trip.api.url}")
public interface TripClient {

    @GetMapping("/api/trips")
    List<TripDTO> getAllTrips();

    @GetMapping("/api/trips/{id}")
    TripDetailDTO getTripByID(@PathVariable("id") Integer id);

}
