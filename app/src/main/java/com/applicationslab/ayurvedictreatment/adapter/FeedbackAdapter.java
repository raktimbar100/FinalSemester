package com.applicationslab.ayurvedictreatment.adapter;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.applicationslab.ayurvedictreatment.R;
import com.applicationslab.ayurvedictreatment.datamodel.FeedbackData;

import java.util.ArrayList;

public class FeedbackAdapter extends RecyclerView.Adapter<FeedbackAdapter.MyViewHolder> {

    Activity mContext;
    ArrayList<FeedbackData> feedbackDatas;


    public FeedbackAdapter(Activity mContext, ArrayList<FeedbackData> feedbackDatas) {
        this.mContext = mContext;
        this.feedbackDatas = feedbackDatas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.row_feedback, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtName.setText(feedbackDatas.get(position).getUsername());
        holder.txtDetails.setText(feedbackDatas.get(position).getComment());
    }

    @Override
    public int getItemCount() {
        return feedbackDatas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtName;
        TextView txtDetails;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtDetails = itemView.findViewById(R.id.txtDetails);

            Typeface tfRegular = Typeface.createFromAsset(mContext.getAssets(), "fonts/OpenSansRegular.ttf");
            txtName.setTypeface(tfRegular);
            txtDetails.setTypeface(tfRegular);
        }
    }
}
