package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {
    public static Target BTN_MENU_CATEGORIA = Target.the("Boton Menu de Categorias").
            locatedBy("//*[@id='cat']");

    public static Target BTN_PHONES = Target.the("Boton seleccionar un telefono").
            locatedBy("//div[@id='contcont']//a[2]");

    public static Target BTN_PHONES1 = Target.the("Telefono uno").
            locatedBy("//img[@src='imgs/iphone_6.jpg']");
    public static Target BTN_PHONES2 = Target.the("Telefono dos").
            locatedBy("//img[@src='imgs/xperia_z5.jpg']");

    public static Target BTN_ADICIONAR = Target.the("Boton adicionar producto").
            locatedBy("//a[@class='btn btn-success btn-lg']");

    public static Target BTN_MENU = Target.the("Boton devolver al menu").
            locatedBy("//a[@id='nava']");

    public static Target BTN_CARRITO= Target.the("Boton devolver al menu").
            locatedBy("//a[@id='cartur']");

}

