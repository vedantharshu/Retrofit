package com.example.retrofit;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Retro.Retro;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    Context context;
    List<Retro> title;

    public CustomAdapter(Context context, List<Retro> title) {
        this.context = context;
        this.title = title;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model, parent,false);

        return (new CustomViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.t1.setText(title.get(position).getTitle());
        holder.t2.setText(title.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return title.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView t1,t2;
        CustomViewHolder(View myview){
            super(myview);
            view=myview;
            t1=view.findViewById(R.id.t1);
            t2=view.findViewById(R.id.t2);
        }
    }


}
