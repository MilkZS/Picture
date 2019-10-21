package com.milkz.picture.receive;

import com.milkz.picture.bean.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient {

    @RequestMapping("/test1")
    public String doTest(@RequestBody Person person){
        return person.getName() + "," + person.getA() + "," + person.getL();
    }
}
