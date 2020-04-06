package texteditor;

import javax.swing.*;

public class MediumFontSize implements FontSize {

    @Override
    public void applyFontSize(JTextArea area)
    {
        java.awt.Font f = area.getFont();
        area.setFont(f.deriveFont(16f));
    }
        
    @Override
    public String toString()
    {
        return "Medium";
    }
}
