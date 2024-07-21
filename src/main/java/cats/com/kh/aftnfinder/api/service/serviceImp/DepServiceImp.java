package cats.com.kh.aftnfinder.api.service.serviceImp;

import cats.com.kh.aftnfinder.api.model.Dep;
import cats.com.kh.aftnfinder.api.repo.DepRepository;
import cats.com.kh.aftnfinder.api.service.DepService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepServiceImp implements DepService {

    private final DepRepository depRepository;
    public DepServiceImp(DepRepository depRepository) {
        this.depRepository = depRepository;
    }


    @Override
    public List<Dep> getAllDeparture() {
        return depRepository.findAll();
    }



}
