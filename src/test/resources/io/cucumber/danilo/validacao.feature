# language: pt
Funcionalidade: Validacao site
  Fizemos no curso um sitema que entra no site tornese um programador
  com isso estamos criando um teste para automatizar o processo de pesquisa bdd e tdd

  Cenario: Testando site tdd
    Quando eu acesso o site tornese um programador
    E digito no campo de busca a palavra "tdd"
    E clico no botao enviar
    Entao eu devo ver o resultado na busca

  Cenario: Testando site bdd
    Quando eu acesso o site tornese um programador
    E digito no campo de busca a palavra "bdd"
    E clico no botao enviar
    Entao eu devo ver o resultado na busca