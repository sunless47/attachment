package weather.repository;

import weather.entity.Ent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Ent, Long> {
}