package com.baishijiaju.dgbjForKotlin.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.baishijiaju.dgbjForKotlin.R;


public class CommonPageTitle extends RelativeLayout {

    private static final String TAG = "PageTitle";
    private RelativeLayout rlBackground;
    private LinearLayout llLeft, llRight;
    private TextView tvTitle, tvRightText;
    private ImageView ivLeft, ivRight,ivRight1;


    public CommonPageTitle(Context context) {
        super(context);
    }

    public CommonPageTitle(final Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(getContext(), R.layout.layout_common_page_title, this);
        rlBackground = findViewById(R.id.rlBackground);
        llLeft = findViewById(R.id.llLeft);
        llRight = findViewById(R.id.llRight);
        tvTitle = findViewById(R.id.tvTitle);
        tvRightText = findViewById(R.id.tvRightText);
        ivLeft = findViewById(R.id.ivLeft);
        ivRight = findViewById(R.id.ivRight);
        ivRight1 = findViewById(R.id.ivRight1);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CommonPageTitle);


        CharSequence titleText = a.getText(R.styleable.CommonPageTitle_titleText);
        if (titleText != null) {
            tvTitle.setText(titleText);
        }

        CharSequence rightText = a.getText(R.styleable.CommonPageTitle_rightText);
        if (rightText != null) {
            llRight.setVisibility(View.VISIBLE);
            tvRightText.setText(rightText);
        }

        int leftImgResoure = a.getResourceId(R.styleable.CommonPageTitle_leftImgSrc, 0);
        if (leftImgResoure != 0) {
            llLeft.setVisibility(View.VISIBLE);
            ivLeft.setImageResource(leftImgResoure);
            llLeft.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                }
            });
        }

        int rightImgResoure = a.getResourceId(R.styleable.CommonPageTitle_rightImgSrc, 0);
        if (rightImgResoure != 0) {
            llRight.setVisibility(View.VISIBLE);
            ivRight.setImageResource(rightImgResoure);
        }

        int rightImgResoure1 = a.getResourceId(R.styleable.CommonPageTitle_rightImgSrc1, 0);
        if (rightImgResoure1 != 0) {
            llRight.setVisibility(View.VISIBLE);
            ivRight1.setImageResource(rightImgResoure1);
        }

        int backgroundSrc = a.getResourceId(R.styleable.CommonPageTitle_backgroundSrc, R.color.white);
        rlBackground.setBackgroundResource(backgroundSrc);

        int titleTextColor = a.getColor(R.styleable.CommonPageTitle_titleTextColor, 0);
        if (titleTextColor == 0){
            tvTitle.setTextColor(Color.parseColor("#333333"));
        }else {
            tvTitle.setTextColor(titleTextColor);
        }
        a.recycle();
    }
    public void setTvTitle(String title){
        if (title != null) {
            tvTitle.setText(title);
        }
    }

}