package co.com.grupoestudio.reactorflux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import java.time.LocalTime;

@Data
@ToString
@AllArgsConstructor

public class Movie {

    public String name;
    public String gender;
    public double qualification;
    public LocalTime duration;
}
