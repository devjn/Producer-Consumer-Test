package com.github.devjn.producerconsumer.data;

import java.util.List;

/**
 * Created by @author Jahongir on 30-Jul-18
 * devjn@jn-arts.com
 * Producer
 */
public class Producer extends BaseWorker<String> {

    private static final int delay = 3000; //milliseconds

    public Producer(List<String> list) {
        super(list);
    }

    @Override
    void onRun(List<String> list) {
        list.add("List item " + list.size());
    }

    @Override
    int getDelay() {
        return delay;
    }

}
