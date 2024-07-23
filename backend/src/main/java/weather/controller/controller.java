package weather.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import weather.DTO.DTO;
import weather.service.service;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin
public class controller {
    private service service;

    public controller(service service) {
        this.service = service;
    }

    // get all users
    @GetMapping
    public ResponseEntity<List<DTO>> getAllCities() {
        List<DTO> cities = service.getAllCities();
        return ResponseEntity.ok(cities);
    }

    // add user
    @PostMapping("/add")
    public ResponseEntity<DTO> addCity(@RequestBody DTO DTO) {
        return new ResponseEntity<>(service.addCity(DTO), HttpStatus.CREATED);
    }

    // delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCity(@PathVariable Long id) {
        service.deleteCity(id);
        return ResponseEntity.ok("City Deleted!");
    }
}