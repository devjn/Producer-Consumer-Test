package com.github.devjn.producerconsumer.ui;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import cn.nekocode.badge.BadgeDrawable;

/**
 * Created by @author Jahongir on 30-Jul-18
 * devjn@jn-arts.com
 * BindingUtils
 */
public class BindingUtils {

    @BindingAdapter("badgeCount")
    public static void setBadgeCount(TextView view, int count) {
        final BadgeDrawable badgeDrawable =
                new BadgeDrawable.Builder()
                        .type(BadgeDrawable.TYPE_NUMBER)
                        .number(count)
                        .build();
        Drawable[] drawables = view.getCompoundDrawables();
        view.setCompoundDrawablesRelativeWithIntrinsicBounds(drawables[0], drawables[1], badgeDrawable, drawables[3]);
    }

}
