package edu.fullerton.ecs.leoyang;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ReadObjectToBinary {

    private FileInputStream inFile;
    private ObjectInputStream inStream;
    private Quiz quiz;
    private String fileName;

    public ReadObjectToBinary() {

    }

    public Quiz readFromBinary(String filename) {
        this.fileName = filename;
        try { // try to open and read the file
            inFile = new FileInputStream(fileName);
            inStream = new ObjectInputStream(inFile);

            while (true) // attempt to read after EOF will cause exception & stop loop
            { // process Patient
                quiz = (Quiz) inStream.readObject();
            } // process Patient

        } // try to open and read the file
        catch (FileNotFoundException ex) { // catch File Not Found
            System.out.println("File named " + fileName + " not found.\n");
        } // catch File Not Found
        catch (EOFException ex) { // catch EOF
            try { // try close
                inStream.close();
            } // try close
            catch (IOException eexx) { // catch IOException
            } // catch IOException
        } // catch EOF
        catch (IOException ex) { // catch IOException
            System.out.println(ex);
        } // catch IOException
        catch (ClassNotFoundException ex) { // ClassNotFound
            System.out.println(ex);
        } // ClassNotFound
        return quiz.clone();
    }

    public Quiz readBackupQuestions(String filename) {
        this.fileName = filename;
        quiz = new Quiz(10000,"BackUpQuestion.bin");
        try { // try to open and read the file
            inFile = new FileInputStream(fileName);
            inStream = new ObjectInputStream(inFile);
             Question question ;
            do // attempt to read after EOF will cause exception & stop loop
            { // process Patient
                 question = (Question) inStream.readObject();
                if(question!= null)
                {
                quiz.addQuestion(question);
                }
            } while(question!=null);// process Patient

        } // try to open and read the file
        catch (FileNotFoundException ex) { // catch File Not Found
            System.out.println("File named " + fileName + " not found.\n");
        } // catch File Not Found
        catch (EOFException ex) { // catch EOF
            try { // try close
                inStream.close();
            } // try close
            catch (IOException eexx) { // catch IOException
            } // catch IOException
        } // catch EOF
        catch (IOException ex) { // catch IOException
            System.out.println(ex);
        } // catch IOException
        catch (ClassNotFoundException ex) { // ClassNotFound
            System.out.println(ex);
        } // ClassNotFound
        return quiz;
    }

}
