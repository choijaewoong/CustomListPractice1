package com.example.androidchoi.customlistpractice1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Choi on 2015-10-09.
 */
public class ItemView extends FrameLayout {
    public ItemView(Context context) {
        super(context);
        init();
    }
    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    LinearLayout linearLayout;
    TextView title;
    TextView content;
    ImageView contentImage;
    ImageView logoImage;
    TextView logoText;
    Button addButton;
    ItemData mData;

    private void init() {
        inflate(getContext(), R.layout.view_item, this);
//        LayoutInflater.from(getContext()).inflate(R.layout.view_item, this);
        contentImage = (ImageView)findViewById(R.id.image_content);
//        contentImage.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        addButton = (Button)findViewById(R.id.button_add);
//        addButton.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        linearLayout = (LinearLayout)findViewById(R.id.layout_content);
//        linearLayout.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        title = (TextView)findViewById(R.id.text_title);
        content = (TextView)findViewById(R.id.text_content);
        logoImage = (ImageView)findViewById(R.id.image_logo);
        logoText = (TextView)findViewById(R.id.text_logo);
    }

    public void setItemData(ItemData data){
        mData = data;

        title.setText(mData.articleTitle);
        content.setText(mData.articleContent);
        if(data.contentImage != null){
            contentImage.setImageDrawable(data.contentImage);
        }
        if(data.logoImage != null){
            logoImage.setImageDrawable(data.logoImage);
        }
        logoText.setText(mData.logoName);
    }


}

