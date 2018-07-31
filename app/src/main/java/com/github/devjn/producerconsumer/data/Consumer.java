package com.github.devjn.producerconsumer.data;

import java.util.List;

/**
 * Created by @author Jahongir on 30-Jul-18
 * devjn@jn-arts.com
 * Consumer
 */
public class Consumer extends BaseWorker {

    private static final int delay = 4000; //milliseconds

    public Consumer(List list) {
        super(list);
    }

    @Override
    void onRun(List list) {
        if (!list.isEmpty())
            list.remove(list.size() - 1);
    }

    @Override
    int getDelay() {
        return delay;
    }

}
