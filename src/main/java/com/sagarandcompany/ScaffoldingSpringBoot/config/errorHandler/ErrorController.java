package com.sagarandcompany.ScaffoldingSpringBoot.config.errorHandler;

import com.sagarandcompany.ScaffoldingSpringBoot.util.ResponseDTO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ErrorController {
    @ExceptionHandler(Exception.class)
    public ResponseDTO internalServerError(Exception e, WebRequest request) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage(e.getMessage());
        responseDTO.setStatus(false);
        responseDTO.setData("Request Uri:-" + request.getContextPath());
        return responseDTO;
    }
}
