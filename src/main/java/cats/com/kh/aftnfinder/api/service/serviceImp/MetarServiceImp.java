package cats.com.kh.aftnfinder.api.service.serviceImp;

import cats.com.kh.aftnfinder.api.model.Metar;
import cats.com.kh.aftnfinder.api.repo.MetarRepository;
import cats.com.kh.aftnfinder.api.service.MetarService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MetarServiceImp implements MetarService {

    private final MetarRepository metarRepository;
    public MetarServiceImp(MetarRepository metarRepository) {
        this.metarRepository = metarRepository;
    }

    @Override
    public List<Metar> getAllMetar() {
        return metarRepository.findAll();
    }
}
