/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_mapa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class Ingressos extends Evento {
	private String nome;
	private String cpf;
	private String evento_Relacionado;
	private LocalDate data;
	private double valor_unico ;
	private double valordesseing;
	
	
	public double getValordesseing() {
		return valordesseing;
	}

	public void setValordesseing(double valordesseing) {
		this.valordesseing = valordesseing;
	}

	public double getValor_unico() {
		return valor_unico;
	}

	public void setValor_unico(double valor_unico) {
		this.valor_unico = valor_unico;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setDate(String date) {
		this.data = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyy"));
	}

	public String getEvento_Relacionado() {
		return evento_Relacionado;
	}

	public void setEvento_Relacionado(String evento_Relacionado) {
		this.evento_Relacionado = evento_Relacionado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void mostrarResumo() {
		String msg = "Evento : " + evento_Relacionado + "\n";
		msg = msg + "Nome : " + nome + "\n";
		msg = msg + "Cpf : " + cpf + "\n";
		msg = msg + "Data do evento : " + data + "\n";

		JOptionPane.showMessageDialog(null, msg);

	}
}
