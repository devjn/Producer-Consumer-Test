package com.github.devjn.producerconsumer.data;

import android.os.Handler;

import java.util.List;

/**
 * Created by @author Jahongir on 31-Jul-18
 * devjn@jn-arts.com
 * BaseWorker
 */
abstract class BaseWorker<T> {

    private final Handler handler = new Handler();
    private final int delay = getDelay(); //milliseconds

    BaseWorker(final List<T> list) {
        handler.postDelayed(new Runnable() {
            public void run() {
                onRun(list);
                handler.postDelayed(this, delay);
            }
        }, delay);
    }

    abstract void onRun(List<T> list);
    /**
     * @return delay in milliseconds
     */
    abstract int getDelay();


}
