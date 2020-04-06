package texteditor;

import java.io.*;

public class OpenFileCommand extends Command {
    
    File myFile;
    
    public OpenFileCommand (File file)
    {
        myFile = file;
    }
    
    @Override
    public boolean execute()
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line=null;
            while (reader.ready()) {
                line=reader.readLine();
                this.getArea().append(line + "\n");
            }
            reader.close(); 
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }   
        return true;
    }
    
    @Override
    public String toString()
    {
        return "[OpenFileCommand] Path=" + (myFile == null ? "(null)" : myFile.getAbsolutePath());
    }
}
