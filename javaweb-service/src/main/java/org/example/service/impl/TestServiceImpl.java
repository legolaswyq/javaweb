package org.example.service.impl;

import org.example.service.TestService;
import org.example.util.TestUtil;
import org.springframework.stereotype.Service;

/**
 * TestServiceImpl
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String helloworld() {
        return TestUtil.helloworld();
    }
}