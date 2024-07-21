package cats.com.kh.aftnfinder.api.service;

import cats.com.kh.aftnfinder.api.model.Arr;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArrService {

     List<Arr> getAllArrival();

}
