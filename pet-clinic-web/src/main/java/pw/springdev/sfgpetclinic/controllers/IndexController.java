package pw.springdev.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by FedorD on 2020-03-15
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {

        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler() {

        return "notimplemented";
    }
}
