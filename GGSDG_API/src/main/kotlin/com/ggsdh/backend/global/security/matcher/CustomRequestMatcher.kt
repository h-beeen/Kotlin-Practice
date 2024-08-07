package com.ggsdh.backend.global.security.matcher

import org.springframework.security.web.util.matcher.AntPathRequestMatcher
import org.springframework.security.web.util.matcher.OrRequestMatcher
import org.springframework.security.web.util.matcher.RequestMatcher
import org.springframework.stereotype.Component

@Component
class CustomRequestMatcher {
    fun authEndpoints(): RequestMatcher {
        return OrRequestMatcher(
            AntPathRequestMatcher("/"), // Actuator Health Checker
            AntPathRequestMatcher("/api/v1/oauth/**"), // Oauth Login
            AntPathRequestMatcher("/actuator/health"),
        )
    }

    fun tempUserEndpoints(): RequestMatcher {
        return OrRequestMatcher(
            AntPathRequestMatcher("/api/v1/member/signup"),
        )
    }

    fun userEndpoints(): RequestMatcher {
        return OrRequestMatcher(
            AntPathRequestMatcher("/api/v1/search/**"),
        )
    }
}
