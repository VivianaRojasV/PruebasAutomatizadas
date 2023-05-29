package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrdenUI {

    public static Target BTN_ORDEN= Target.the("Boton devolver al menu").
            locatedBy("//button[@class='btn btn-success']");

    public static Target TXT_NOMBRE= Target.the("Ingresar nombre").
            locatedBy("//input[@id='name']");

    public static Target TXT_PAIS= Target.the("Ingresar pais").
            locatedBy("//input[@id='country']");

    public static Target TXT_CUIDAD= Target.the("Ingresar cuidad").
            locatedBy("//input[@id='city']");

    public static Target TXT_TARJETA= Target.the("Ingresar tarjeta").
            locatedBy("//input[@id='card']");

    public static Target TXT_MES= Target.the("Ingresar mes").
            locatedBy("//input[@id='month']");

    public static Target TXT_ANO= Target.the("Ingresar año").
            locatedBy("//input[@id='year']");

    public static Target BTN_COMPRAR= Target.the("Boton comprar").
            locatedBy("//button[@onclick='purchaseOrder()']");


}


