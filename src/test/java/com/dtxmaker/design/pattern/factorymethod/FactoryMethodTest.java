package com.dtxmaker.design.pattern.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest
{
    @Test
    public void testBootstrapTheme()
    {
        ThemeFactory themeFactory = new BootstrapThemeFactory();

        Control button = themeFactory.createButton();
        Control label = themeFactory.createLabel();
        Control pane = themeFactory.createPane();

        assertEquals("A bootstrap button", button.getName());
        assertEquals("A bootstrap label", label.getName());
        assertEquals("A bootstrap pane", pane.getName());
    }

    @Test
    public void MaterialThemeFactory()
    {
        ThemeFactory themeFactory = new MaterialThemeFactory();

        Control button = themeFactory.createButton();
        Control label = themeFactory.createLabel();
        Control pane = themeFactory.createPane();

        assertEquals("A material button", button.getName());
        assertEquals("A material label", label.getName());
        assertEquals("A material pane", pane.getName());
    }
}
