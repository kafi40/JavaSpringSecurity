package ru.kafi.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
    @GetMapping("/")
    public String getInfoForAllEmps() {
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoForHR() {
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getInfoForManagers() {
        return "view_for_managers";
    }
}
