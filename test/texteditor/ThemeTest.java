/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import javax.swing.JTextArea;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


import texteditor.*;
import javax.swing.*;

/**
 *
 * @author aysun
 */
public class ThemeTest {    
    Theme tema;
    JTextArea textArea;
    public ThemeTest() {
     textArea = new JTextArea();   
     tema = new WhiteTheme(new ArialFont(), null, null);
     tema.setTextArea(textArea);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void ChangeThemeToBlack()
    {
        Theme black = new BlackTheme(new TimesNewRomanFont(), null, null);
        tema = black;
        tema.setTextArea(textArea);
        tema.revertToDefault();
        tema.update();
        
        assertTrue(tema.toString().equals("Black Theme"));
        assertTrue(tema.getFont().toString().equals("Times New Roman"));
    }
    
    @Test
    public void ChangeThemeFont()
    {
        tema.setTextArea(textArea);
        tema.setFont(new ArialFont());
        tema.update();
        assertTrue(tema.getFont().toString().equals("Arial"));
    }
    
     @Test
    public void ChangeThemeFontSize()
    {
        tema.setTextArea(textArea);
        tema.setFontSize(new LargeFontSize());
        tema.update();
        assertTrue(tema.getFontSize().toString().equals("Large"));
    }
    
     @Test
    public void ChangeThemeEmphasis()
    {
        tema.setTextArea(textArea);
        tema.setEmphasis(new BoldItalicEmphasis());
        tema.update();
        assertTrue(tema.getEmphasis().toString().equals("Bold and Italic"));
    }
    
       @Test
    public void ClearThemeEmphasis()
    {
        tema.setTextArea(textArea);
        tema.setEmphasis(null);
        tema.update();
        
        assertNull(tema.getEmphasis());
    }
    
    @Test(expected = NullPointerException.class)
    public void NoTextAreaTest()
    {
        tema.setTextArea(null);
        tema.update();
    }
}