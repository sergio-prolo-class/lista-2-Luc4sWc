<h1>Projeto:⚓ Jogo de Batalha Naval

(usando a biblioteca Draw)
</h1>

Este projeto Java cria uma interface gráfica que desenha dois tabuleiros lado a lado:

  - Um pintado (com alguns quadrados preenchidos de vermelho)

  - Um despintado (apenas o contorno dos quadrados)

A interface foi feita utilizando a biblioteca gráfica Draw adaptada por Emerson Mello.

________________________________________________________________________________________________

<h1>⚒ Como funciona</h1>

- O programa desenha duas grades 10x10 na tela, com espaçamento entre elas.
- A primeira grade (desenhar_pintado) possui vários quadrados pintados de vermelho, simulando navios ou alvos.
- A segunda grade (desenhar_despintado) mostra apenas os quadrados vazios, pronta para futuras interações (tipo um jogo de batalha naval).
- Letras (A a J) e números (0 a 9) são exibidos nas bordas dos tabuleiros para identificação das linhas e colunas.

________________________________________________________________________________________________

<h1>🗄 Arquivos principais</h1>

1. ```App.java```
- Contém os métodos:

    - ```desenhar_pintado(Draw a, int offsetX, int offsetY)```: desenha a grade preenchendo alguns quadrados de vermelho.

    - ```desenhar_despintado(Draw a, int offsetX, int offsetY)```: desenha apenas a grade vazia (sem preenchimentos).

- Gerencia as posições (offsets) para centralizar e alinhar os tabuleiros.

________________________________________________________________________________________________

<h1>⛮ Tecnologias usadas</h1>


- Java 21

- Biblioteca Draw (adaptação da ALGS4 do Princeton para Java)

- Gradle (padrão para construir o projeto, mas pode rodar no terminal ou IDE como IntelliJ, Eclipse, etc.)

________________________________________________________________________________________________

<h1>👁 Preview</h1>
