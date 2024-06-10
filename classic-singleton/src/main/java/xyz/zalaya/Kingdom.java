package xyz.zalaya;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Kingdom {
    private String name;
    private Integer population;
    private Double area;
}