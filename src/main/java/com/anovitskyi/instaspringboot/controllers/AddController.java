package com.anovitskyi.instaspringboot.controllers;

import com.anovitskyi.instaspringboot.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author anovitskyi
 */
@Controller
public class AddController {

    @Autowired
    private Users usersS;

    @RequestMapping(value = "/insta/service/add", method = RequestMethod.GET)
    public String addWinners(Model model) {
        StringBuilder b = new StringBuilder();
        for (String s : usersS.getUsers()) {
            b.append(s).append("\n");
        }
        model.addAttribute("u", b.toString());
        return "add";
    }

    @RequestMapping(value = "/insta/service/add", method = RequestMethod.POST)
    public String addPostWinners(@RequestParam String users) {
        usersS.getUsers().clear();
        String[] t = users.split("\n");
        for (String u : t) {
            if (u.trim().isEmpty() || !u.startsWith("https://www.instagram.com/")) {
                continue;
            }
            usersS.getUsers().add(u.trim());
        }

        return "redirect:/";
    }

}
