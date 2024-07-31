package weather_history.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "weather_history")
public class WeatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Date")
    private String date;

    @Column(name = "city")
    private String city;

    @Column(name = "weather")
    private String weather;
}
