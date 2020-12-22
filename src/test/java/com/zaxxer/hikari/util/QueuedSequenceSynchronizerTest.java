package com.zaxxer.hikari.util;

import org.junit.Test;

public class QueuedSequenceSynchronizerTest {

    @Test
    public void test() {
       QueuedSequenceSynchronizer synchronizer = new QueuedSequenceSynchronizer();
       synchronizer.signal();
       System.out.println(synchronizer.currentSequence());
       synchronizer.signal();
       System.out.println(synchronizer.currentSequence());
       synchronizer.signal();
       System.out.println(synchronizer.currentSequence());
    }
}
