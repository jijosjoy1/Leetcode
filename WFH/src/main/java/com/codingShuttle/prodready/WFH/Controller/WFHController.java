package com.codingShuttle.prodready.WFH.Controller;

import com.codingShuttle.prodready.WFH.ENTITY.WFHRequest;
import com.codingShuttle.prodready.WFH.Service.WFHRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/web")  // Set a base path to avoid overlap
public class WFHController {

    @Autowired
    private WFHRequestService service;

    @GetMapping("/")
    public String viewRequests(Model model) {
        model.addAttribute("requests", service.getAllRequests());
        return "index";  // Thymeleaf template
    }

    @PostMapping("/request")
    public RedirectView createRequest(@ModelAttribute WFHRequest request) {
        service.createRequest(request);
        return new RedirectView("/web/");  // Redirect back to the Thymeleaf view
    }

    @GetMapping("/request/{id}/approve")
    public RedirectView approveRequest(@PathVariable Long id) {
        service.approveRequest(id);
        return new RedirectView("/web/");
    }

    @GetMapping("/request/{id}/reject")
    public RedirectView rejectRequest(@PathVariable Long id) {
        service.rejectRequest(id);
        return new RedirectView("/web/");
    }
}