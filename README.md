# dio-trilha-java-basico
Projeto para a entrega dos desafios do Curso "Santander 2024 - Backend com Java"

Os desafios de cÃ³digo estÃ£o abaixo.

## Siulador de Conta de Banco no Terminal

```
org.juanpla.contabanco.ContaTerminal
```

##Controle de Fluxo

```
org.juanpla.desafiocontrolefluxo.Contador
```

## Classes Java para IPhone

```
org.juanpla.iphone.IPhone
```

```mermaid
classDiagram
    PhoneApp <|.. Browser
    PhoneApp <|.. IPod
    PhoneApp <|.. Phone
    HardwareDriver <|.. FileSystem
    HardwareDriver <|.. ProximitySensor
    HardwareDriver <|.. Screen
    HardwareDriver <|.. Speaker
    IPhone *-- HardwareDriver
    IPhone o-- PhoneApp
    class IPhone
    namespace apps{
    	class PhoneApp{
    		<<interface>>
    		+execute()
    	}
    	class Browser
    	class IPod
    	class Phone
    }
    namespace hwdrivers{
    	class HardwareDriver{
    		<<interface>>
            +wakeUp()
            +idle()
    	}
    	class FileSystem
    	class ProximitySensor
    	class Screen
    	class Speaker
    }
```

##Laboratório Banco Digital

```
org.juanpla.bancodigital.App
```

##Desafio Bootcamp

```
org.juanpla.bootcamp.Main
```