package ftt.ec.controller;

import java.math.BigInteger;

/*MVC
 * M - Model - Persistência - BD - DAO - JDBC - ftt.ec.model
 * V - View - Interface com usuário - WEB: HTML5, CSS3, JavaScript - Webcontent
 * C - Controller - Lógica - Regras de Negócio - Algoritmos - Java - JavaBeans - POJO - ftt.ec.controller
 * 					WEB API - Middleware - req & resp 
 * 
 * M, C -> Back-End
 * V	-> Front End
 * 
 * **/

public class Calc {
	
	public BigInteger add(BigInteger a, BigInteger b) {
		return a.add(b);
	}
	
	public String add(String a, String b) {
		
		BigInteger ai=new BigInteger(a);
		BigInteger bi=new BigInteger(b);
		
		return String.valueOf(ai.add(bi));
	}
	
	

}
