package com.github.devjn.producerconsumer.ui.view;


import com.github.devjn.producerconsumer.data.Consumer;
import com.github.devjn.producerconsumer.data.Producer;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final ObservableList<String> data = new ObservableArrayList<>();
    public final ObservableList<Producer> producers = new ObservableArrayList<>();
    public final ObservableList<Consumer> consumers = new ObservableArrayList<>();

    public MainViewModel() {
        data.add("Hello");
        data.add("Pressing 'Add producer' starts adding text to list");
        data.add("Pressing 'Add consumer' starts removing text to list");
    }

    public ObservableList<String> getData() {
        return data;
    }

    public void addProducer() {
        producers.add(new Producer(data));
    }

    public void addConsumer() {
        consumers.add(new Consumer(data));
    }

}
