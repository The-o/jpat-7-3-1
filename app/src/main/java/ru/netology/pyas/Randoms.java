package ru.netology.pyas;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private Random random;
    private int min;
    private int range;

    public class RandomsIterator implements Iterator<Integer> {

        private RandomsIterator() {
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return min + random.nextInt(range);
        }

    }

    public Randoms(int min, int max) {
      this.min = min;
      this.range = max - min + 1;
      this.random = new Random();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }


}