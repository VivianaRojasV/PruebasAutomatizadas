package com.demoblaze.stepsDefinitions;


import com.demoblaze.tasks.AgregarCarritoTask;
import com.demoblaze.tasks.RealizarCompraTask;
import com.demoblaze.ui.CompraExitosaUI;
import com.demoblaze.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CarritoCompraStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());

    }
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList();

    @Dado("Me encuentro en el portal del Demoblaze")
    public void meEncuentroEnElPortalDelDemoblaze() throws IOException {
        leerExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx","Datos");
        theActorCalled("Viviana").wasAbleTo(Open.url(leerExcel.get(0).get("URL")));

    }
    @Cuando("Elija dos productos a comprar")
    public void elijaDosProductosAComprar() {
        theActorInTheSpotlight().attemptsTo(AgregarCarritoTask.AgregarCarritoTask());
        theActorInTheSpotlight().attemptsTo(RealizarCompraTask.RealizarCompraTask());
    }
    @Entonces("Realizar compra")
    public void realizarCompra() {
        GivenWhenThen.seeThat(WebElementQuestion.the(CompraExitosaUI.LBL_FINALIZAR),
               WebElementStateMatchers.containsText("Thank you for your purchase!")
        );
    }
}
