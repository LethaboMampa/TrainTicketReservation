package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "trainSchedule")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrainSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "train_route_id")
    private TrainRoute trainRoute;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
}
