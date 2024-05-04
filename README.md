# dio-trilha-java-basico
Projeto para a entrega dos desafios do Curso "Santander 2024 - Backend com Java"

Os desafios de código estão abaixo.

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
    	}
    	class FileSystem
    	class ProximitySensor
    	class Screen
    	class Speaker
    }
```
