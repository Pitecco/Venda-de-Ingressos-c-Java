/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_mapa;

/**
 *
 * @author Win10
 */
public class Ingresso_Camarote extends Ingressos {
    
   private double valor_IngressoCamarote ;
    
     public double getValor_IngressoCamarote() {
	return valor_IngressoCamarote;
}

public void setValor_IngressoCamarote(double valorunico) {
	this.valor_IngressoCamarote = valorunico + (valorunico*0.6);
}

	
     
}
