# Trabalho-C06-A
Trabalho feito como parte da NP1 de C06 - A

Nome: Samuel Milan de Pontes
Curso: Engenharia de Telecomunicações
Matrícula: 9850


Uso de Inteligência Artificial no Desenvolvimento

Modelo utilizado

Foi utilizado o modelo ChatGPT (GPT-5.3 - OpenAI) como ferramenta de apoio durante o desenvolvimento do projeto.

---

Principais prompts utilizados e respostas

Composição e manipulação de arrays de objetos

Prompt:

“Eu n posso simplesmente no main colocar hardware[0], ou hardware[1], por exemplo? é isso que queria fazer, mas n sei como por ser private"

Resposta:

Foi explicado que, por se tratar de uma relação de composição, os objetos `HardwareBasico` pertencem à classe `Computador` e devem ser gerenciados exclusivamente por ela. Além disso, como o array `hardwares` foi declarado como `private`, ele não pode ser acessado diretamente por outras classes, como a classe `Main`.

Essa combinação (composição + encapsulamento) implica que toda manipulação do array deve ser feita por meio de métodos da própria classe `Computador`. Por isso, foi recomendado criar um método como `addHardware()`, responsável por inserir novos elementos no array de forma controlada.

Também foi esclarecido que o uso de um contador auxilia no controle das posições já preenchidas no array, evitando acessos inválidos e mantendo a organização dos dados.

Dessa forma, ao invés de acessar diretamente posições específicas do array fora da classe, a lógica de manipulação permanece encapsulada dentro de `Computador`, respeitando os princípios da Programação Orientada a Objetos.

Essa abordagem foi aplicada no código final por meio do método `addHardware()`, que passou a ser responsável por adicionar os componentes ao computador.

---

### Erro de NullPointerException

Prompt:

"Exception in thread "main" java.lang.NullPointerException: Cannot store to object array because "this.computadores" is null at Cliente.addPc(Cliente.java:17) at Main.main(Main.java:84)

qual é esse erro?"

Resposta:

Foi explicado que o erro ocorre quando se tenta acessar um objeto que ainda é `null`, geralmente por não ter sido inicializado com `new`.

---

Cálculo do total da compra

Prompt:

(envio de método com erro de soma)

Resposta:

Foi corrigido o uso do acumulador, indicando que a variável deveria ser inicializada dentro do método e retornada corretamente.

Essa correção foi aplicada no método de cálculo do total da compra.

---

Avaliação do uso da IA

O uso da IA foi considerado satisfatório, pois ajudou principalmente na compreensão dos conceitos e na resolução de problemas específicos.

As decisões finais foram tomadas com base no entendimento adquirido, não sendo apenas cópia de código.

---

Conclusão

A IA foi utilizada como ferramenta de apoio educacional, contribuindo para o aprendizado e desenvolvimento do projeto, sem substituir o raciocínio lógico do aluno.
