

Broker:
Exchange
Queues
Fluxo de Mensagens:
Producer → Broker → Exchange → Queues → Consumer

Produzimos mensagens, que são roteadas pelo Broker para as filas específicas, onde os consumers processam as mensagens.

Ferramentas e Tecnologias:

Maven: Gerenciador de dependências

Java 17: Linguagem

PostgreSQL: Banco de dados

RabbitMQ: Broker de mensagens

CloudAMQP: Gerenciamento do RabbitMQ na nuvem

SMTP Gmail: Envio de e-mails

Ecossistema Spring:

Spring Boot: Para iniciar os microservices

Spring Web: Criação de endpoints

Spring Data JPA: Transações com o banco de dados

Spring Validation: Validações de entrada na API

Spring AMQP: Comunicação assíncrona via protocolo de mensageria

Spring Mail: Envio de e-mails
