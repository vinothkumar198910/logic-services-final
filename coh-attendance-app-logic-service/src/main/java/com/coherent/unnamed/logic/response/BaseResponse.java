package com.coherent.unnamed.logic.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {

    private Integer inrange;

    private Long hours;

    private Date date;

    private String StatusCode;

    private String StatusMessage;

    private T Data;
}