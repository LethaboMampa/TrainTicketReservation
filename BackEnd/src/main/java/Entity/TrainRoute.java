package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trainRoute")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrainRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departureStation;
    private String arrivalStation;
    private double distance;
    private int duration;
}
