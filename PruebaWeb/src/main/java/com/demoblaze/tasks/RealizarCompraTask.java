package com.demoblaze.tasks;

import com.demoblaze.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static com.demoblaze.ui.OrdenUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarCompraTask implements Task {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList();
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            leerExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx","Cliente");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Enter.theValue(leerExcel.get(0).get("Nombre")).into(TXT_NOMBRE).thenHit(Keys.TAB),
                Enter.theValue(leerExcel.get(0).get("Pais")).into(TXT_PAIS).thenHit(Keys.TAB),
                Enter.theValue(leerExcel.get(0).get("Cuidad")).into(TXT_CUIDAD).thenHit(Keys.TAB),
                Enter.theValue(leerExcel.get(0).get("tarjeta")).into(TXT_TARJETA).thenHit(Keys.TAB),
                Enter.theValue(leerExcel.get(0).get("Mes")).into(TXT_MES).thenHit(Keys.TAB),
                Enter.theValue(leerExcel.get(0).get("Año")).into(TXT_ANO).thenHit(Keys.TAB),
                Click.on(BTN_COMPRAR)
                //Check.whether(WebElementQuestion.stateOf(LBL_FINALIZAR),
                        //WebElementStateMatchers.isPresent())
        );
    }

    public static Performable RealizarCompraTask() {
        return instrumented(RealizarCompraTask.class);
    }



}
