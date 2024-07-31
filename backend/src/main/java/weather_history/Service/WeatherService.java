package weather_history.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weather_history.DTO.WeatherDTO;
import weather_history.Mapper.WeatherMapper;
import weather_history.Model.WeatherEntity;
import weather_history.Repository.WeatherRepository;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    // add weather data
    public WeatherDTO addWeather(WeatherDTO weatherDTO) {
        WeatherEntity newWeatherEntity = WeatherMapper.mapToWeatherEntity(weatherDTO);
        weatherRepository.save(newWeatherEntity);
        return weatherDTO;
    }

    // get all weather data
    public List<WeatherEntity> allWeather() {
        List<WeatherEntity> allWeather = weatherRepository.findAll();
        return allWeather;
    }

    // get weather by id
    public WeatherDTO getWeatherById(Long id) {
        WeatherEntity specificWeather = weatherRepository.findById(id).orElseThrow(() -> new RuntimeException("Weather Data Not Found"));
        WeatherDTO specificWeatherDTO = WeatherMapper.mapToWeatherDTO(specificWeather);
        return specificWeatherDTO;
    }

    // delete weather by id
    public WeatherDTO deleteWeather(Long id) {
        WeatherEntity deletedWeather = weatherRepository.findById(id).orElseThrow(() -> new RuntimeException("Weather Data Not Found"));
        WeatherDTO deletedWeatherDTO = WeatherMapper.mapToWeatherDTO(deletedWeather );
        weatherRepository.deleteById(id);
        return deletedWeatherDTO;
    }
}
