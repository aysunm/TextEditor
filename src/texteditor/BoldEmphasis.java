package texteditor;

import javax.swing.*;

public class BoldEmphasis implements Emphasis {

    @Override
    public void applyEmphasis(JTextArea area)
    {
        java.awt.Font f = area.getFont();
        area.setFont(f.deriveFont(java.awt.Font.BOLD));
    }
        
    @Override
    public String toString()
    {
        return "Bold";
    }
}
