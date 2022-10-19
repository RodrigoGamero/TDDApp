import org.junit.Assert;
import org.junit.Test;

public class NotesTest {

    @Test
    void addNote(){
        NoteController noteController=new NoteController();
        int currentNumberOfNotes=NoteController.size();
        noteController.addNote();
        Assert.assertEquals(currentNumberOfNotes+1,NoteController.size());

    }

    @Test
    void displayNote(int id){
        Notes note=new Notes();
        Notes actualNote=note.displayNote(note.id);
        Assert.assertEquals(actualNote,note);
    }
}
