# Aplicação de marcação de consulta com médicos
Uma pequena aplicação de marcação de consultas entre medicos e conveniados.

## Tecnologias 
### [Plug-in gerador de classes via openApi](https://github.com/OpenAPITools/openapi-generator)
 * O Plug-in permite a geração de classes clientes e pojos recebidos e enviados por esses clientes apartir de um arquivo de especificações OpenApi
    
Caso queria visualizar o resultado da geração, basta rodar _**mvn clean compile**_ e procurar as classes geradas em **_target/generated-sources/src/main/java/org/sindeaux/autoconsulta/controller/openapi_**

## Padrõres arquiteturais e padões de projeto