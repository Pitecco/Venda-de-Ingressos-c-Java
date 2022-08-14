/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_mapa;

import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class Ingresso_Pista extends Ingressos {
	private double valoringpista;

	
	 public double getValoringpista() {
		return valoringpista;
	}


	public void setValoringpista(double valoringpista) {
		this.valoringpista = valoringpista;
	}


	public void mostrarResumo(){
	        String msg = "Evento : " + getEvento_Relacionado()+ "\n";
	        msg = msg + "Nome : " + getNome() + "\n";
	        msg = msg + "Cpf : " + getCpf() + "\n";
	        msg = msg + "Data do evento : " + getData() + "\n";
	        msg = msg + "valor pista : " + getValoringpista()  + "\n";
	        JOptionPane.showMessageDialog(null, msg);
	   
	    }
}
