package com.server.service.imple;

import com.server.domain.ApiTestVO;
import com.server.service.ServerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@RequiredArgsConstructor
//데이터베이스 연결되면 이거 풀자
//@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class ServerServiceImpl implements ServerService {

    @Override
    public ApiTestVO serverServiceTest(ApiTestVO apiTestVO){
            apiTestVO.setParam1("aaaa");
            apiTestVO.setParam2("bbbb");
        return apiTestVO;
        //tttt111
    }
}
