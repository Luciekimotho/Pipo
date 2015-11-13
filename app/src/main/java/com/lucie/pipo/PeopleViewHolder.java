package com.lucie.pipo;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

//Defining View holder class for the cards
public class PeopleViewHolder extends  RecyclerView.ViewHolder{
    TextView id, fname, lname, email,country, companyname, creditcard;

    public PeopleViewHolder(View itemView) {
        super(itemView);
        id = (TextView) itemView.findViewById(R.id.id);
        fname = (TextView) itemView.findViewById(R.id.first_name);
        lname = (TextView) itemView.findViewById(R.id.last_name);
        email = (TextView) itemView.findViewById(R.id.email);
        country = (TextView) itemView.findViewById(R.id.country);
        companyname = (TextView) itemView.findViewById(R.id.company_name);
        creditcard = (TextView) itemView.findViewById(R.id.credit_card);
    }
    }


