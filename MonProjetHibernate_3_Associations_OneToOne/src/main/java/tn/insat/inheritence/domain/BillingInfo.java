package tn.insat.inheritence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingInfo {
 
  @Id
  protected Long billingId;
  protected String creditCardType;

  @OneToOne
  protected User user;

  public BillingInfo(Long billingId, String creditCardType) {
    this.billingId = billingId;
    this.creditCardType = creditCardType;
  }

  public Long getBillingId() {
    return billingId;
  }

  public void setBillingId(Long billingId) {
    this.billingId = billingId;
  }

  public String getCreditCardType() {
    return creditCardType;
  }

  public void setCreditCardType(String creditCardType) {
    this.creditCardType = creditCardType;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}

