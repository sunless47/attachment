package weather_history.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import weather_history.Model.WeatherEntity;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity, Long> {
}
