# 🚗 Sistema de Control de Parqueadero

## 📋 Descripción

Aplicativo Java completo que permite el control y gestión de vehículos en un parqueadero, registrando tiempos de uso y calculando tarifas según políticas establecidas. El sistema incluye autenticación de usuarios, gestión de vehículos recurrentes con descuentos y persistencia de datos.

## ✨ Características Principales

- ✅ **Registro de Usuarios**: Gestión completa de usuarios con ID y nombre
- ✅ **Registro de Vehículos**: Control de vehículos con matrícula, color, marca y modelo
- ✅ **Entrada y Salida**: Control automático de entrada y salida de vehículos
- ✅ **Cálculo de Tarifas**: Cálculo automático según tiempo de estancia
- ✅ **Descuentos Automáticos**: 10% de descuento a clientes recurrentes
- ✅ **Tabla de Precios**: Visualización clara de precios antes de usar el servicio
- ✅ **Persistencia**: Guardado automático en archivos serializados
- ✅ **Recibos Detallados**: Generación de recibos formales de estacionamiento
- ✅ **Historial Completo**: Consulta de todos los registros de estacionamiento

## 🛠️ Tecnologías

- **Lenguaje**: Java 8+
- **Persistencia**: Serialización de objetos
- **Paradigma**: Programación Orientada a Objetos (POO)
- **Interface**: Consola interactiva

## 📚 Conceptos POO Implementados

| Concepto | Clase | Descripción |
|----------|-------|-------------|
| **Encapsulamiento** | Todas las clases | Getters y setters privados |
| **Herencia** | TarifaEstandar | Extiende TarifaBase |
| **Polimorfismo** | calcularTarifa() | Override del método abstracto |
| **Abstracción** | TarifaBase | Clase abstracta con método abstracto |
| **Interfaz** | Serializable | Implementada en modelos |
| **Arreglos** | ArrayList | Almacenamiento dinámico |
| **Validación** | ValidadorEntrada | Condicionales y excepciones |
| **Ciclos** | for, while, foreach | Iteración en menús y listas |
| **Condicionales** | if, else, switch | Control de flujo |

## 📁 Estructura del Proyecto

```
SistemaParqueadero/
├── src/
│   ├── modelos/                    # Capa de Modelos (5 clases)
│   │   ├── Usuario.java           # Clase Usuario
│   │   ├── Vehiculo.java          # Clase Vehículo
│   │   ├── TarifaBase.java        # Clase Abstracta
│   │   ├── TarifaEstandar.java    # Herencia + Polimorfismo
│   │   └── Registro.java          # Registro de estacionamiento
│   │
│   ├── negocio/                    # Capa de Negocio (3 clases)
│   │   ├── ValidadorEntrada.java  # Validaciones
│   │   ├── CalculadoraTarifa.java # Cálculo de tarifas
│   │   └── GestorParqueadero.java # Gestor principal
│   │
│   ├── datos/                      # Capa de Datos (4 clases)
│   │   ├── ArchivoManager.java    # Manejo de archivos
│   │   ├── RepositorioUsuarios.java
│   │   ├── RepositorioVehiculos.java
│   │   └── RepositorioRegistros.java
│   │
│   ├── presentacion/               # Capa de Presentación (1 clase)
│   │   └── Menu.java              # Interfaz de usuario
│   │
│   └── Main.java                  # Punto de entrada
│
├── datos/                          # Carpeta de persistencia
│   ├── usuarios.dat               # Datos serializados
│   ├── vehiculos.dat
│   └── registros.dat
│
└── README.md                       # Este archivo
```

## 🚀 Instalación

### Requisitos
- JDK 8 o superior
- Git

### Pasos de Instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/dftns/SistemaParqueadero.git
   cd SistemaParqueadero
   ```

2. **Crear carpeta de datos**
   ```bash
   mkdir datos
   ```

3. **Compilar el proyecto**
   ```bash
   javac -d bin src/modelos/*.java src/negocio/*.java src/datos/*.java src/presentacion/*.java src/Main.java
   ```

4. **Ejecutar**
   ```bash
   java -cp bin Main
   ```

## 💰 Sistema de Tarifas

| Concepto | Precio |
|----------|--------|
| Hora completa | $5.000 |
| Media hora | $2.500 |
| Descuento recurrente | 10% |

## 📊 Total de Clases: 14

**Capa de Modelos:** 5 clases
**Capa de Negocio:** 3 clases  
**Capa de Datos:** 4 clases
**Capa de Presentación:** 1 clase
**Punto de Entrada:** 1 clase (Main)

¡Proyecto completo y listo para usar! 🚀
