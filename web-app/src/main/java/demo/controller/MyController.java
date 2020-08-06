package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {

    @GetMapping("/indexes")
    public Map<String,Object> getIndex(){
        Map<String,Object> result = new HashMap<>();
        result.put("hello","world");
        return result;
    }
}
