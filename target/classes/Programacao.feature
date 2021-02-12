#language: pt
#encoding: iso-8859-1


Funcionalidade: Primeira Programação do Site SKY

  Cenário: Validação do titulo de programação
    Dado acessar site "https://www.sky.com.br"
    E Titulo for igual a "SKY: A gente se diverte junto! | SKY - Sky"
    Quando acessar menu "Programação"
    E Titulo for igual a "Na TV: Grade de Programação | SKY"
    E clicar na programação
    Então validar titulo da programação 
    E validar duração da programação
   
	