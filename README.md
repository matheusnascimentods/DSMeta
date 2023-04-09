
# DSMeta

![Preview-Screens](https://github.com/matheusnascimentods/DSMeta/blob/master/Images%20For%20Github/home.jpg)

## Sobre

Sistema de gerenciamento de vendas, desenvolvido com o treinamento Dev Superior.

### Observações

1 - A API só reliza atos de coletar os registros do banco e de enviar notificações.

2 - Os outros metódos http não foram adicionados.

## Uso
### Pré-Requisitos

* Ter o `Nodejs` instalado na sua maquina, a versão utilizada no projeto é a `16.15.1` acredito que não há risco em utilizar versões superiores, mas caso queira utilizar a mesma versão que eu deixarei o link de download abaixo.
  * link do Node no site oficial: https://nodejs.org/en/download/
  * link da versão `16.15.1` do Node: https://nodejs.org/download/release/v16.15.1/

* Ter o `Yarn` instalado
    * Comando para instalação
    
      ```
        npm install --global yarn
      ```

* Possuir o java `17.0.4`
    * link de download do java(buscar a versão 17.0.4): https://www.azul.com/downloads/?package=jdk#download-openjdk 

* E por fim basta pussuir uma conta na `Twilio`, que um serviço de SMS que o projeto utiliza
 * Link para criar a conta: https://www.twilio.com/try-twilio
 
 ### Clonando o repositório
 
 ```
$ git clone https://github.com/matheusnascimentods/DSMeta.git

$ cd dsmeta
```

### Rodando o servidor

No terminal: 
```
$ cd dsmeta/backend/target

$ export TWILIO_SID=${Seu SID do Twilio}

$ export TWILIO_KEY=${Sua KEY do Twilio}

$ export TWILIO_PHONE_FROM=${Seu telefone gerado pelo Twilio}

$ export TWILIO_PHONE_TO=${Telefone registrado na sua conta do Twilio}

$ java -jar DSMetaAPI.jar
```

### Rodando o cliente

Em outro terminal:
```
$ cd dsmeta/frontend

$ yarn dev
```
Agora é só navegar para o endereço que será exibido no terminal.
