# Challenge-ONE-Conversor-Moedas

# Conversor de Moedas

Projeto focado em java, com enfoque em fomentar o conhecimento nessa linguagem de programação.

## Tecnologias Utilizadas

|                                         Linguagens de Programação                                          |                                          Ferramentas e Tecnologias                                          |
|:----------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------:|
| <img height="40" src="https://github.com/rhayssakramer/rhayssakramer/blob/main/assets/icon/Java-Dark.svg"> | <img height="40" src="https://github.com/rhayssakramer/rhayssakramer/blob/main/assets/icon/Idea-Light.svg"> |

## Requisitos do Projeto

Durante o curso, desenvolvi um Conversor de Moedas em Java, aprendendo a integrar APIs para obter taxas de câmbio em tempo real e realizar conversões entre diferentes moedas. Aqui está um resumo das principais etapas:

Configuração do Ambiente Java: Certifiquei-me de ter o Java JDK instalado, a biblioteca Gson configurada, e utilizei o Postman para testar as APIs. O IntelliJ IDEA foi minha IDE de escolha.

Integração de APIs: Utilizei a classe HttpClient para fazer solicitações à API de taxas de câmbio. Isso simplificou a conexão e a obtenção de respostas, tornando o processo eficiente.

Consumo da API: Analisei as respostas em JSON usando a biblioteca Gson. A classe HttpRequest foi usada para configurar e personalizar as solicitações de acordo com as necessidades do projeto.

Análise da Resposta JSON: Explorei a estrutura JSON das respostas da API para filtrar as moedas desejadas, tornando a aplicação mais relevante para os usuários.

Filtro de Moedas: Implementei métodos específicos para calcular a conversão de valores entre moedas, garantindo que o código fosse organizado e compreensível.

Exibição de Resultados aos Usuários: Interagi com o usuário por meio de uma interface de texto no console, permitindo que escolhessem entre várias opções de conversão de moedas.

Conclusão: A experiência de desenvolver o Conversor de Moedas em Java foi desafiadora, mas gratificante. Aprendi a importância de estruturar o código de forma clara e modular, facilitando sua manutenção e compreensão. O projeto resultou em um conversor funcional e eficaz, aumentando minha confiança como programador Java.

## Resultado do Projeto

<img src="https://github.com/ItaloRochaj/Challenge-ONE-Conversor-Moedas/blob/main/projeto.png">


Classes: Principal Esta classe é responsável por solicitar ao usuário que insira a moeda de origem e a moeda de destino que deseja converter. Métodos: digitar(Scanner scanner): Este método recebe um objeto Scanner como parâmetro. Ele solicita ao usuário que insira a moeda de origem e a moeda de destino e, em seguida, chama o método converterMoeda da classe Conversor para realizar a conversão.

Análise da Resposta JSON
A filtragem de moedas foi realizada explorando a estrutura JSON das respostas da API. A seleção das moedas desejadas foi feita através de atributos como "Currency Code", personalizando o conjunto de moedas para tornar a aplicação mais relevante e útil para os usuários.

Filtro de Moedas
Na fase de conversão de valores entre moedas, criei métodos e funções específicas para realizar os cálculos. Isso tornou o código mais organizado e compreensível, representando o ponto culminante do projeto.

Exibição de Resultados aos Usuários
Interagir com o usuário foi uma parte emocionante do desafio. Implementei uma interface de texto no console, permitindo ao usuário escolher entre várias opções de conversão de moedas. A realização de testes abrangentes foi crucial para garantir o funcionamento correto do programa.


Classes: Principal Esta classe exibe um menu para o usuário e lida com a entrada do usuário. Dependendo da escolha do usuário, ele chamará a classe Conversor para converter entre moedas predefinidas ou a classe DigitarMoeda para permitir que o usuário insira suas próprias moedas. Métodos: exibir(): Este método exibe um menu para o usuário e lida com a entrada do usuário. Ele chama o método converterMoeda da classe Conversor ou o método digitar da classe DigitarMoeda, dependendo da escolha do usuário.


Conclusão
Durante o curso, aprendi a desenvolver um conversor de moedas em Java foi um desafio que gostei muito, uma experiência incrível que me permitiu expandir minhas habilidades de programação. O projeto consistia em criar uma aplicação interativa via console que utilizasse APIs para obter taxas de câmbio em tempo real e realizar conversões entre diferentes moedas.

Uma das partes mais desafiadoras foi integrar a API do ExchangeRate para obter as taxas de câmbio dinamicamente. Através dela, pude garantir que meu programa oferecesse no mínimo seis opções de conversão de moedas fixas. Foi muito gratificante ver meu programa interagindo com o usuário de forma eficiente, permitindo que eles inserissem as moedas desejadas támbem e obtivessem o valor final convertido.

Além disso, ao longo do curso, aprendi a importância de estruturar meu código de forma clara e modular, facilitando sua manutenção e compreensão. A prática constante durante o desenvolvimento do projeto me ajudou a aprimorar minhas habilidades de resolução de problemas e a pensar de forma mais lógica e sistemática.
  

#Alura #Oracle #Oneoraclenexteducation #Programação #Tecnologia


## Autor:

<table>
  <tr>
    <td align="left">
      <a href="https://github.com/italorochaj">
        <span><b>Italo Rocha</b></span>
      </a>
      <br>
      <span>Desenvolvedor Full Stack</span>
    </td>
  </tr>
</table>

<div align="center">Feito por <a href="https://github.com/italorochaj">@italocodes</a>.</div>

