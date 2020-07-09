package ryan.day6.queue;

import ryan.day2.Sequence;

import java.util.PriorityQueue;

public class Handler {
    public static void main(String[] args) {
        PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();
        Sequence sequence = new Sequence();
        personPriorityQueue.add(new Person(false, sequence.getSequence()));
        personPriorityQueue.add(new Person(false, sequence.getNextSequence()));
        personPriorityQueue.add(new Person(false, sequence.getNextSequence()));

        personPriorityQueue.add(new Person(true, sequence.getNextSequence()));
        personPriorityQueue.add(new Person(false, sequence.getNextSequence()));
        personPriorityQueue.add(new Person(true, sequence.getNextSequence()));
        personPriorityQueue.add(new Person(false, sequence.getNextSequence()));

        System.out.println(personPriorityQueue.poll().getQueueNumber());        // isVip
        System.out.println(personPriorityQueue.poll().getQueueNumber());

        System.out.println(personPriorityQueue.poll().getQueueNumber());
        System.out.println(personPriorityQueue.poll().getQueueNumber());
        System.out.println(personPriorityQueue.poll().getQueueNumber());
        System.out.println(personPriorityQueue.poll().getQueueNumber());
        System.out.println(personPriorityQueue.poll().getQueueNumber());
    }
}
