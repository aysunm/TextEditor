package texteditor;

import javax.swing.*;

public class BoldItalicEmphasis implements Emphasis {

    @Override
    public void applyEmphasis(JTextArea area)
    {
        java.awt.Font f = area.getFont();
        area.setFont(f.deriveFont(java.awt.Font.BOLD | java.awt.Font.ITALIC));
    }
        
    @Override
    public String toString()
    {
        return "Bold and Italic";
    }
}