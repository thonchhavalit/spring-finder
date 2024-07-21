package cats.com.kh.aftnfinder.api.repo;


import cats.com.kh.aftnfinder.api.model.Dep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepRepository extends JpaRepository<Dep, Long> {
}
