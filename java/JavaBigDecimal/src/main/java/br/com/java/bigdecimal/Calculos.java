package br.com.java.bigdecimal;

import java.math.BigDecimal;

public class Calculos 
{
	
	public BigDecimal calculaFinanceiro(BigDecimal precoUnico, BigDecimal qtd) 
    {
    		if( precoUnico != null && qtd != null )
    			return precoUnico.multiply(qtd);
    		
    		return new BigDecimal("0");
    }

}
