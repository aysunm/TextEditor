package texteditor;

import javax.swing.*;

public abstract class Font {
    public abstract String getFontName();
        
    public void applyFont(JTextArea area)
    {
        area.setFont(new java.awt.Font(getFontName(), java.awt.Font.PLAIN, 12));   
    }
}
