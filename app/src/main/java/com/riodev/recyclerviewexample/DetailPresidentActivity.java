package com.riodev.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailPresidentActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvDescription;
    ImageView ivPhoto;
    President president;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_president);

        tvName = findViewById(R.id.tv_detail_name);
        tvDescription = findViewById(R.id.tv_detail_desc);
        ivPhoto = findViewById(R.id.iv_detail_photo);

        president = getIntent().getParcelableExtra("PRESIDENT");

        tvName.setText(president.getName());
        tvDescription.setText(president.getDescription());
        Glide.with(this)
                .load(Integer.valueOf(president.getPhoto()))
                .apply(new RequestOptions().override(100,100))
                .into(ivPhoto);

    }
}
