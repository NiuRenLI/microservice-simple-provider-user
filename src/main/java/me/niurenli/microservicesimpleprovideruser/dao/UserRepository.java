package me.niurenli.microservicesimpleprovideruser.dao;

import me.niurenli.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
