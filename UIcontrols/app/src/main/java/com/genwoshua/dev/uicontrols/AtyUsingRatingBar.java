package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/8/1.
 */

public class AtyUsingRatingBar extends Activity {
    private RatingBar ratingBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_use_ratingbar);

        ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setMax(5);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(AtyUsingRatingBar.this, "评价为 "+rating, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
