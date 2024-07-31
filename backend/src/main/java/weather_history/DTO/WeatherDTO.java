package weather_history.DTO;

import lombok.Data;

@Data
public class WeatherDTO {
    private Long id;
    private String date;
    private String city;
    private String weather;
}
