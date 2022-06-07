package cesar.next.aula21.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import cesar.next.aula21.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    List<User> findByName(@Param("name") String name);
}
