package cats.com.kh.aftnfinder.api.service.serviceImp;

import cats.com.kh.aftnfinder.api.model.Arr;
import cats.com.kh.aftnfinder.api.repo.ArrRepository;
import cats.com.kh.aftnfinder.api.service.ArrService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrServiceImp implements ArrService {


    private final ArrRepository arrRepository;
    public ArrServiceImp(ArrRepository arrRepository) {
        this.arrRepository = arrRepository;
    }
    @Override
    public List<Arr> getAllArrival() {
        return arrRepository.findAll();
    }
}
