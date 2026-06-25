# Jogo da Velha - Java Swing

Jogo da velha completo com interface gráfica, IA e sistema de ranking.

## Funcionalidades

- Modo Jogador vs Jogador (PvP)
- Modo Jogador vs Computador (PvE) com IA
- Sistema de ranking e histórico
- Detecção de vitória e empate
- Interface gráfica com Java Swing

## Estrutura

- `Principal.java` - Ponto de entrada
- `Menu.java` - Menu principal
- `PvsP.java` / `VsPc.java` - Modos de jogo
- `PcF1.java` / `PcF2.java` - Lógica da IA
- `Rank.java` / `resultados.java` - Sistema de ranking

## Como compilar

```bash
javac -d bin src/atividade/*.java
java -cp bin atividade.Principal
```
