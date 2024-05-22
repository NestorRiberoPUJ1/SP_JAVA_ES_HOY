package com.principal.session.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getMethodName(HttpSession session, Model model) {
        model.addAttribute("currentUser", session.getAttribute("user"));
        return "login.jsp";
    }

    @PostMapping("/login")
    public String postMethodName(HttpSession session, RedirectAttributes redirectAttributes,
            @RequestParam("userInput") String user,
            @RequestParam("passwordInput") String password) {

        if (user.length() < 4) {
            redirectAttributes.addFlashAttribute("userError", "user too short");
        }
        if(password.length()<8){
            redirectAttributes.addFlashAttribute("passwordError", "password must be at least 8 char");
        }
        System.out.println(user);
        System.out.println(password);
        session.setAttribute("user", user);

        return "redirect:/login"; // SIEMPRE REDIRIGE NO DEBE RENDERIZAR
    }

}
