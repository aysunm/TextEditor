/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

/**
 *
 * @author aysun
 */
import java.io.*;
import javax.swing.JOptionPane;

public class SaveFileCommand extends Command {
    
    File myFile;
    
    public SaveFileCommand(File file)
    {
        myFile = file;
    }
    
    @Override
    public boolean execute()
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile));
            String data = this.getArea().getText();
            writer.write(data);
            writer.close();
        }  catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        return "[SaveFileCommand] Path=" + (myFile == null ? "(null)" : myFile.getAbsolutePath());
    }
}
