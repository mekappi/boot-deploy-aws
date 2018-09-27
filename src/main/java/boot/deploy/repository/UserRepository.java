package boot.deploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import boot.deploy.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
