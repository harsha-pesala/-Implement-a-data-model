package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String firstName;
    private String lastName;
    private String dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    public Client(Long clientId, String firstName, String lastName, String dateOfBirth,
                  FinancialAdvisor advisor, Portfolio portfolio) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.advisor = advisor;
        this.portfolio = portfolio;
    }

    public Client() {}

    public Long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
        
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
        
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }
    
    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
    
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
