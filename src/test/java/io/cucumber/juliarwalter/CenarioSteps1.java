package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps1 {

    @Quando("acesso o site: {string}")
    public void acessoSite(String string) {
        Comando.abrir(string);
    }
    
    @Dado("que clico em Clientes")
    public void queClicoEmClientes() {
        Comando.seletorQueryCss("a[href='/clientes']").click();
    }
    
    @Dado("clico em novo")
    public void clicoEmNovo() throws InterruptedException{
        Thread.sleep(2000);
        Comando.seletorQueryXpath("/html/body/div/div[1]/a/span").click();
    }
    
    @Dado("preencho o campo de cadastro de Clientes: {string}, {string}, {string}")
    public void campoCadastroDeClientes(String nome, String telefone, String email) throws InterruptedException{
        Thread.sleep(2000);
        Comando.seletorQueryCss("#cliente_nome").sendKeys(nome);
        Comando.seletorQueryCss("#cliente_telefone").sendKeys(telefone);
        Comando.seletorQueryCss("#cliente_email").sendKeys(email);
    }
    
    @Dado("clico em salvar cadastro")
    public void clicoSalvarCadastro() {
        Comando.seletorQueryXpath("//*[@id='new_cliente']/div[4]/div/input").click();
    }
    
    @Dado("que clico em Produtos")
    public void clicoEmProdutos() {
        Comando.seletorQueryCss("a[href='/produtos']").click();
    }
    
    @Dado("clico em novo produto")
    public void clicoNovoProduto() throws InterruptedException{
        Thread.sleep(2000);
        Comando.seletorQueryXpath("/html/body/div/div[1]/a").click();
    }
    
    @Dado("preencho o campo de cadastro de Produtos: {string}, {string}, {string}, {string}, {string}, {string}")
    public void cadastroProdutos(String nome, String descricao, String venc, String quant, String preco, String precov) throws InterruptedException{
        Thread.sleep(2000);
        Comando.seletorQueryCss("#produto_nome").sendKeys(nome);
        Comando.seletorQueryCss("#produto_descricao").sendKeys(descricao);
        Comando.seletorQueryCss("#produto_vencimento").sendKeys(venc);
        Comando.seletorQueryCss("#produto_quantidade").sendKeys(quant);
        Comando.seletorQueryCss("#produto_preco_compra").sendKeys(preco);
        Comando.seletorQueryCss("#produto_preco_venda").sendKeys(precov);
    }
    
    @Dado("clico em salvar")
    public void clicoEmSalvar() {
        Comando.seletorQueryXpath("//*[@id='new_produto']/div[7]/div/input").click();
    }

    
    @Dado("clico na opcao novo Pedido")
    public void clicoOpcaoNovoPedido()  throws InterruptedException{
        Thread.sleep(3000);
        Comando.seletorQueryXpath("/html/body/div/div[1]/a").click();
    }
    
    @Dado("vinculo o nome de um Cliente: {string}")
    public void vinculoCliente(String nome) throws InterruptedException{
        Thread.sleep(2000);
        Comando.seletorQueryCss("#pedido_cliente_id").sendKeys(nome);
    }
    
    @Dado("clico em salvar voltar")
    public void clicoSalvarVoltar() {
        Comando.seletorQueryXpath("//*[@id='new_pedido']/div[2]/div/input").click();
    }
    
    @Dado("clico em itens")
    public void clicoItens() throws InterruptedException{
        Thread.sleep(2000);
        Comando.seletorQueryXpath("//*[@id='pedido_64']/td[3]/a").click();
    }
    
    @Dado("clico no novo produto")
    public void clicoNovoProdutoAdd()  throws InterruptedException{
        Thread.sleep(2000);
        Comando.seletorQueryXpath("/html/body/div/div[1]/a").click();
    }

    @Dado("seleciono a opcao de produto") 
    public void novoProduto() throws InterruptedException{
        Thread.sleep(2000);
        Comando.seletorQueryXpath("/html/body/div/form/div[1]/div/select/option[27]").click();
    }
    
    @Entao("preencho o campo: {string}")
    public void preenchoCampo( String valor) {
        Comando.seletorQueryCss("#pedido_produto_valor").sendKeys(valor);
    }
    
    @Entao("aperto em enviar")
    public void enviar() {
        Comando.seletorQueryXpath("//*[@id='new_pedido_produto']/div[3]/div/input").click();
        Comando.fechar();
    }
    
    
}