#  Spring Boot Configuration Properties: setters as Builder

[IDEA-338397](https://youtrack.jetbrains.com/issue/IDEA-338397)

- setters generated as Builder (returning `this` instead of `void`) explicitely, no Lombok
- same via Lombok: `@Accessors(chain = true)`
- same via Lombok: `lombok.config` containing

```
lombok.accessors.chain=true
``` 
