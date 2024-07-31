package weather_history.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weather_history.Model.WeatherEntity;

public interface WeatherRepository extends JpaRepository<WeatherEntity, Long> {
}
