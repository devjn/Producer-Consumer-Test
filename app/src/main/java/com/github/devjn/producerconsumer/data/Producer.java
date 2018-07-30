package com.github.devjn.producerconsumer.data;

import android.os.Handler;

import java.util.List;

/**
 * Created by @author Jahongir on 30-Jul-18
 * devjn@jn-arts.com
 * Producer
 */
public class Producer {

    private final Handler handler = new Handler();
    private final int delay = 3000; //milliseconds

    public Producer(final List<String> list) {
        handler.postDelayed(new Runnable() {
            public void run() {
                list.add("List item " + list.size());
                handler.postDelayed(this, delay);
            }
        }, delay);
    }

}
