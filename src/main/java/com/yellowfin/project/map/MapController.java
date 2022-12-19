package com.yellowfin.project.map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {
    @CrossOrigin
    @GetMapping("/map")
    public String users() {
        return "Yellowfin Map";
    }
}