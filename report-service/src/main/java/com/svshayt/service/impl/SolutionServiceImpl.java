package com.svshayt.service.impl;

import com.svshayt.service.SolutionService;
import org.springframework.stereotype.Service;

@Service
public class SolutionServiceImpl implements SolutionService {

    @Override
    public void solve() {
        System.out.println("Test");
    }
}
