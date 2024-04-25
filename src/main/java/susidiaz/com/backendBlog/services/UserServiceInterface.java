package susidiaz.com.backendBlog.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import susidiaz.com.backendBlog.share.dtos.UserDto;

public interface UserServiceInterface extends UserDetailsService {
    public UserDto createUser(UserDto user);
}
