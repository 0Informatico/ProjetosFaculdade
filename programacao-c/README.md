# Programação em C

Exercícios e projetos em linguagem C com foco em alocação dinâmica de memória e manipulação de matrizes.

## Arquivos

- **jonatan.c** — Hello world inicial
- **matriz_multiplicacao.c** — Multiplicação de matrizes 3×3 com alocação dinâmica (malloc)
- **quadrado_magico.c** — Verificador de quadrado mágico 3×3 (soma de linhas, colunas e diagonais = 15)

## Conceitos aplicados

- Ponteiros e ponteiros duplos (`int **`)
- Alocação dinâmica com `malloc`
- Operações com matrizes (multiplicação, validação)

## Como compilar

```bash
gcc matriz_multiplicacao.c -o multiplicacao
./multiplicacao

gcc quadrado_magico.c -o magico
./magico
```
