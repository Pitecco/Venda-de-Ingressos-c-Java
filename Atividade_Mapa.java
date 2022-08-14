/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_mapa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Atividade_Mapa {
	public static Evento ev = new Evento();

	public static void venderingressocamarote() {
		Ingresso_Camarote ic = new Ingresso_Camarote();
		ic.setNome(JOptionPane.showInputDialog(null, "Evento: " + ev.getNome_evento() + "informe seu nome: "));
		ic.setCpf(JOptionPane.showInputDialog(null, "cpf: "));

		ic.setValor_IngressoCamarote(ev.getValor_unico());
		
		// esse ja � o metodo que imprime o valor
		JOptionPane.showMessageDialog(null, "preco do ingresso camarote: " + ic.getValor_IngressoCamarote());
		//adicionando dados do evento no ingresso:
		ic.setValordesseing(ic.getValor_IngressoCamarote());
		ic.setNome_evento(ev.getNome_evento());
		ic.setData_evento(ev.getData_evento());
		ev.getLista().add(ic);

	}
	public static void buscaringresso() {
		
		String buscarcpf=JOptionPane.showInputDialog(null,"informe seu cpf para buscar seu ingresso: ");
		for(int i=0;i< ev.getLista().size();i++) {
			if(ev.getLista().get(i).getCpf().equals(buscarcpf)) {
				
				JOptionPane.showMessageDialog(null,"Evento: " + ev.getLista().get(i).getNome_evento() +
						" data do evento: "+ ev.getLista().get(i).getData_evento()+
						"nome: "+ev.getLista().get(i).getNome()+
						" cpf: "+ev.getLista().get(i).getCpf()+
						"valor desse ingresso "+ev.getLista().get(i).getValordesseing() );
			}
			
		}
	}

	public static void venderingressovip() {
		//chamando o ingresso vip
		Ingresso_Vip iv = new Ingresso_Vip();
		iv.setNome(JOptionPane.showInputDialog(null, "Evento: " + ev.getNome_evento() + "informe seu nome: "));
		iv.setCpf(JOptionPane.showInputDialog(null, "cpf: "));

		iv.setValor_IngressoVip(ev.getValor_unico());
		// esse ja � o metodo que imprime o valor
		JOptionPane.showMessageDialog(null, "preco do ingresso camarote: " + iv.getValor_IngressoVip());
		//adicionando dados do evento no ingresso:
		iv.setValordesseing(iv.getValor_IngressoVip());
		iv.setNome_evento(ev.getNome_evento());
		iv.setData_evento(ev.getData_evento());
		ev.getLista().add(iv);

	}

	public static void venderingressopista() {
		//chamando o ingressopista
		Ingresso_Pista ip = new Ingresso_Pista();
		ip.setNome(JOptionPane.showInputDialog(null, "Evento: " + ev.getNome_evento() + "informe seu nome: "));
		ip.setCpf(JOptionPane.showInputDialog(null, "cpf: "));

		ip.setValoringpista(ev.getValor_unico());
		// esse ja � o metodo que imprime o valor
		JOptionPane.showMessageDialog(null, "preco do ingresso camarote: " + ip.getValoringpista());
		ip.setValordesseing(ip.getValoringpista());
		ip.setNome_evento(ev.getNome_evento());
		ip.setData_evento(ev.getData_evento());
		ev.getLista().add(ip);
		JOptionPane.showMessageDialog(null, "venda de ingresso pista efetuada com exito");
	}

	public static Evento criarevento() {
		try {
			Evento ee = new Evento();
			ee.setNome_evento(JOptionPane.showInputDialog(null, "nome do evento"));
			ee.setData_evento(JOptionPane.showInputDialog(null, "data do evento"));
			ee.setValor_unico(
					Double.parseDouble(JOptionPane.showInputDialog(null, "valor unico do ingresso do evento")));
			ee.setCapacidademax(Integer.parseInt(JOptionPane.showInputDialog(null, "informe a capacidade maxima")));
			JOptionPane.showMessageDialog(null, " evento criado !");
			return ee;

		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "ocorreu um erro ao criar evento");
			return null;
		}

	}

	public static void menuingressos() {
		if (ev.getNome_evento() != null) {
			if (ev.getLista().size() < ev.getCapacidademax()) {
				int opcing;
				opcing = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Evento nome: " + ev.getNome_evento() + "   valor unico:" + ev.getValor_unico() + "   data: "
								+ ev.getData_evento() + "    qual o tipo de ingresso?  1-camarote 2-pista 3-vip"));
				switch (opcing) {

				case 1: {
					venderingressocamarote();
					break;
				}

				case 2: {
					venderingressopista();
					break;
				}
				case 3: {
					venderingressovip();
					break;
				}
				}

			} else {
				JOptionPane.showMessageDialog(null, "ingressos lotados nao � possivel efetuar venda");
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"nao E possivel comprar ingresso pois E necessario existir um evento para ele");

		}

	}

	public static void menuprincipal() {
		int opc;
		//fazer o loop enquanto o opc for diferente de zero (ai ele vai ficar repetindo as perguntas enquant nao sair do sistema)
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite a opcao: 1 - Criar evento 2 -  Comprar ingresso 3-quantidade de ingressos vendidos 4-buscar seu ingresso"
							+ " 0- Sair"));

			switch (opc) {
			case 1: {
				ev = criarevento();
				break;
			}
			case 2: {
				menuingressos();
				break;
			}
			case 3: {
				JOptionPane.showMessageDialog(null," quantidade de ingressos comprados: "+ ev.getLista().size()); 
				break;
			}
			case 4: {
				buscaringresso();
				break;
			}
			case 0: {
				JOptionPane.showMessageDialog(null, "operacao finalizada");
				break;
			}

			}
		} while (opc != 0);
	}

	public static void main(String[] args) {
		menuprincipal();
	}

}
