package cats.com.kh.aftnfinder.api.repo;

import cats.com.kh.aftnfinder.api.model.Chg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChgRepository extends JpaRepository<Chg, Integer> {
}
