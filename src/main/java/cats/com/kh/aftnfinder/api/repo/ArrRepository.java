package cats.com.kh.aftnfinder.api.repo;


import cats.com.kh.aftnfinder.api.model.Arr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrRepository extends JpaRepository<Arr, Integer> {


}
