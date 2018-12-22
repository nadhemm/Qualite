package tn.insat.onetoone.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

    @Id
    protected String userId;
    
    protected String email;
   
    @OneToOne(mappedBy="user", optional=false)
    protected BillingInfo billingInfo;
}
