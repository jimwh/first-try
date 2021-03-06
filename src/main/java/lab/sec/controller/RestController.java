package lab.sec.controller;

import lab.sec.model.User;
import lab.sec.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class RestController {

    @Autowired
    DataService dataService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<User> list() {
        return dataService.getUserList();

    }
}