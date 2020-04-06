package texteditor;

import javax.swing.*;
import java.awt.*;

public class SmallFontSize implements FontSize {

	public void applyFontSize(JTextArea area)
	{
            java.awt.Font f = area.getFont();
            area.setFont(f.deriveFont(12f));
	}
        
                @Override
        public String toString()
        {
            return "Small";
        }
}
