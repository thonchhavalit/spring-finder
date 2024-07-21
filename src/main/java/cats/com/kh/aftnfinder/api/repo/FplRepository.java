package cats.com.kh.aftnfinder.api.repo;

import cats.com.kh.aftnfinder.api.model.Fpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FplRepository extends JpaRepository<Fpl, Long> {
}
