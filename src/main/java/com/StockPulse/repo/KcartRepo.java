
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.slotify.demo.model.User;
import org.springframework.web.bind.annotation.*;


@Repository
public interface KCcarRepo extends JpaRepository<User,Integer> {

    User findByEmail(String email);

}