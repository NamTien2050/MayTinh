package controller;

import model.MayTinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.InterfaceMayTinhServices;

import java.util.ArrayList;

@Controller
public class MayTinhController {
    ArrayList<MayTinh> list = new ArrayList<>();
    @Autowired
    InterfaceMayTinhServices interfaceMayTinhServices;

    @GetMapping("/home")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("show");
        list = interfaceMayTinhServices.showAll();
        modelAndView.addObject("listMayTinh", list);
        return modelAndView;
    }
//    @GetMapping("create")
}
