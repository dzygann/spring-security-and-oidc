package de.zygann.springsecurityoidc.web.controllers;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.zygann.springsecurityoidc.service.UserService;


@RestController
@RequestMapping("/user")
public class UserRestController
{
    private UserService userService;

    public UserRestController(UserService service)
    {
        this.userService = service;
    }

    @GetMapping("/oidc-principal")
    public OidcUser getOidcUserPrincipal(@AuthenticationPrincipal OidcUser principal) {
        return principal;
    }

    @GetMapping("/oidc-claims")
    public Map<String, Object> getClaimsFromBean() {
        return userService.getUserClaims();
    }
}
