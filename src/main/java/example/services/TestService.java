package example.services;

import org.springframework.stereotype.Service;

@Service("testServie")
public class TestService {
    public String test(){
        return "index";
    }
}
