package cats.com.kh.aftnfinder.api.service;



import cats.com.kh.aftnfinder.api.model.Metar;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface MetarService {

        List<Metar> getAllMetar();
}
