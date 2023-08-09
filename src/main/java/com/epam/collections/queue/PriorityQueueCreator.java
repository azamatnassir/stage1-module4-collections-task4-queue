package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> merged = new ArrayList<>(firstList);
        merged.addAll(secondList);

        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(merged);

        return queue;
    }
}
