package eserciziSpringBoot.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/info")
    public ResponseEntity<?> index(){
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }

}
