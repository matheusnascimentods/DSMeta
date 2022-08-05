
# DS-Meta

Sistema de gerenciamento de vendas, desenvolvido com o treinamento Dev Superior 

### Pré-Requisitos

Antes de Rodar o projeto, você devera atender aos seguintes requisitos:

* Ter o `Nodejs` instalado na sua maquina, a versão utilizada no projeto é a `16.15.1` acredito que não há risco em utilizar versões superiores, mas caso queira utilizar a mesma versão que eu deixarei o link de download abaixo.
  * link do Node no site oficial: https://nodejs.org/en/download/
  * link da versão '16.15.1' do Node: https://nodejs.org/download/release/v16.15.1/

* Ter o `Yarn` instalado
    * Para instalar o mesmo basta rodar o seguinte comando no terminal
    * ```Ruby
        npm install --global yarn
      ```

* Possuir o java `17.0.4`
    * link de download do java(basta somente rolar a pagina e buscar a versão 17.0.4): https://www.azul.com/downloads/?package=jdk#download-openjdk 

* E por fim basta pussuir uma conta na `Twilio`, que um serviço de SMS que o projeto consome
 * Link para criar a conta: https://www.twilio.com/try-twilio

## Instalação

##### NOTA: PARA UTILIZAR A APLICAÇÃO É NECESSÁRIO VER SE SUA MAQUINA ATENDE AOS REQUISITOS MÍNIMOS DESCRITOS ACIMA

O primeiro passo para rodar o projeto, é clonar é o mesmo

```Ruby
git clone https://github.com/matheusnascimentods/DSMeta.git
```
<br>

### Rodando o back-end

Em seguida será necessário navegar até a pasta do 
back-end com o seguinte comando:

```Ruby
cd dsmeta/backend/target
```
e em seguida será necessário inicializar a variáveis de ambiente

```Ruby
export TWILIO_SID=${Seu SID do Twilio}
export TWILIO_KEY=${Sua KEY do Twilio}
export TWILIO_PHONE_FROM=${Seu telefone gerado pelo Twilio}
export TWILIO_PHONE_TO=${Telefone registrado na sua conta do Twilio}
```

e agora que as variáveis de ambiente foram inicializas será necessário rodar o seguinte comando
```Ruby
java -jar DSMetaAPI.jar
```

<br>

### Rodando o front-end

Agora só falta rodar o front-end, e para que isso ocorra um segundo
terminal deverá ser aberto na pasta do projeto. Com o segundo terminal
aberto basta colar os seguintes comandos no terminal
```Ruby
cd dsmeta/frontend
```
```Ruby
yarn dev
```
e por fim você deverá ir até o navegador e colar o endereço que será imprimido no terminal


    
## Screenshots

![scrennshot](/Images%20For%20Github/home.jpg)

## Stack utilizada

**Front-end:** React

**Back-end:** Spring Boot

