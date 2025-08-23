package org.example.memento;

import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class PageHistory {
    private final List<DocumentSnapshot> snapshots;

    public void addSnapshot(DocumentSnapshot snapshot) {
        snapshots.add(snapshot);
    }

    public DocumentSnapshot getSnapshot() {
        if (!snapshots.isEmpty()) {
            DocumentSnapshot snapshot = snapshots.get(snapshots.size()-1);
            snapshots.remove(snapshots.size()-1);
            return snapshot;
        }

        return null;
    }
}
