
import com.kevin.project.closetcleanup.domain.top.TShirts
import org.springframework.data.jpa.repository.JpaRepository


interface TshirtsRepository : JpaRepository<TShirts?, Long?> {
}