package org.example.memento;

import lombok.Getter;

import java.util.ArrayList;


@Getter
public class Document {
    private StringBuilder content;
    private final PageHistory pageHistory;

    public Document() {
        this.content = new StringBuilder();
        this.pageHistory = new PageHistory(new ArrayList<>());
    }

    public void write(String text) {
        content.append(text);
    }

    public void createSnapshot() {
        DocumentSnapshot snapshot = new DocumentSnapshot(this.content.toString());
        pageHistory.addSnapshot(snapshot);
    }

    public void undo(DocumentSnapshot snapshot) {
        this.content = new StringBuilder(snapshot.getContent());
    }
}
