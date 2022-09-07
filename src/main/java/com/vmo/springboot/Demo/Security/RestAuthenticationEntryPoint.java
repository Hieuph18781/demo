package com.vmo.springboot.Demo.Security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public final class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        response.getWriter().write("{ \"success\":" + false + ",\"message\": \"Token hết hạn hoặc không hợp lệ\",\"code\": \"UNAUTHORIZED\",\"data\": " + null + "  }");
        //throw new BadRequestException(ErrorCode.UNAUTHORIZED);
        // throw new IOException("UNAUTHORIZED");
    }
}