package com.maptest.bp;

public class TMHashMap {
    private static final int SIZE = 16;
    private Entry table[] = new Entry[SIZE];

    class Entry {
        Employee key;
        String value;
        Entry next;

        Entry(Employee k, String v) {
            key = k;
            value = v;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Employee getKey() {
            return key;
        }
    }

    private int getSupplementalHash(int h) {
       // System.out.println("h value received   - " + h);
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        //int x =h ^ (h >>> 7) ^ (h >>> 4);
       // System.out.println("h value returned   - " + x);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
    private int getBucketNumber(int hash) {
        return hash & (SIZE - 1);
    }

    public void put(Employee key, String value) {
        // get the hashcode and regenerate it to be optimum
        int userHash = key.hashCode();
        int hash = getSupplementalHash(userHash);
        System.out.println(" got h value returned   - " + hash);
        // compute the bucket number (0-15 based on our default size)
        // this always results in a number between 0-15
        int bucket = getBucketNumber(hash);
        Entry existingElement = table[bucket];

        for (; existingElement != null; existingElement = existingElement.next) {

            if (existingElement.key.equals(key)) {
                System.out
                        .println("duplicate key value pair, replacing existing key "
                                + key + ", with value " + value);
                existingElement.value = value;
                return;
            } else {
                System.out.println("Collision detected for key " + key
                        + ", adding element to the existing bucket");

            }
        }

        //
        System.out.println("PUT adding key:" + key + ", value:" + value
                + " to the list");
        Entry entryInOldBucket = new Entry(key, value);
        entryInOldBucket.next = table[bucket];
        table[bucket] = entryInOldBucket;
    }

    public Entry get(Employee key) {
        // get the hashcode and regenerate it to be optimum
        int hash = getSupplementalHash(key.hashCode());

        // compute the bucket number (0-15 based on our default size)
        // this always results in a number between 0-15
        int bucket = getBucketNumber(hash);

        // get the element at the above bucket if it exists
        Entry existingElement = table[bucket];

        // if bucket is found then traverse through the linked list and
        // see if element is present
        while (existingElement != null) {
            System.out
                    .println("Traversing the list inside the bucket for the key "
                            + existingElement.getKey());
            if (existingElement.key.equals(key)) {
                return existingElement;
            }
            existingElement = existingElement.next;
        }
        // if nothing is found then return null
        return null;
    }

}
