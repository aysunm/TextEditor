/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.undo.UndoManager;

/**
 *
 * @author aysun
 */
public class UndoCommand extends Command {
    
    UndoManager myUndoManager;
    
    public UndoCommand (UndoManager manager)
    {
        myUndoManager = manager;
    }
    
    @Override
    public boolean execute()
    {
        try {
            while(myUndoManager.canUndo())
            {
                myUndoManager.undo();
                String str = this.getArea().getText();
                if (str.length() == 0)
                {
                    return true;
                }
                if(str.charAt(str.length() - 1) == ' ' || str.charAt(str.length() - 1) == '\n' || str.charAt(str.length() - 1) == '\t')
                {
                    break;
                }
            }
            if (myUndoManager.canUndo())
            {
                myUndoManager.undo();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }   
        return true;
    }
    
    @Override
    public String toString()
    {
       return "UndoCommand"; 
    }

    
}
