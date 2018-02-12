package br.com.java.bigdecimal;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import org.junit.Test;

public class CalculosTest 
{
	private Calculos calculos = new Calculos();
	private BigDecimal financeiro;
	
	
	@Test
	public void testaCalculoFinanceiro() 
	{
		BigDecimal precoUnico = new BigDecimal("999.87664");
		BigDecimal qtd = new BigDecimal("100");
		
		calculos.calculaFinanceiro(precoUnico, qtd);
	}
	
	@Test
	public void testaCalculoFinanceiroComZero() 
	{
		BigDecimal precoUnico = new BigDecimal("0");
		BigDecimal qtd = new BigDecimal("0");
		
		calculos.calculaFinanceiro(precoUnico, qtd);
	}
	
	@Test
	public void testaCalculoFinanceiroComNull() 
	{
		BigDecimal precoUnico = null;
		BigDecimal qtd = null;
		
		financeiro = calculos.calculaFinanceiro(precoUnico, qtd);
		
		assertEquals(new BigDecimal("0"), financeiro );
	}
	
}
