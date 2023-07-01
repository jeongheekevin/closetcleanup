
import com.kevin.project.closetcleanup.domain.bottom.Pants
import org.springframework.data.jpa.repository.JpaRepository


interface PantsRepository : JpaRepository<Pants?, Long?> {
}