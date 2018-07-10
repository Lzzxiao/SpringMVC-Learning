package example.controller;

import example.pojo.Persion;
import example.services.TestService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@Controller
@RequestMapping("/home")
public class Test {
    @Autowired
    private TestService testService;

    @RequestMapping("/index")
    public String index(ModelMap mm,Persion persion){
        mm.addAttribute("name",persion.getName());
        mm.addAttribute("password",persion.getPassword());
        return "index";
    }
}
