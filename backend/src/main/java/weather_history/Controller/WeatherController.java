package weather_history.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import weather_history.DTO.WeatherDTO;
import weather_history.Model.WeatherEntity;
import weather_history.Service.WeatherService;

import java.util.List;

@RestController
@CrossOrigin
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    // get all weather data
    @GetMapping("/api")
    public List<WeatherEntity> allWeather() {
        List<WeatherEntity> allWeather = weatherService.allWeather();
        return allWeather;
    }

    // add weather data
    @PostMapping("/api/add")
    public ResponseEntity<WeatherDTO> addWeather(@RequestBody WeatherDTO weatherDTO) {
        WeatherDTO addedWeather = weatherService.addWeather(weatherDTO);
        return new ResponseEntity<>(addedWeather, HttpStatus.CREATED);
    }

    // id-specific weather data
    @GetMapping("/api/{id}")
    public ResponseEntity<WeatherDTO> getWeatherById(@PathVariable Long id) {
        WeatherDTO specificWeather = weatherService.getWeatherById(id);
        return new ResponseEntity<>(specificWeather, HttpStatus.OK);
    }

    // delete weather data
    @DeleteMapping("/api/delete/{id}")
    public ResponseEntity<WeatherDTO> deleteWeather(@PathVariable Long id) {
        WeatherDTO deleteWeather = weatherService.deleteWeather(id);
        return new ResponseEntity<>(deleteWeather, HttpStatus.OK);
    }
}