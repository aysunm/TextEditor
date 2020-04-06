package texteditor;

import javax.swing.*;

public class ItalicEmphasis implements Emphasis {

    @Override
    public void applyEmphasis(JTextArea area)
    {
        java.awt.Font f = area.getFont();
        area.setFont(f.deriveFont(java.awt.Font.ITALIC));
    }
        
    @Override
    public String toString()
    {
        return "Italic";
    }
}
