package com.vietis.sqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    private Context context;
    private List<User> userList;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items, parent, false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final UserHolder holder, int position) {
        User user = userList.get(position);
        holder.img_account.setImageResource(user.getResource());
        holder.userName.setText(user.getUserName());
        holder.date.setText(user.getDate());
        holder.content_desc.setText(user.getContent());
        holder.star.setImageResource(user.getStar());

        holder.star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.star.setImageResource(R.drawable.ic_star_primary);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    static class UserHolder extends RecyclerView.ViewHolder {
        private ImageView img_account;
        private ImageButton star;
        private TextView userName, date, content_desc;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            img_account = itemView.findViewById(R.id.img_account);
            star = itemView.findViewById(R.id.star);
            userName = itemView.findViewById(R.id.user_name);
            date = itemView.findViewById(R.id.date);
            content_desc = itemView.findViewById(R.id.content_desc);
        }
    }
}
