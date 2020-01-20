package co.com.grupoestudio.reactorflux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import java.time.LocalTime;

@Data
@ToString
@AllArgsConstructor

public class Movie {

    private String name;
    private String gender;
    private double qualification;
    private LocalTime duration;
}
