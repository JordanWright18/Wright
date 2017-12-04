import java.io.*;
import java.util.*;
public class Lesson07String{
public static void main( String args[] )
{
    System.out.println("\nRobert Czapla     #42");
 Scanner kbReader = new Scanner(System.in);
 System.out.print("1 2 "); 
 String s = kbReader.next( ); 
 System.out.println( "This is the first part of the String,… " + s);
 s = kbReader.next( );
 System.out.println( "This is the next part of the String,… " + s);
}
}