package com.dtxmaker.design.pattern.factorymethod;

public class FactoryMethodMain
{
    public static void main(String[] args)
    {
        ThemeFactory themeFactory = parseTheme(args);

        Control button = themeFactory.createButton();
        Control label = themeFactory.createLabel();
        Control pane = themeFactory.createPane();

        System.out.println(button.getName());
        System.out.println(label.getName());
        System.out.println(pane.getName());
    }

    private static ThemeFactory parseTheme(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("theme not specified, using material theme");
            return new MaterialThemeFactory();
        }

        switch (args[0])
        {
            case "bootstrap":
                return new BootstrapThemeFactory();
            case "material":
                return new MaterialThemeFactory();
            default:
                System.out.println("Theme not recognized, using material theme");
                return new MaterialThemeFactory();
        }
    }
}
