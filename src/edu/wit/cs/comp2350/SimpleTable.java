package edu.wit.cs.comp2350;

public class SimpleTable extends HashTable {

    private static final int MULTIPLIER = 31;

    public SimpleTable(int size) {
        super(size);
    }

    @Override
    public int calculateHash(String word) {
        byte[] bytes = word.getBytes();
        int hash = 0;
        for (byte b : bytes) {
            hash = ((hash * MULTIPLIER) + b) % this.tableSize;
        }
        return Math.abs(hash);
    }

}
