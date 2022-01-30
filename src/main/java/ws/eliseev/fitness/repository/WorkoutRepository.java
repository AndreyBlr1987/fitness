package ws.eliseev.fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ws.eliseev.fitness.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
