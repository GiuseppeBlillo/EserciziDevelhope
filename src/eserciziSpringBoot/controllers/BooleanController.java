package eserciziSpringBoot.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BooleanController {
    @GetMapping("/random")
    public ResponseEntity<?> index(){
        return (new Random().nextBoolean() ? new ResponseEntity<>(HttpStatusCode.valueOf(200)) : new ResponseEntity<>(HttpStatusCode.valueOf(400)));
    }
}
