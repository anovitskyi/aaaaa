package com.anovitskyi.instaspringboot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anovitskyi
 */
@Component
public final class Users {

    private static final List<String> users = new ArrayList<>();

    private Users(){}

    public static List<String> getUsers() {
        return users;
    }

}
