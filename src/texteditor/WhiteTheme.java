package texteditor;

import javax.swing.*;
import java.awt.*;

public class WhiteTheme extends Theme {

	public WhiteTheme(Font font, Emphasis emphasis, FontSize size)
	{
            super(font, emphasis, size);
            
            if (font == null)
                setFont(new ArialFont());
            if (size == null)
                setFontSize(new MediumFontSize());
	}
	
	@Override
	public void setBackground()
	{
            this.getJTextArea().setBackground(Color.white);
            this.getJTextArea().setForeground(Color.black);
	}
	
	@Override
	public void revertToDefault()
	{
		setFont(new ArialFont());
		setEmphasis(null);
                setFontSize(new MediumFontSize());
	}
        
        @Override
        public String toString()
        {
            return "White Theme";
        }
}
