package org.example.jpasetup;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    public List<User> findByName(String name);
    public List<User> findByNameStartingWith(String name);
}
