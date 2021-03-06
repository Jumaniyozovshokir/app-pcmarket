package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.User;
import uz.pdp.apppcmarket.projection.CustomUser;

@RepositoryRestResource(path = "user", collectionResourceRel = "userList", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
