package weather.service;

import org.springframework.stereotype.Service;
import weather.DTO.DTO;
import weather.entity.Ent;
import weather.mapper.Mapper;
import weather.repository.Repo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class serviceImpl implements service {
    private Repo Repo;

    public serviceImpl(Repo Repo) {
        this.Repo = Repo;
    }

    // add favourite
    @Override
    public DTO addCity(DTO DTO) {
        Ent ent = Mapper.mapToEnt(DTO);
        Ent savedEnt = Repo.save(ent);
        return Mapper.mapToDTO(savedEnt);
    }

    // list all favourites
    @Override
    public List<DTO> getAllCities() {
        List<Ent> dto = Repo.findAll();
        List<DTO> collect = dto.stream().map((cities) -> Mapper.mapToDTO(cities)).collect(Collectors.toList());
        return collect;
    }

    // delete favourite
    @Override
    public void deleteCity(Long id) {
        Ent ent = Repo.findById(id).orElseThrow(() -> new RuntimeException("City doesn't exist"));
        Repo.deleteById(id);
    }
}