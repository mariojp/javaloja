package br.com.loja.gui;

import java.util.Scanner;

public class Terminal {

	private Scanner teclado = new Scanner(System.in);

	public Terminal() {
		init();
		String op;
		do {
			op = menu();
		} while (!op.equals("S"));
	}

	private String menu() {
			String op = menuPrincipal();
			switch (op) {
			case "1":
				venda();
				break;
			case "2":
				produto();
				break;
			case "3":
				relatorio();
				break;
			default:
				System.out.println("SAIR");
				break;
			}
			return op;
	}

	private String menuPrincipal() {
		System.out.println("MENU");
		System.out.println("1 - VENDA");
		System.out.println("2 - PRODUTO");
		System.out.println("3 - RELATÓRIO");
		System.out.println("4 - SAIR");
		String op = "";
		do {
			System.out.print("DIGITE UMA OPÇÃO: ");
			op = teclado.nextLine();
		} while (!"1234".contains(op));
		return op;
	}

	private void relatorio() {
		System.out.println("MENU");
		System.out.println("1 - RELATÓRIO DE VENDA");
		System.out.println("2 - RELATÓRIO DE CLIENTE");
		System.out.println("3 - RELATÓRIO DE PRODUTO");
		System.out.println("S - SAIR");
		String opr = "";
		do {
			System.out.print("DIGITE UMA OPÇÃO: ");
			opr = teclado.nextLine();
		} while (!"123S".contains(opr));

	}

	private void venda() {
		System.out.println("VENDA");
		System.out.println("S - SAIR");
		System.out.println("I - INICIAR");
		String opv = "";
		do {
			System.out.print("DIGITE UMA OPÇÃO: ");
			opv = teclado.nextLine();
		} while (!"IS".contains(opv));
		System.out.print("DIGITE O CPF DO CLIENTE: ");
		String cpf = teclado.nextLine();
		
		String codigo;
		String quantidade;
		String continuar;
		do {
			System.out.print("DIGITE O CODIGO DO PRODUTO: ");
			codigo = teclado.nextLine();
			System.out.print("DIGITE A QUANTIDADE: ");
			quantidade = teclado.nextLine();
			System.out.print("FINALIZAR (F): ");
			continuar = teclado.nextLine();
		}while (!continuar.equals("F"));
		
	}

	private void produto() {
		System.out.println("MENU");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - ALTERAR");
		System.out.println("3 - EXCLUIR");
		System.out.println("4 - LISTAR");
		System.out.println("S - SAIR");
		String op = "";
		do {
			System.out.print("DIGITE UMA OPÇÃO: ");
			op = teclado.nextLine();
		} while (!"1234S".contains(op));
	}

	private void init() {
		System.out.println("INICIANDO LOJA");
	}

}
