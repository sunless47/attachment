package weather_history.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import weather_history.Model.WeatherEntity;
import weather_history.Repository.WeatherRepository;

import java.util.List;

@RestController
@CrossOrigin
public class WeatherController {
    @Autowired
    private WeatherRepository weatherRepository;

    // get all weather data
    @GetMapping("/api")
    public List<WeatherEntity> getAllWeather() {
        List<WeatherEntity> weather = weatherRepository.findAll();
        return weather;
    }

    // add weather data
    @PostMapping("/api/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addWeather(@RequestBody WeatherEntity weatherEntity) {
        weatherRepository.save(weatherEntity);
    }

    // delete weather data
    @DeleteMapping("/api/{id}")
    public void deleteWeather(@PathVariable Long id) {
        weatherRepository.deleteById(id);
    }
}
