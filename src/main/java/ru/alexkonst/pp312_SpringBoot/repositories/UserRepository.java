package ru.alexkonst.pp312_SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alexkonst.pp312_SpringBoot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
