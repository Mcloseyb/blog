package org.example.blogmanagement.controller;

import org.example.blogmanagement.model.BlogDetails;
import org.example.blogmanagement.service.BlogDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BlogDetailsService blogDetailsService;

    @GetMapping("/home")
    public String home(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        model.addAttribute("username", username);

        List<BlogDetails> approvedBlogs = blogDetailsService.findApprovedBlogs();
        model.addAttribute("approvedBlogs", approvedBlogs);

        return "home";
    }
}
