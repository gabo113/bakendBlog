package susidiaz.com.backendBlog.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface AuthenticationFilter2 {
    Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException;

    void susessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                 FilterChain chain, Authentication authentication)
        throws IOException, ServletException;
}
