package com.jpa.bookmaster.repository;

import com.jpa.bookmaster.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {
    Set<User> findByName(String name);

    User findByEmail(String email);

    User getByEmail(String email);

    User readByEmail (String email);

    User queryByEmail (String email);

    User searchByEmail (String email);

    User streamByEmail (String email);

    User findUserByEmail (String email);
}
