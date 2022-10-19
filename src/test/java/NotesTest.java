import org.example.Note;
import org.example.NoteController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotesTest {

    NoteController noteController;

    @Before
    public void NotesTest(){
        noteController = new NoteController();
    }

    @org.testng.annotations.Test
    public void addNoteTest(Note note){

        int currentNumberOfNotes = noteController.size();
        noteController.addNote(note);
        Assert.assertEquals(currentNumberOfNotes+1,noteController.size());

    }

    @ParameterizedTest
    @CsvSource({"39,Fizz", "46,NO", "75,FizzBuzz", "13,NO",
            "28,NO", "375,FizzBuzz", "92,NO", "45,FizzBuzz",
            "65,Buzz", "98,NO", "135,FizzBuzz", "9,Fizz",
            "63,Fizz", "98,NO", "103,NO", "42,Fizz",
            "90,FizzBuzz", "74,NO", "81,Fizz", "35,Buzz"})
    public void displayNoteTest(int id, String expectedResult){
        // Note note=new Note();
        // Note actualNote=note.displayNote(note.id);
        String actualNote = noteController.displayNote(id);
        Assert.assertEquals(actualNote,expectedResult);
    }
}
