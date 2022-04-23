package com.sathyajith.configconsumer.configconsumer;

import com.sathyajith.configconsumer.configconsumer.model.MemberPorfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProfileController {
    @Autowired
    MemberPorfileConfiguration memberPorfileConfiguration;

    @RequestMapping("/profile")
    public String getConfig(Model model){
        model.addAttribute("model", memberPorfileConfiguration.getDefaultModel());
        model.addAttribute("min", memberPorfileConfiguration.getMinRentPeriod());
        return "mprofile";
    }


}
