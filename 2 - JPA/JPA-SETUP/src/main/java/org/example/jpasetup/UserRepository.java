package org.example.jpasetup;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    public List<User> findByName(String name);
    public List<User> findByNameStartingWith(String name);

    @Query("select u from User u WHERE u.name =:fName OR u.name =:sName")
    public List<User> getAllUser(@Param("fName") String myName,@Param("sName") String sName);

    @Query(value = "select * from user",nativeQuery = true)
    public List<User> getAllUserNative();
}
