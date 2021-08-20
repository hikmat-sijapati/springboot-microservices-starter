package com.developer.hikmat.apiservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "reportservice")
public interface ReportProxy {
    @RequestMapping(value = "/api/list", method = RequestMethod.GET)
    List<String> getReportList();
}
