package com.server.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;


@Getter
@Setter
@Alias("ApiTestVO")
public class ApiTestVO {
    private String param1;
    private String param2;
}
