package com.dtxmaker.design.pattern.factorymethod;

public class BootstrapThemeFactory implements ThemeFactory
{
    public Control createButton()
    {
        return new BootstrapButton();
    }

    public Control createLabel()
    {
        return new BootstrapLabel();
    }

    public Control createPane()
    {
        return new BootstrapPane();
    }
}
