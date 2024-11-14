package com.codingShuttle.prodready.WFH.Controller;


import com.codingShuttle.prodready.WFH.ENTITY.WFHRequest;
import com.codingShuttle.prodready.WFH.Service.WFHRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/admin")
    public class AdminController {

        @Autowired
        private WFHRequestService service;

        @PutMapping("/request/{id}/approve")
        public WFHRequest approveRequest(@PathVariable Long id) {
            return service.approveRequest(id);
        }

        @PutMapping("/request/{id}/reject")
        public WFHRequest rejectRequest(@PathVariable Long id) {
            return service.rejectRequest(id);
        }
    }
