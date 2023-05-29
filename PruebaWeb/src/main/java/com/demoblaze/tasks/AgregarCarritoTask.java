package com.demoblaze.tasks;

import com.demoblaze.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.demoblaze.ui.InicioUI.*;
import static com.demoblaze.ui.OrdenUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AgregarCarritoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             WaitUntil.the(BTN_MENU_CATEGORIA, isPresent()).forNoMoreThan(10).seconds(),
             Click.on(BTN_MENU_CATEGORIA),
             WaitUntil.the(BTN_PHONES, isPresent()).forNoMoreThan(10).seconds(),
             Click.on(BTN_PHONES),
             Scroll.to(BTN_PHONES1),
             Click.on(BTN_PHONES1),
             WaitUntil.the(BTN_ADICIONAR, isPresent()).forNoMoreThan(10).seconds(),
             Click.on(BTN_ADICIONAR),
             Esperar.EstosSegundos(3),
             Click.on(BTN_MENU),
             Scroll.to(BTN_PHONES2),
             Click.on(BTN_PHONES2),
             WaitUntil.the(BTN_ADICIONAR, isPresent()).forNoMoreThan(10).seconds(),
             Click.on(BTN_ADICIONAR),
             Esperar.EstosSegundos(3),
             Click.on(BTN_MENU),
             Esperar.EstosSegundos(3),
             Click.on(BTN_CARRITO),
             Esperar.EstosSegundos(3),
             Click.on(BTN_ORDEN)
        );
    }

    public static Performable AgregarCarritoTask() {
        return instrumented(AgregarCarritoTask.class);
    }
}
