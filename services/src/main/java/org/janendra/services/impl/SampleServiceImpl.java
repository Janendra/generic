/*
 *  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  
 *  @version     1.0, 16-Mar-2016
 *  @author janendra
 */
package org.janendra.services.impl;

import org.janendra.service.ISampleService;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements ISampleService {

    public String getMessage() {
        return "Hello World !!!";
    }

}
