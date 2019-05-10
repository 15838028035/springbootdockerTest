package com.thinkit.cloud.upm.controller;

import java.util.Arrays;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhongkexinli.micro.serv.common.bean.RestAPIResult2;

@RestController
public class LoadTestController {

    @RequestMapping("/loadtest")
    public RestAPIResult2 loadtest() {

        long before = System.currentTimeMillis();

        Random random = new Random();

        for(int i = 0; i < 1000; i++) {
            long[] data = new long[1000000];
            for(int l = 0; l < data.length; l++) {
                data[l] = random.nextLong();
            }
            Arrays.sort(data);
        }

        return new RestAPIResult2();
    }
}