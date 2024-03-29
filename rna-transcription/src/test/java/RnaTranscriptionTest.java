import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RnaTranscriptionTest {

    private RnaTranscription rnaTranscription;

    @Before
    public void setUp() {
        rnaTranscription = new RnaTranscription();
    }

    @Test
    public void testEmptyRnaSequence() {
        assertEquals("", rnaTranscription.transcribe(""));
    }

    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
        assertEquals("G", rnaTranscription.transcribe("C"));
    }

    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        assertEquals("C", rnaTranscription.transcribe("G"));
    }

    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
        assertEquals("CCGA", rnaTranscription.transcribe("GgC3"));
    }

    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {
        assertEquals("U", rnaTranscription.transcribe("a"));
    }

    @Test
    public void testRnaTranscription() {
        assertEquals("CCGA", rnaTranscription.transcribe("ggCt"));
    }

}
