package cats.com.kh.aftnfinder.api.Controller;


import cats.com.kh.aftnfinder.api.model.Metar;
import cats.com.kh.aftnfinder.api.service.serviceImp.MetarServiceImp;
import cats.com.kh.aftnfinder.base.BaseRest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/aftn-finder")
public class MetarRestController {


    MetarServiceImp metarServiceImp;

    public MetarRestController(MetarServiceImp metarServiceImp) {
        this.metarServiceImp = metarServiceImp;
    }

    @GetMapping("/metar")
    public BaseRest<?> getMetar(){
        List<Metar> metarPageInfo = metarServiceImp.getAllMetar();
        return BaseRest.builder()
                .status(true).code(HttpStatus.OK.value())
                .message("Metar has been found !!")
                .timestamp(LocalDateTime.now())
                .data(metarPageInfo)
                .build();
    }

}
