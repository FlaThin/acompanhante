package kauan.nesque.tthree.controller;

import kauan.nesque.tthree.model.Arker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArkerController {
    @GetMapping("/arkcandidato")
    public Arker getArker(){
        Arker arker = new Arker();
        arker.setNome("Flathin");
        arker.setIdade(18);
        arker.setTempoJogo(6001.52);
        arker.setFuncao("Player do meu lvl não farma");
        arker.setServerAnt("56,58,53,45");
        return arker;
    }
    @GetMapping("/arkcanditos")
    public ArrayList<Arker> getCandidatos(){
        Arker arker1 = new Arker();
        Arker arker2 = new Arker();
        Arker arker3 = new Arker();
        arker1.setNome("Junnin");
        arker1.setIdade(19);
        arker1.setTempoJogo(12500.20);
        arker1.setFuncao("Mata uns dino");
        arker1.setServerAnt("73,58,53");
        arker2.setNome("Flathin");
        arker2.setIdade(18);
        arker2.setTempoJogo(6001.52);
        arker2.setFuncao("Player do meu lvl não farma");
        arker2.setServerAnt("56,58,53,45");
        arker3.setNome("Flathin");
        arker3.setIdade(26);
        arker3.setTempoJogo(5);
        arker3.setFuncao("bob");
        arker3.setServerAnt("00,150");
        ArrayList<Arker> list = new ArrayList<>();
        list.add(arker1);
        list.add(arker2);
        list.add(arker3);
        return list;
    }
}
