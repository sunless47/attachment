package weather_history.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "favourite_cities")
public class WeatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Date")
    private String date;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "weather")
    private String weather;

    @Column(name = "description")
    private String description;

    @Column(name = "temperature")
    private String temperature;
}
