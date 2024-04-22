package Repository;

import Entity.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainScheduleRepo extends JpaRepository<TrainSchedule, Long> {

}
