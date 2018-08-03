package com.felipeabreu.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipeabreu.cursomc.domain.Categoria;
import com.felipeabreu.cursomc.domain.Cidade;
import com.felipeabreu.cursomc.domain.Cliente;
import com.felipeabreu.cursomc.domain.Endereco;
import com.felipeabreu.cursomc.domain.Estado;
import com.felipeabreu.cursomc.domain.ItemPedido;
import com.felipeabreu.cursomc.domain.Pagamento;
import com.felipeabreu.cursomc.domain.PagamentoComBoleto;
import com.felipeabreu.cursomc.domain.PagamentoComCartao;
import com.felipeabreu.cursomc.domain.Pedido;
import com.felipeabreu.cursomc.domain.Produto;
import com.felipeabreu.cursomc.domain.enums.EstadoPagamento;
import com.felipeabreu.cursomc.domain.enums.TipoCliente;
import com.felipeabreu.cursomc.repositories.CategoriaRepository;
import com.felipeabreu.cursomc.repositories.CidadeRepository;
import com.felipeabreu.cursomc.repositories.ClienteRepository;
import com.felipeabreu.cursomc.repositories.EnderecoRepository;
import com.felipeabreu.cursomc.repositories.EstadoRepository;
import com.felipeabreu.cursomc.repositories.ItemPedidoRepository;
import com.felipeabreu.cursomc.repositories.PagamentoRepository;
import com.felipeabreu.cursomc.repositories.PedidoRepository;
import com.felipeabreu.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
