package weather_history.Mapper;

import weather_history.DTO.WeatherDTO;
import weather_history.Model.WeatherEntity;

public class WeatherMapper {
    public static WeatherDTO mapToWeatherDTO(WeatherEntity weatherEntity) {
        WeatherDTO weatherDTO = new WeatherDTO();
        weatherDTO.setId(weatherEntity.getId());
        weatherDTO.setDate(weatherEntity.getDate());
        weatherDTO.setCity(weatherEntity.getCity());
        weatherDTO.setWeather(weatherEntity.getWeather());
        return weatherDTO;
    }
    public static WeatherEntity mapToWeatherEntity(WeatherDTO weatherDTO) {
        WeatherEntity weatherEntity = new WeatherEntity();
        weatherEntity.setId(weatherDTO.getId());
        weatherEntity.setDate(weatherDTO.getDate());
        weatherEntity.setCity(weatherDTO.getCity());
        weatherEntity.setWeather(weatherDTO.getWeather());
        return weatherEntity;
    }
}
