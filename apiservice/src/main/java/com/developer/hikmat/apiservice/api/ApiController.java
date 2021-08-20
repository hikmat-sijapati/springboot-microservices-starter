package com.developer.hikmat.apiservice.api;

import com.developer.hikmat.apiservice.proxy.ReportProxy;
import com.developer.hikmat.sharedservice.service.SharedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private final ReportProxy reportProxy;
    ApiController(ReportProxy reportProxy) {
        this.reportProxy = reportProxy;
    }

    /**
     * Default Index Function
     * @return
     */
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String index(SharedService sharedService) {
//        return "Hello from API Service";
        return sharedService.getName();
    }

    @RequestMapping("/reportList")
    public ResponseEntity<?> getReportList() {
        return ResponseEntity.ok(reportProxy.getReportList());
    }
}
