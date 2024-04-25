package susidiaz.com.backendBlog.repository;

import org.springframework.data.repository.CrudRepository;
import susidiaz.com.backendBlog.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
