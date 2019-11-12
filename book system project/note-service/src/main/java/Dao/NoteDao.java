package Dao;

import model.Note;

import java.util.List;

public interface NoteDao {

    Note createNote(int id);

    Note getNote(int id);

    List<Note> getAllNotes();

    Note addNote(Note note);

    void updateNote(int id);

    void deleteNote(int id);

    List<Note> getNoteByBook(String note);
}
