package com.codingShuttle.prodready.WFH.Service;

import com.codingShuttle.prodready.WFH.ENTITY.WFHRequest;
import com.codingShuttle.prodready.WFH.Repo.WFHRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WFHRequestService {

    @Autowired
    private WFHRequestRepository repository;

    public List<WFHRequest> getAllRequests() {
        return repository.findAll();
    }

    public WFHRequest createRequest(WFHRequest request) {
        request.setStatus("New");
        return repository.save(request);
    }

    public WFHRequest updateRequest(Long id, WFHRequest request) {
        request.setId(id);
        return repository.save(request);
    }

    public void deleteRequest(Long id) {
        repository.deleteById(id);
    }

    public WFHRequest approveRequest(Long id) {
        WFHRequest request = repository.findById(id).orElseThrow();
        request.setStatus("Approved");
        return repository.save(request);
    }

    public WFHRequest rejectRequest(Long id) {
        WFHRequest request = repository.findById(id).orElseThrow();
        request.setStatus("Rejected");
        return repository.save(request);
    }
}