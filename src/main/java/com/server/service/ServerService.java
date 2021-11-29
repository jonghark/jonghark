package com.server.service;

import com.server.domain.ApiTestVO;
//class 가 아닌 interface
public interface ServerService {
    ApiTestVO serverServiceTest(ApiTestVO apiTestVO);
}
