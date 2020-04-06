package texteditor;

import javax.swing.*;

public class LargeFontSize implements FontSize {

    @Override
    public void applyFontSize(JTextArea area)
    {
        java.awt.Font f = area.getFont();
        area.setFont(f.deriveFont(20f));
    }
        
    @Override
    public String toString()
    {
        return "Large";
    }
}
