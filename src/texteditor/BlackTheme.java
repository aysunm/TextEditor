package texteditor;

import java.awt.*;

public class BlackTheme extends Theme {

    public BlackTheme(Font font, Emphasis emphasis, FontSize size)
    {
        super(font, emphasis, size);            
            
        if (font == null)
            setFont(new TimesNewRomanFont());
        if (emphasis == null)
            setEmphasis(new BoldEmphasis());
        if (size == null)
            setFontSize(new SmallFontSize());
    }
	
    @Override
    public void setBackground()
    {
        this.getJTextArea().setBackground(Color.black);
        this.getJTextArea().setForeground(Color.white);
	}
	
    @Override
    public void revertToDefault()
    {
        setFont(new TimesNewRomanFont());
	setEmphasis(new BoldEmphasis());
        setFontSize(new SmallFontSize());
    }
        
    @Override
    public String toString()
    {
        return "Black Theme";
    }
}
