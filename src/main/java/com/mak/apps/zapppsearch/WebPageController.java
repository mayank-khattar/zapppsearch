package com.mak.apps.zapppsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;
import java.util.List;

@Controller
public class WebPageController {
    @Autowired
    private WebPageService service;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/index")
    public String indexPage(@RequestParam String url) {
        try {
            service.indexWebPage(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(@RequestParam String query, Model model) {
        List<WebPage> results = service.searchByContent(query);
        model.addAttribute("results", results);
        return "results";
    }
}

