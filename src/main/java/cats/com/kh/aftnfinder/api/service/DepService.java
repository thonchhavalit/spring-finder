package cats.com.kh.aftnfinder.api.service;


import cats.com.kh.aftnfinder.api.model.Dep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepService {


    List<Dep> getAllDeparture();


}
