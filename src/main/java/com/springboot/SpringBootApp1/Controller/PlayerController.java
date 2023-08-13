package com.springboot.SpringBootApp1.Controller;


import com.springboot.SpringBootApp1.Bean.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("player")
public class PlayerController {

    @GetMapping
    public ResponseEntity<Player> somePlayer(){
        Player p = new Player(22, "Kane", "Kiwi", "Skipper");
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Player>> bestPlayers(){
        List<Player> l = new ArrayList<>();
        l.add(new Player(22, "Kane", "Kiwi", "Skipper"));
        l.add(new Player(31, "david", "Ausi", "Opener"));
        l.add(new Player(7, "dhoni", "ind", "Finisher"));
        l.add(new Player(22, "Archer", "eng", "Death Bowler"));
        return ResponseEntity.ok(l);
    }

    @GetMapping("/get/{jersey}/{name}/{team}/{role}")
    public ResponseEntity<Player> newPlayer(@PathVariable int jersey,
                                            @PathVariable String name,
                                            @PathVariable String team,
                                            @PathVariable String role){
        Player p = new Player(jersey, name, team, role);
        return ResponseEntity.ok(p);
    }

//    @GetMapping("/createByJsonBody")
//    public ResponseEntity<Player> makePlayer(@RequestBody Player p){
//        return ResponseEntity.ok(p);
//    }

    @GetMapping("/find")
    public String find(@RequestParam int jersey,
                       @RequestParam String name,
                       @RequestParam String team){
        return "Finding player with jersey "+jersey+" name:"+name+" team:"+team;
    }

//    @PostMapping("/add")
//    public Player createPlayer(@RequestBody Player p){
//        System.out.println( p.getJersey()+""+p.getName()+""+p.getTeam());
//        return p; }


    @PostMapping()
    public ResponseEntity<Player> createPlayer(@RequestBody Player p){
        System.out.println( p.getJersey()+""+p.getName()+""+p.getTeam());
        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public  Player updatePlayer(@RequestBody Player p , @PathVariable("id") int jersey){
        return  p;
    }

    @DeleteMapping("/{id}")
    public String removePlayer(@PathVariable("id") int jersey){
        return "#"+jersey+" Player deleted";
    }

}
