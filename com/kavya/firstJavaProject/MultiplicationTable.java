package com.kavya.firstJavaProject;

public class MultiplicationTable {

    void printMultiplicationTable(int table) {
        for(int i = 1; i<=10; i++) {
            System.out.printf("%d * %d = %d", i, table, i*table).println();
        }
    }
    void printMultiplicationTable(int table, int from, int to) {
        for(int i = from; i<=to; i++) {
            System.out.printf("%d * %d = %d", i, table, i*table).println();
        }
    }
}
