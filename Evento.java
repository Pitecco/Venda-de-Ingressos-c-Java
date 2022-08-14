/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_mapa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;



/**
 *
 * @author Win10
 */
public class Evento  {
	private String nome_evento;
	private String data_evento;
	private double valor_unico;
	private int capacidademax;
	private ArrayList<Ingressos> lista = new ArrayList<>();

	
	public double getValor_unico() {
		return valor_unico;
	}

	public void setValor_unico(double valor_unico) {
		this.valor_unico = valor_unico;
	}

	public void setLista(ArrayList<Ingressos> lista) {
		this.lista = lista;
	}

	public ArrayList<Ingressos> getLista() {
		return lista;
	}

	public int getCapacidademax() {
		return capacidademax;
	}

	public void setCapacidademax(int capacidademax) {
		this.capacidademax = capacidademax;
	}

	public String getNome_evento() {
		return nome_evento;
	}

	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}

	public String getData_evento() {
		return data_evento;
	}

	public void setData_evento(String data_evento) {
		this.data_evento = data_evento;
	}


	
	

}
