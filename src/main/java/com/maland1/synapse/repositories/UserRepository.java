package com.maland1.synapse.repositories;

import com.maland1.synapse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{

    User findByUsername(String username);
}
