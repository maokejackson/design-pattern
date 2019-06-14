package com.dtxmaker.design.pattern.factorymethod;

public class MaterialThemeFactory implements ThemeFactory
{
    public Control createButton()
    {
        return new MaterialButton();
    }

    public Control createLabel()
    {
        return new MaterialLabel();
    }

    public Control createPane()
    {
        return new MaterialPane();
    }
}
