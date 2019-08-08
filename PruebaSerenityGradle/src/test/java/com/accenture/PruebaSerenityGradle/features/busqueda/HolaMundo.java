package com.accenture.PruebaSerenityGradle.features.busqueda;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.accenture.PruebaSerenityGradle.pasos.Pasos;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class HolaMundo {
	
	@Managed(driver = "chrome")
	public WebDriver driver;
	
	@Steps
	public Pasos milena;
	
	@Before
	public void cargaDriver() {
		milena.setDriver(driver);
	}
	
	@Test
	public void busquedaHolaMundoGoogle() {
		milena.abreElNavegador();
		milena.escribeEnLaBarraDeBusqueda();
	}
}
