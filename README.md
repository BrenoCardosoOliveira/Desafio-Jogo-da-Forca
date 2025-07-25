# 🎮Desafio-Jogo-da-Forca


Este projeto é uma implementação em Java do clássico jogo da **Forca**, desenvolvido com foco em **Programação Orientada a Objetos (POO)**. Rodando via console, permite ao jogador interagir por menus, escolher letras, visualizar o progresso e enfrentar até 6 erros.

---

## 🚀 Funcionalidades

- 📘 Menu principal com opções: Novo Jogo, Créditos e Sair  
- 🕹️ Lógica completa do jogo da forca com verificação de letras
- 🧠 Palavras sorteadas de um banco de dados temático (POO)
- 🪓 Desenho gráfico simplificado da forca a cada erro
- ✅ Histórico de letras erradas

---

## 📁 Estrutura do Projeto
```yaml
src/
└── main/
└── java/
└── br.com.dio/
├── Main.java # Menu principal e entrada do programa
├── Game/
│ └── HangmanGame.java # Lógica principal do jogo
├── Model/
│ └── WordBank.java # Banco de palavras
└── Console/
└── ConsolePrinter.java # Impressão visual da forca
````



---

## 🧠 Conceitos de POO aplicados

| Conceito        | Aplicação                                      |
|-----------------|------------------------------------------------|
| **Encapsulamento** | Atributos privados com acesso controlado       |
| **Herança (simulada)** | Organização por responsabilidades em pacotes |
| **Abstração**     | Separação da lógica do jogo em classes dedicadas |
| **Responsabilidade Única** | Cada classe tem uma função bem definida     |

---

## ▶️ Como executar

1. Clone o repositório
2. Compile os arquivos com `javac` ou via IDE (IntelliJ, Eclipse)
3. Execute `Main.java` como programa principal

---

## 🖼️ Exemplo de Execução
```yaml
=== JOGO DA FORCA ===

1. Novo Jogo
0. Sair
   
Escolha uma opção: 1

===== Jogo da Forca (POO) =====
+---+
|   |
|
|
|
|
Palavra: _ _ _ _ _
Letras erradas: []

Digite uma letra:


