package nbg.gr.simple.repository;


import nbg.gr.simple.domain.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleTypeRepository extends JpaRepository<RoleType, Long> {
}
