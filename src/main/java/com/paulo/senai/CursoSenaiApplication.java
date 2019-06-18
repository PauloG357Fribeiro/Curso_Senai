package com.paulo.senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.paulo.senai.domain.Cidade;
import com.paulo.senai.domain.Cliente;
import com.paulo.senai.domain.Endereco;
import com.paulo.senai.domain.Estado;
import com.paulo.senai.domain.enuns.TipoCliente;
import com.paulo.senai.repositories.CidadeRepository;
import com.paulo.senai.repositories.ClienteRepository;
import com.paulo.senai.repositories.EnderecoRepository;
import com.paulo.senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner{

	// Uma dependencia para instanciar todo o objeto.
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Instancio estado e preencho
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		// Foi chamado acima e aqui salva.
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		cidadeRepository.saveAll(Arrays.asList(c1,c2));
		
		Cliente cli1 = new Cliente(null, "Crispim Luiz", "12345678987", "c.luiz@fiemg.com.br",
				TipoCliente.PESSOAFISICA);
		
		Cliente cli2 = new Cliente(null, "Paulo Gabriel", "15086197600", "paulog25.comercial@gmail.com2",
				TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("34900000000", "98765432112"));
		cli1.getTelefones().addAll(Arrays.asList("34900000123", "98765400000"));
		cli2.getTelefones().addAll(Arrays.asList("77777777777", "99999999999"));
		clienteRepository.saveAll(Arrays.asList(cli1,cli2));
		
		Endereco e1 = new Endereco(null, "Rua das Emboabas", "55b", "Ap 310", "Jardim", "38447587", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua Alameda Nasciute", "234", "null", "Centro", "34555098", cli2, c2);
		cli1.getEnderecos().addAll(Arrays.asList(e1));
		cli2.getEnderecos().addAll(Arrays.asList(e2));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
		
		Cliente clin1 = new Cliente(null, "Crispim Luiz", "12345678987", "c.luiz@fiemg.com.br2",
				TipoCliente.PESSOAFISICA);
		clin1.getTelefones().addAll(Arrays.asList("34900000000", "9876543212"));
		
		
		Cliente clin2 = new Cliente(null, "Paulo Gabriel", "15086197600", "paulog25.comercial@gmail.com",
				TipoCliente.PESSOAFISICA);
		clin2.getTelefones().addAll(Arrays.asList("34988712090", "34996531231"));
		
		
		Cliente clin3 = new Cliente(null, "Guilherme Araújo", "12345678912", "guilherme24@gmail.com",
				TipoCliente.PESSOAFISICA);
		clin3.getTelefones().addAll(Arrays.asList("34998390612", "34997854237"));
		
		
		Cliente clin4 = new Cliente(null, "Caio Martins", "78606683604", "durgs69@outlook.com",
				TipoCliente.PESSOAFISICA);
		clin4.getTelefones().addAll(Arrays.asList("34985741684", "34984278641"));
		
		
		Cliente clin5 = new Cliente(null, "Pedro Henrique", "87546920184", "pedro.herique.batist@gmail.com",
				TipoCliente.PESSOAFISICA);
		clin5.getTelefones().addAll(Arrays.asList("34992234314", "3432132461"));
		
		
		Cliente clin6 = new Cliente(null, "Wender", "74851236485", "windows10@gmail.com",
				TipoCliente.PESSOAFISICA);
		clin6.getTelefones().addAll(Arrays.asList("34945214902", "34987654321"));
		
		
		Cliente clin7 = new Cliente(null, "Alan", "34857951002", "alan.0000@gmail.com",
				TipoCliente.PESSOAFISICA);
		clin7.getTelefones().addAll(Arrays.asList("34985201476", "34974152890"));
		
		Cliente clin8 = new Cliente(null, "Anna Luiza", "84572013005", "alpino69@gmail.com",
				TipoCliente.PESSOAFISICA);
		clin8.getTelefones().addAll(Arrays.asList("34998412057", "34996321257"));
		
		Cliente clin9 = new Cliente(null, "Edin", "87451247840", "edin24adr@gmail.com",
				TipoCliente.PESSOAFISICA);
		clin9.getTelefones().addAll(Arrays.asList("34985026514", "34985742631"));
		
		Cliente clin10 = new Cliente(null, "Dverde", "87452106354", "verdinhosdaboa@gmail.com",
				TipoCliente.PESSOAFISICA);
		clin10.getTelefones().addAll(Arrays.asList("34974320854", "34965472102"));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, clin1,clin2,clin3,clin4,clin5,clin6,clin7,clin8,clin9,clin10));
		
	}

}
