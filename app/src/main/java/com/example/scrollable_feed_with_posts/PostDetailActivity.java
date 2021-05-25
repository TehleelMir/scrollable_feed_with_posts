package com.example.scrollable_feed_with_posts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PostDetailActivity extends AppCompatActivity {

    private DataModel data;
    public static String OBJECT = "myObject";
    private ImageView avatar, image;
    private TextView name, userName, caption, date, comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        getSupportActionBar().hide();
        data = (DataModel) getIntent().getSerializableExtra(OBJECT);
        init();
        setValues(data);

    }

    private void init() {
        avatar = findViewById(R.id.avatarD);
        image = findViewById(R.id.imageD);
        name = findViewById(R.id.nameD);
        userName = findViewById(R.id.userNameD);
        caption = findViewById(R.id.captionD);
        date = findViewById(R.id.dateD);
        comments = findViewById(R.id.commentsD);
    }

    private void setValues(DataModel data) {
        avatar.setImageResource(data.getAvatarImageId());
        if (data.getImagePostId() != null)
            image.setImageResource(data.getImagePostId());
        else
            image.setVisibility(View.GONE);
        name.setText(data.getName());
        userName.setText(data.getUserName());
        if (data.getCaption() != null)
            caption.setText(data.getCaption());
        else
            caption.setVisibility(View.GONE);
        date.setText(data.getDate());
        if (data.getNoOfComments() != null)
            comments.setText(data.getNoOfComments()+"");
        else
            comments.setText("0");
    }
}