package com.example.loginexample._core.interceptor;

import com.example.loginexample._core.error.ex.Exception401;
import com.example.loginexample.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        // localhost:8080/s/api/board
        System.out.println("uri: " + uri); // /s/api/board

        HttpSession session = request.getSession();
        User sessionUser = (User) session.getAttribute("sessionUser");

        if (uri.equals("/")) {
            if (sessionUser == null) throw new Exception401("인증이 필요합니다");
        }

        return true;
    }
}