/*
 *  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  
 *  @version     1.0, 15-Mar-2016
 *  @author janendra
 */
package org.janendra.web.controller;

import org.janendra.service.ISampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class SampleController {

    @Autowired
    private ISampleService sampleService;

    @RequestMapping("sample")
    public String sample() {
        return "sample";
    }

    @RequestMapping("sampleAjax")
    @ResponseBody
    public String sampleAjax() {
        return sampleService.getMessage();
    }
}
