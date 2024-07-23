package weather.service;

import weather.DTO.DTO;

import java.util.List;

public interface service {
    DTO addCity(DTO DTO);
    List<DTO> getAllCities();
    void deleteCity(Long id);
}
