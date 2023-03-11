package com.svshayt.controller;

import com.svshayt.service.SolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReportServiceController {

    private final SolutionService solutionService;

    @GetMapping("/report")
    public void report() {
        solutionService.solve();
    }

}
