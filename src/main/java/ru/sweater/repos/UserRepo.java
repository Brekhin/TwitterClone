package ru.sweater.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sweater.domain.User;

/**
 * Created by Алексей on 29.04.2018.
 */
public interface UserRepo  extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
