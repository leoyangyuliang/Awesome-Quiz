package edu.fullerton.ecs.leoyang;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class WriteObjectToBinary implements Runnable{

    private String fileName;
    private FileOutputStream outFile;
    private ObjectOutputStream outStream;
    private Quiz tempquiz;
    
    public WriteObjectToBinary(Quiz quiz, String filename) {
        this.tempquiz = quiz;
        this.fileName = filename;
    }
       public WriteObjectToBinary() {
    
    }
    public void writeToBinary(Quiz quiz, String filename) {
        tempquiz = quiz;
        this.fileName = filename;
        try { // try to open and write the file
            outFile = new FileOutputStream(fileName);
            outStream = new ObjectOutputStream(outFile);
            outStream.writeObject(tempquiz);
            outStream.close();
        } // try to open and write the file
        catch (IOException ex) { // catch
            System.out.println(ex); // display error msg in a TextArea, or use S.O.P. to console
        } // catch
    }
    
    //doesn't work because ObjectOutPutStream doesn't allow append object...    :(
    public void writeQuestionToBinary(Question question, String filename) {
        Question tempquestion;
        tempquestion = question;
        this.fileName = filename;
        try { // try to open and write the file
            outFile = new FileOutputStream(fileName,true);
            outStream = new ObjectOutputStream(outFile);
            outStream.writeObject(tempquestion);
            outStream.reset();
            outStream.close();
        } // try to open and write the file
        catch (IOException ex) { // catch
            System.out.println(ex); // display error msg in a TextArea, or use S.O.P. to console
        } // catch
    }

    @Override
    public void run() {
        writeToBinary( tempquiz,  fileName) ;
      
         
    }
}
