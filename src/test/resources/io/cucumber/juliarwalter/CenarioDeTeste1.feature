# language: pt

Funcionalidade: Acessar o site de vendas-aula.herokuapp

  Cenario: Peencher campos do Cliente
	Quando acesso o site: "https://vendas-aula.herokuapp.com/"
	Dado que clico em Clientes
	E clico em novo
	E preencho o campo de cadastro de Clientes: "Rogerio", "91", "r@gmail.com"
	E clico em salvar cadastro

  Cenario: Peencher campos de Produtos
	E que clico em Produtos
	E clico em novo produto
	E preencho o campo de cadastro de Produtos: "Abacaxi", "maduro", "2021-04-20 12:00:00 -0300", "10", "20", "40"
	E clico em salvar	
	Dado que clico em Pedidos
	E clico na opcao novo Pedido
	E vinculo o nome de um Cliente: "Rogerio"
	E clico em salvar voltar

  Cenario: Peencher novos intes de produtos
  	E que clico em Pedidos
	E clico em itens
	E clico no novo produto
	E seleciono a opcao de produto
	Entao preencho o campo: "40"
	Entao aperto em enviar
