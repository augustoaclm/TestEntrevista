#language: pt
#encoding: iso-8859-1


Funcionalidade: Primeira Programa��o do Site SKY

  Cen�rio: Valida��o do titulo de programa��o
    Dado acessar site "https://www.sky.com.br"
    E Titulo for igual a "SKY: A gente se diverte junto! | SKY - Sky"
    Quando acessar menu "Programa��o"
    E Titulo for igual a "Na TV: Grade de Programa��o | SKY"
    E clicar na programa��o
    Ent�o validar titulo da programa��o 
    E validar dura��o da programa��o
   
	