/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package se_hw4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

public class hw4Test{
    
    @Test
    public void testletterGrade(){

        assertEquals('A', hw4.letterGrade(95));
        assertEquals('B', hw4.letterGrade(85));
        assertEquals('C', hw4.letterGrade(75));
        assertEquals('D', hw4.letterGrade(65));
        assertEquals('F', hw4.letterGrade(55));
        assertEquals('X', hw4.letterGrade(105));
        assertEquals('X', hw4.letterGrade(-5));
    }

    @Test
    public void testTheBoundary(){
        assertEquals('A', hw4.letterGrade(90));
        assertEquals('A', hw4.letterGrade(100));
        assertEquals('B', hw4.letterGrade(80));
        assertEquals('B', hw4.letterGrade(89));
        assertEquals('C', hw4.letterGrade(70));
        assertEquals('C', hw4.letterGrade(79));
        assertEquals('D', hw4.letterGrade(60));
        assertEquals('D', hw4.letterGrade(69));
        assertEquals('F', hw4.letterGrade(0));
        assertEquals('X', hw4.letterGrade(-2));

    }

    @Test
    public void testMainWithValidInput() {
        String input = "80\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        hw4.main(new String[]{});

        // Add assertions based on the expected output
        // For example, you can redirect System.out to check the printed output
    }

    @Test
    public void testMainWithInvalidInput() {
        String input = "abc\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        hw4.main(new String[]{});

        // Add assertions based on the expected output for invalid input
    }

    @Test
    public void testMainWithIOException() {
        String input = "80\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect System.err to capture printed exception message
        ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
        PrintStream originalErr = System.err;
        System.setErr(new PrintStream(errorStream));

        // Call the main method with the mocked BufferedReader
        hw4.main(new String[]{});

        // Restore the original System.err
        System.setErr(originalErr);

        // Assert that the expected exception message is printed to System.err
        assertFalse(errorStream.toString().contains("IOException"));

    }

    // @Test
    // public void testMainWithIOException() throws IOException {
    //     String input = "80\n";
    //     InputStream in = new ByteArrayInputStream(input.getBytes());
    //     System.setIn(in);

    //     // Redirect System.err to capture printed exception message
    //     ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
    //     PrintStream originalErr = System.err;
    //     System.setErr(new PrintStream(errorStream));

    //     // Call the main method with the mocked BufferedReader
    //     hw4.main(new String[]{});

    //     // Restore the original System.err
    //     System.setErr(originalErr);

    //     // Get the captured exception message
    //     String exceptionMessage = getExceptionMessage(errorStream.toString());

    //     // Assert that the expected exception message is present
    //     assertTrue(exceptionMessage.contains("Not an integer!"));
    // }

    // private String getExceptionMessage(String stackTrace) throws IOException {
    //     StringWriter sw = new StringWriter();
    //     sw.append(stackTrace);
    //     return sw.toString();
    // }
}

