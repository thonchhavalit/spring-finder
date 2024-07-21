package cats.com.kh.aftnfinder.api.repo;


import cats.com.kh.aftnfinder.api.model.Metar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetarRepository extends JpaRepository<Metar, Long> {


}
