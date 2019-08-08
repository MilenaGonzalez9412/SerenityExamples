package com.accenture.PruebaSerenityGradle.pasos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;

public class Pasos {

	WebDriver driver;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	@Step("Abrir el navegador en la página de Google")
	public void abreElNavegador() {
		driver.get("https://www.google.com.co/");
	}
	
	@Step("Escribe en la barra de búsqueda de Google")
	public void escribeEnLaBarraDeBusqueda() {
		driver.findElement(By.name("q")).sendKeys("Hola Mundo\n");
	}
	
}
