# [ACCADEMIA ACCENTURE QA] - Projeto QA - segundo teste

![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)


# Desafio da Gama Academy e Accenture 4.0

Júlia Rheinheimer Walter

Objetivo: Implementar os conteúdos abordados sobre testes com API, Devops, metodologias ágeis;

Tecnologias utilizadas: Cucumber + Selenium, Java, Jira.


# O desafio: uma aplicação de testes com Selenium e Cucumber :computer:
Validação no site da Accenture utilizando Cucumber, Selenium WebDriver em Java.

- [x] Caso de teste 1
 >* Acessar o site de vendas-aula.herokuapp. <br>*
 <br>
 
  **Cenário**: Peencher campos do Cliente  <br>
	Quando acesso o site: "https://vendas-aula.herokuapp.com/"  <br>
	Dado que clico em Clientes  <br>
	E clico em novo  <br>
	E preencho o campo de cadastro de Clientes: "Rogerio", "91", "r@gmail.com"  <br>
	E clico em salvar cadastro  <br>

  **Cenário**:Peencher campos de Produtos <br>
	E que clico em Produtos <br>
	E clico em novo produto <br>
	E preencho o campo de cadastro de Produtos: "Abacaxi", "maduro", "2021-04-20 12:00:00 -0300", "10", "20", "40" <br>
	E clico em salvar	<br>
	Dado que clico em Pedidos <br>
	E clico na opcao novo Pedido <br>
	E vinculo o nome de um Cliente: "Rogerio" <br>
	E clico em salvar voltar <br>
  
  **Cenário**: Peencher novos intes de produtos <br>
  E que clico em Pedidos <br>
	E clico em itens <br>
	E clico no novo produto <br>
	E seleciono a opcao de produto <br>
	Entao preencho o campo: "40" <br>
	Entao aperto em enviar <br>

--------------------------------------------------------------------

## Tecnologias utilizadas :computer:

:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar :bookmark_tabs:

### Pré requisitos

- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

- Verificar se o JAVA_HOME está configurado em seu computador

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
 
./test.sh

 ```

- Executando teste no Windows
 ```bash

test.bat

 ```
 
 - Os códigos estão configurados para executarem no Microsoft Edge, porém nos comentários (pasta services) tem a opção de selecionar o Chrome (que também está na pasta drive)
 ```bash
 
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
 System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
 browser = new EdgeDriver();

 //System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
 //browser = new ChromeDriver();
 
 ```

--------------------------------------------------------------------
## Estrutura de arquivos :open_file_folder:
<pre>
  driver <br>
      |-- msedgedriver.exe -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- juliarwalter <br>
    |  |  |  |  |  |-- CenarioSteps1.java -- Passos escritos em java com selenium abrindo o browser e preenchenco o site de vendas-aula.herokuapp<br>
    |  |  |  |  |  |-- Compartilhado.java -- Passos escritos em java com selenium - comando comapartilhado <br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br> 
    |  |  |  |  |  |-- services <br>
    |  |  |  |  |  |  |-- Comando.java -- Configura comandos no Java test <br> 
    |  |-- resources <br>
    |  |  |-- io <br>
    |  |  |  |-- cucumber <br>
    |  |  |  |  |-- juliarwalter <br>
    |  |  |  |  |  |-- CenarioDeTeste1.feature -- Gherkin com o caso de teste 1 <br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>
