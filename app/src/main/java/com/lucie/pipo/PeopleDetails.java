package com.lucie.pipo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by lucie on 11/12/15.
 */
public class PeopleDetails {
    Integer id;
    String first_name, last_name, email, country, company_name,credit_card;


    public PeopleDetails(Integer id, String first_name, String last_name, String email,
                         String country, String company_name, String credit_card){

        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.credit_card = credit_card;
        this.company_name = company_name;
    }
    public int getid(){
        return id;
    }

    public String getCredit_card(){
        return credit_card;
    }


    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getEmail(){
        return email;
    }
    public String getCountry(){
        return country;
    }
    public String getCompany_name(){
        return company_name;
    }
}