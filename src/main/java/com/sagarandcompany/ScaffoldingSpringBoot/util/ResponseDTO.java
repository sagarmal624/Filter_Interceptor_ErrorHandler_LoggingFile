package com.sagarandcompany.ScaffoldingSpringBoot.util;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseDTO {
    private Boolean status;
    private Object data;
    private String message;

}
