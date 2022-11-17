package io.com.morris.emerald01.model;

import java.util.List;
import java.util.UUID;

public class Position {
    private final String id;
    private final List<String> positions;

    public Position(List<String> positions) {
        this.positions = positions;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }

    public List<String> getPositions() {
        return this.positions;
    }
}
