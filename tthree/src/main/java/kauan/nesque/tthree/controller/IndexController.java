package kauan.nesque.tthree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String wellcome(){
        return"seja bem vindo ao site";
    }
}
