package weather_history.Mapper;

import weather_history.DTO.WeatherDTO;
import weather_history.Model.WeatherEntity;

public class WeatherMapper {
    public static WeatherDTO mapToWeatherDTO(WeatherEntity weatherEntity) {
        WeatherDTO weatherDTO = new WeatherDTO();
        weatherDTO.setId(weatherEntity.getId());
        weatherDTO.setDate(weatherEntity.getDate());
        weatherDTO.setCity(weatherEntity.getCity());
        weatherDTO.setCountry(weatherEntity.getCountry());
        weatherDTO.setWeather(weatherEntity.getWeather());
        weatherDTO.setDescription(weatherEntity.getDescription());
        weatherDTO.setTemperature(weatherEntity.getTemperature());
        return weatherDTO;
    }
    public static WeatherEntity mapToWeatherEntity(WeatherDTO weatherDTO) {
        WeatherEntity weatherEntity = new WeatherEntity();
        weatherEntity.setId(weatherDTO.getId());
        weatherEntity.setDate(weatherDTO.getDate());
        weatherEntity.setCity(weatherDTO.getCity());
        weatherEntity.setCountry(weatherDTO.getCountry());
        weatherEntity.setWeather(weatherDTO.getWeather());
        weatherEntity.setDescription(weatherDTO.getDescription());
        weatherEntity.setTemperature(weatherDTO.getTemperature());
        return weatherEntity;
    }
}
