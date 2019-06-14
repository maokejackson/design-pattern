package com.dtxmaker.design.pattern.factorymethod;

public interface ThemeFactory
{
    Control createButton();

    Control createLabel();

    Control createPane();
}
