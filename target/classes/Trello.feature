#language: pt
#encoding: UTF-8


Funcionalidade: Trello

    Cenario: Criando, comitando e deletando um card
    Dado que acesse a API com sucesso
    Entao eu tenho o resultado com status 200 
    Quando crio um card com o nome "Geruza card API"
  	E comento "teste de API Geruza"
    Quando excluo com sucesso
    Entao eu tenho o resultado com o status 404
 

#https://api.trello.com/1/boards/qVfoHpqi?
#key=f3e32fd3321c7908977e692561f1d931&
#token=916d0a5f9e102af827c04667d1a254caf3f6f608040dca4a38ef8604f63f9bb2