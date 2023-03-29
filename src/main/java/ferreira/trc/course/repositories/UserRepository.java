package ferreira.trc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ferreira.trc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    

}
