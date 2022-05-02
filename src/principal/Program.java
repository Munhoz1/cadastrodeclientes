//defini��o do pacote
package principal;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

//defini��o da classe
public class Program {

	// m�todo padr�o para execu��o do projeto/classe
	public static void main(String[] args) {

		// imprimindo mensagem no console do eclipse..
		System.out.println("\nAula 01 - Java Webdeveloper COTI Inform�tica\n");

		try {

			// entrada de dados
			Integer idCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente:"));
			String nome = JOptionPane.showInputDialog("Informe o nome do cliente:");
			String email = JOptionPane.showInputDialog("Informe o email do cliente:");
			String cpf = JOptionPane.showInputDialog("Informe o cpf fo cliente:");

			// criando um objeto (vari�vel de inst�ncia)
			Cliente cliente = new Cliente();

			// definindo os dados do cliente (set)
			cliente.setIdCliente(idCliente);
			cliente.setNome(nome);
			cliente.setEmail(email);
			cliente.setCpf(cpf);

			// imprimindo os dados do cliente (get)
			System.out.println("Dados do Cliente:");
			System.out.println("Id do Cliente..........: " + cliente.getIdCliente());
			System.out.println("Nome...................: " + cliente.getNome());
			System.out.println("Email..................: " + cliente.getEmail());
			System.out.println("CPF....................: " + cliente.getCpf());
			
			//criando um objeto para a classe ClienteRepository
			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.exportarDados(cliente);
			
			System.out.println("\nArquivo gravado com sucesso.");
			
		} catch (Exception e) {

			System.out.println("Ocorreu um erro!");
			System.out.println("Descri��o: " + e.getMessage());
		}
	}
}




