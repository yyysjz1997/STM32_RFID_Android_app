package com.example.liyi.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liyi.ui.R;
import com.example.liyi.ui.SecondActivity;
import com.example.liyi.ui.UserDetailActivity;
import com.example.liyi.ui.data.Users;

import java.util.List;

public class User_list_adapter extends ArrayAdapter<Users> {

    String str=SecondActivity.getSs();
    public User_list_adapter(Context context, int resource, List<Users> objects) {
        super(context, resource, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 获取用户的数据
        final Users users = getItem(position);

        // 创建布局
        View oneTeacherView = LayoutInflater.from(getContext()).inflate(R.layout.user_item, parent, false);

        // 获取布局中的ImageView和TextView
        ImageView imageView = (ImageView) oneTeacherView.findViewById(R.id.teacher_small_imageView);
        TextView textView = (TextView) oneTeacherView.findViewById(R.id.teacher_name_textView);

        // 根据老师数据设置ImageView和TextView的展现
        imageView.setImageResource(users.getImageId());
        textView.setText(users.getName());

        oneTeacherView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  初始化一个准备跳转到TeacherDetailActivity的Intent
                Intent intent = new Intent(getContext(), UserDetailActivity.class);
                // 往Intent中传入Teacher相关的数据，供TeacherDetailActivity使用
                intent.putExtra("teacher_image", users.getImageId());
                intent.putExtra("teacher_desc", users.getDesc());
                //  初始化一个准备跳转到TeacherDetailActivity的Intent
                getContext().startActivity(intent);
            }
        });
        return oneTeacherView;
    }
}
