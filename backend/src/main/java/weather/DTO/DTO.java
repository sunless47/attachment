package weather.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DTO {
    private Long id;
    private String city;
    private String weather;
}
