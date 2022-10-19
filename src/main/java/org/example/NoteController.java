package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class NoteController {

    // Attributes:
    private List<Note> noteList = new ArrayList<>();
    public int size() {
        return noteList.size();
    }

    public void addNote(Note note) {
        noteList.add(note);
    }

    public String displayNote(int id) {
        Note note = noteList.get(id);
        return note.toString();
    }

    public void deleteNote(int index) {
        // check if its not empty
        noteList.remove(index);
    }
}
