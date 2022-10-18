## Factory Method

É um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. 

Um padrão que define uma interface para criar um objeto, mas permite às classes decidirem qual classe instanciar. O Factory Method permite a uma classe deferir a
instanciação para subclasses.(Livro GOF)

---
#### - Problema

Como escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

Como deixar o código desacoplado das classes concretas? 

#### - Solução

Extrair o código de criação para um Factory Method

Invocar o Factory Method para receber uma instância qualquer que implemente um determinada interface.
