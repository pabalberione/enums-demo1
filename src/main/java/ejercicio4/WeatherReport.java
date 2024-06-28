package ejercicio4;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherReport {
    private int id;
    private String location;

    WeatherCondition weatherCondition;
}
