package com.github.devjn.producerconsumer.data;

import android.os.Handler;

import java.util.List;

/**
 * Created by @author Jahongir on 30-Jul-18
 * devjn@jn-arts.com
 * Consumer
 */
public class Consumer {

    private final Handler handler = new Handler();
    private final int delay = 4000; //milliseconds

    public Consumer(final List list) {
        handler.postDelayed(new Runnable() {
            public void run() {
                if (!list.isEmpty())
                    list.remove(list.size() - 1);
                handler.postDelayed(this, delay);
            }
        }, delay);
    }

}
