package com.demoblaze.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.concurrent.TimeUnit;


public class Esperar implements Interaction {

    private int seconds;

    public Esperar(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static Performable EstosSegundos(int Segundos)
    {
        return Instrumented.instanceOf(Esperar.class).withProperties(Segundos);
    }
}