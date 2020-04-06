package texteditor;

import java.awt.*;
import javax.swing.*;

public abstract class Theme {
	
	Font myFont;
	Emphasis myEmphasis;
	FontSize myFontSize;
        JTextArea myArea;
	
	public Theme(Font font, Emphasis emphasis, FontSize size)
	{
		setFont(font);
		setEmphasis(emphasis);
                setFontSize(size);
	}
	

        
	public void setFont(Font font)
	{
		myFont = font;
	}
	public void setEmphasis(Emphasis emphasis)
	{
		myEmphasis = emphasis;
	}
	public void setFontSize(FontSize size)
	{
            if (size == null)
            {
                size = new MediumFontSize();
            }
		
            myFontSize = size;
	}
        
        public void setTextArea(JTextArea area)
        {
            myArea = area;
        }
        
	public Font getFont()
	{
		return myFont;
	}
	public Emphasis getEmphasis()
	{
		return myEmphasis;
	}
	public FontSize getFontSize()
	{
		return myFontSize;
	}
	public JTextArea getJTextArea()
        {
            return myArea;
        }
        
	public void update()
	{
            JTextArea area = this.getJTextArea();
            
            setBackground();
            if (this.getFont() != null)
            {
                this.getFont().applyFont(area);
            }
            if (this.getEmphasis() != null)
            {
            	this.getEmphasis().applyEmphasis(area);
            }
            else {
                java.awt.Font f = area.getFont();
                area.setFont(f.deriveFont(java.awt.Font.PLAIN));
            }
            this.getFontSize().applyFontSize(area);
            
	}
	
        public void executeCommand(Command cmd)
        {
            cmd.setArea(this.getJTextArea());
            if(!cmd.execute())
            {
                JOptionPane.showMessageDialog(null, "Hata Detayı:\n" + cmd.toString(), "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
        
	public abstract void setBackground();
	public abstract void revertToDefault();
}
