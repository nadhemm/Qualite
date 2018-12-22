package tn.insat.dataaccess;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.insat.domain.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

	public List<Compte> findBySoldeIsGreaterThan(BigDecimal mini);

	@Query(" from Compte c where c.solde >= :mini")
	public List<Compte> avoirLesSoldesSuperieursA(@Param("mini") BigDecimal mini);

}



