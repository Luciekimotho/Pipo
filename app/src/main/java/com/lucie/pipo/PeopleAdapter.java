package com.lucie.pipo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.client.Query;
import com.firebase.ui.FirebaseRecyclerViewAdapter;

import java.util.List;

/**
 * Created by lucie on 11/12/15.
 */
public class PeopleAdapter extends FirebaseRecyclerViewAdapter<PeopleDetails, PeopleViewHolder>{

    Class<PeopleDetails> mModelClass;
    protected int mModelLayout;
    Class<PeopleViewHolder> mViewHolderClass;
    FirebaseArray mSnapshots;

    public PeopleAdapter(Class<PeopleDetails> modelClass, int modelLayout, Class<PeopleViewHolder> viewHolderClass, Query ref) {
        super(modelClass, modelLayout, viewHolderClass, ref);

        mModelClass = modelClass;
        mModelLayout = modelLayout;
        mViewHolderClass = viewHolderClass;
        mSnapshots = new FirebaseArray(ref);
    }


    @Override
    public void populateViewHolder(PeopleViewHolder peopleViewHolder, PeopleDetails peopleDetails) {

    }
}
