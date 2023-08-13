package com.springboot.SpringBootApp1.Controller;

import com.springboot.SpringBootApp1.Bean.Ninja;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NinjaController {

    @GetMapping("ninja")
    public Ninja getNinja(){
        Ninja n = new Ninja(22, "Rock lee", "Leaf", "TyeJustu");

        return n;
    }

    // return JSON list to client
    @GetMapping("ninja/list")
    public List<Ninja> ninjas(){
        List<Ninja> n = new ArrayList<>();
        n.add(new Ninja(1, "Garra", "sand", "sandman"));
        n.add(new Ninja(2, "Tin Tin", "leaf", "blades"));
        n.add(new Ninja(3, "Neji", "sand", "Byakugan"));
        n.add(new Ninja(4, "Nagato", "rain", "Rennigan"));
        return n;
    }


    // Path variable example
    // localhost:8080/ninja/1/rocklee/ninjustu

    @GetMapping("ninja/{id}/{fname}/{type}")
    public Ninja ninjaPathVariable(@PathVariable int id,
//                                   @PathVariable String fname,
//                                   @PathVariable String type){
                                   @PathVariable("fname") String first_name,
                                   @PathVariable("type") String ninjaType){
        return new Ninja(id, first_name,"Leaf", ninjaType);
    }


    // Extract from URL
    // localhost:8080/ninja/find?id=1&fanme=naruto&village=leaf
    @GetMapping("ninja/find")
    public Ninja ninjaQueryParam(@RequestParam int id, @RequestParam String fname, @RequestParam String village){
        return new Ninja(id, fname, village, "Genjutsus");
    }

}




