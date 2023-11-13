package ca.robertgleason.springboot.repository;

import ca.robertgleason.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
