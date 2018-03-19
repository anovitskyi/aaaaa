package com.anovitskyi.instaspringboot.controllers;

import com.anovitskyi.instaspringboot.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.util.Random;

/**
 * @author anovitskyi
 */
@Controller
public class WinnerController {

    @Autowired
    private Users users;

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public void getWinner(HttpServletResponse resp) throws Exception {
        Random random = new Random();
        int index = random.nextInt(users.getUsers().size());
        String url = users.getUsers().get(index);
        resp.sendRedirect(url);
    }

}
