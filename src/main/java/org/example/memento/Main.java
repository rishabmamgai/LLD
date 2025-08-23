package org.example.memento;


public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.write("Let's start with line 1. \n");
        document.createSnapshot();
        document.write("Let's write line 2. \n");

        System.out.println(document.getContent().toString());

        DocumentSnapshot snapshot = document.getPageHistory().getSnapshot();
        document.undo(snapshot);
        System.out.println(snapshot.getContent());
    }
}
