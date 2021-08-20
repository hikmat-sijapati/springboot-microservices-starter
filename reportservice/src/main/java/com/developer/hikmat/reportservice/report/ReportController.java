package com.developer.hikmat.reportservice.report;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hikmat Sijapati
 * @createdAt 6/20/2021
 * @for microservices
 */
@RestController
@RequestMapping("/api")
public class ReportController {
    @GetMapping()
    public String index() {
        return "Hello from report service.";
    }

    @GetMapping("/list")
    public ResponseEntity<?> reportList() {
        List<String> reportList = new ArrayList<>();
        reportList.add("Detail Report");
        reportList.add("Summary Report");
        return ResponseEntity.ok(reportList);
    }
}
