package cats.com.kh.aftnfinder.api.Controller;


import cats.com.kh.aftnfinder.api.service.serviceImp.ArrServiceImp;
import cats.com.kh.aftnfinder.api.service.serviceImp.DepServiceImp;
import cats.com.kh.aftnfinder.api.service.serviceImp.MetarServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    private final MetarServiceImp metarServiceImp;
    private final ArrServiceImp arrServiceImp;
    private final DepServiceImp depServiceImp;


    public MainController(MetarServiceImp metarServiceImp, ArrServiceImp arrServiceImp, DepServiceImp depServiceImp) {
        this.metarServiceImp = metarServiceImp;
        this.arrServiceImp = arrServiceImp;
        this.depServiceImp = depServiceImp;
    }

    @GetMapping("/index")
    public String getData(@RequestParam(required = false) String type, Model model) {
        List<String> types = Arrays.asList("metar", "arr", "dep");
        model.addAttribute("types", types);

        if (type != null) {
            switch (type.toLowerCase()) {
                case "metar":
                    model.addAttribute("data", metarServiceImp.getAllMetar());
                    model.addAttribute("type", "metar");
                    break;
                case "arr":
                    model.addAttribute("data", arrServiceImp.getAllArrival());
                    model.addAttribute("type", "arr");
                    break;
                case "dep":
                    model.addAttribute("data", depServiceImp.getAllDeparture());
                    model.addAttribute("type", "dep");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid type: " + type);
            }
        }
        return "index";
    }
}



