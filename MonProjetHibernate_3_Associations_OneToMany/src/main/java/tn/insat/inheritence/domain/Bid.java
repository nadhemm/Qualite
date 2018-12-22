package tn.insat.inheritence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
public class Bid {
  @Id
  protected Long bidId;
  protected Double amount;
  protected Date timestamp;
 
  @ManyToOne
  protected Item item;
}

