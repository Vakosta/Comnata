package tv.comnata.userservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class VideoController {
    @GetMapping("")
    public String test1() {
        return "Ok!";
    }
}
