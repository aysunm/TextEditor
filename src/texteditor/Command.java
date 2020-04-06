package texteditor;

import javax.swing.*;

public abstract class Command {
    
    protected JTextArea myArea;
    
    public void setArea (JTextArea area)
    {
        myArea = area;
    }
    public JTextArea getArea ()
    {
        return myArea;
    }
    
    abstract boolean execute();
}
