# Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week

## Diagrama de Classes

```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: List<Feature>
    - card: Card
    - news: List<News>
  }
  class Account {
    - number: String
    - agency: String
    - balance: Double
    - limite: Double
  }
  class Feature {
    - icon: String
    - description: String
  }
  class Card {
    - number: String
    - limite: Double
  }
  class News {
    - icon: String
    - description: String
  }
  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News

```
