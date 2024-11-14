package com.codingShuttle.prodready.WFH.Controller;

import com.codingShuttle.prodready.WFH.ENTITY.WFHRequest;
import com.codingShuttle.prodready.WFH.Service.WFHRequestService;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private WFHRequestService service;

    @GetMapping("/requests")
    public List<WFHRequest> getAllRequests() {
        return service.getAllRequests();
    }

    @PostMapping("/request")
    public WFHRequest createRequest(@RequestBody WFHRequest request) {
        return service.createRequest(request);
    }

    @PutMapping("/request/{id}")
    public WFHRequest updateRequest(@PathVariable Long id, @RequestBody WFHRequest request) {
        return service.updateRequest(id, request);
    }

    @DeleteMapping("/request/{id}")
    public void deleteRequest(@PathVariable Long id) {
        service.deleteRequest(id);
    }
}