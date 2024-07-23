package weather.mapper;

import weather.DTO.DTO;
import weather.entity.Ent;

public class Mapper {

    public static Ent mapToEnt(DTO DTO) {
        Ent entObj;
        entObj = new Ent(
                DTO.getId(),
                DTO.getCity(),
                DTO.getWeather()
        );
        return entObj;
    }

    public static DTO mapToDTO(Ent Ent) {
        DTO dtoObj;
        dtoObj = new DTO(
                Ent.getId(),
                Ent.getCity(),
                Ent.getWeather()
        );
        return dtoObj;
    }
}