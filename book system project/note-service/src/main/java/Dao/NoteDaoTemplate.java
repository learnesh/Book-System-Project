package Dao;

import model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class NoteDaoTemplate implements NoteDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private static final String

    @Override
    public Note createNote(int id) {
        return null;
    }

    @Override
    public Note getNote(int id) {
        return null;
    }

    @Override
    public List<Note> getAllNotes() {
        return null;
    }

    @Override
    public Note addNote(Note note) {
        return null;
    }

    @Override
    public void updateNote(int id) {

    }

    @Override
    public void deleteNote(int id) {

    }

    @Override
    public List<Note> getNoteByBook(String note) {
        return null;
    }
}
