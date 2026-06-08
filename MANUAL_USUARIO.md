# 📖 Manual de Usuario - Sistema de Control de Parqueadero

## 🎯 Introducción

Este manual le guía paso a paso en el uso del Sistema de Control de Parqueadero. El sistema permite gestionar usuarios, vehículos y registrar entradas/salidas del parqueadero con cálculo automático de tarifas.

## 🚀 Inicio del Programa

### Paso 1: Compilar el proyecto
```bash
javac -d bin src/modelos/*.java src/negocio/*.java src/datos/*.java src/presentacion/*.java src/Main.java
```

### Paso 2: Ejecutar
```bash
java -cp bin Main
```

### Resultado esperado:
Verá la pantalla de inicio con el menú principal.

---

## 📋 Menú Principal

```
╔════════════════════════════════════════════╗
║    SISTEMA DE CONTROL DE PARQUEADERO       ║
║         Versión 1.0                        ║
╚════════════════════════════════════════════╝

╔════════════════════════════════════════════╗
║           MENÚ PRINCIPAL                   ║
╠════════════════════════════════════════════╣
║ 1. Gestión de Usuarios                     ║
║ 2. Gestión de Vehículos                    ║
║ 3. Registrar Entrada al Parqueadero        ║
║ 4. Registrar Salida del Parqueadero        ║
║ 5. Consultar Tabla de Precios              ║
║ 6. Ver Registros de Estacionamiento        ║
║ 7. Ver Vehículos Activos                   ║
║ 8. Salir                                   ║
╚════════════════════════════════════════════╝
```

---

## 👤 1. Gestión de Usuarios

### Opción 1.1: Registrar Usuario

**Propósito:** Agregar un nuevo usuario al sistema.

**Pasos:**
1. Seleccione **1** en menú principal
2. Seleccione **1** en menú de usuarios
3. Ingrese la **identificación** (números)
   - Ejemplo: `1001234567`
4. Ingrese el **nombre completo**
   - Ejemplo: `Juan Pérez López`
5. Presione ENTER

**Validaciones:**
- La ID debe contener solo números
- El nombre debe tener al menos 3 caracteres
- La ID no debe estar duplicada

**Mensaje de éxito:**
```
✅ Usuario registrado exitosamente.
```

### Opción 1.2: Listar Usuarios

**Propósito:** Ver todos los usuarios registrados.

**Pasos:**
1. Seleccione **1** en menú principal
2. Seleccione **2** en menú de usuarios
3. Se mostrarán todos los usuarios con ID y nombre

### Opción 1.3: Buscar Usuario

**Propósito:** Encontrar un usuario específico.

**Pasos:**
1. Seleccione **1** en menú principal
2. Seleccione **3** en menú de usuarios
3. Ingrese la **ID** del usuario a buscar
4. Presione ENTER

---

## 🚗 2. Gestión de Vehículos

### Opción 2.1: Registrar Vehículo

**Propósito:** Registrar un vehículo en el sistema.

**Pasos:**
1. Seleccione **2** en menú principal
2. Seleccione **1** en menú de vehículos
3. Ingrese los datos del vehículo:
   - **Matrícula**: `ABC-123`
   - **Color**: `Blanco`
   - **Marca**: `Toyota`
   - **Modelo**: `Corolla`
   - **ID del propietario**: `1001234567`

**Validaciones:**
- El usuario propietario debe existir
- La matrícula no puede estar duplicada
- Ningún campo puede estar vacío

**Mensaje de éxito:**
```
✅ Vehículo registrado exitosamente.
```

### Opción 2.2: Listar Vehículos

**Propósito:** Ver todos los vehículos registrados.

**Pasos:**
1. Seleccione **2** en menú principal
2. Seleccione **2** en menú de vehículos

### Opción 2.3: Buscar Vehículo

**Propósito:** Encontrar un vehículo específico.

**Pasos:**
1. Seleccione **2** en menú principal
2. Seleccione **3** en menú de vehículos
3. Ingrese la **matrícula** del vehículo

---

## 🅿️ 3. Registrar Entrada al Parqueadero

**Propósito:** Registrar que un vehículo entra al parqueadero.

**Pasos:**
1. Seleccione **3** en menú principal
2. Ingrese la **matrícula** del vehículo: `ABC-123`
3. Presione ENTER

---

## 🅿️ 4. Registrar Salida del Parqueadero

**Propósito:** Registrar que un vehículo sale del parqueadero y calcular la tarifa.

**Pasos:**
1. Seleccione **4** en menú principal
2. Ingrese la **matrícula** del vehículo: `ABC-123`
3. Ingrese el **tiempo de estacionamiento en horas**: `2`
4. Presione ENTER

El sistema automáticamente:
- Calcula el tiempo de estadía
- Verifica si es cliente recurrente
- Aplica descuento si corresponde
- Muestra recibo detallado

---

## 💰 5. Consultar Tabla de Precios

**Propósito:** Ver las tarifas del parqueadero.

**Pasos:**
1. Seleccione **5** en menú principal
2. Se mostrará la tabla de precios

```
╔════════════════════════════════════════════╗
║        TABLA DE PRECIOS DEL PARQUEADERO    ║
╠════════════════════════════════════════════╣
║ • Tarifa por hora: $5000                   ║
║ • Tarifa por media hora: $2500             ║
║ • Descuento clientes recurrentes: 10%      ║
╚════════════════════════════════════════════╝
```

---

## 📊 6. Ver Registros de Estacionamiento

**Propósito:** Consultar el historial de todos los estacionamientos.

**Pasos:**
1. Seleccione **6** en menú principal
2. Se mostrará lista de todos los registros

---

## 🅿️ 7. Ver Vehículos Activos

**Propósito:** Ver qué vehículos están actualmente en el parqueadero.

**Pasos:**
1. Seleccione **7** en menú principal
2. Se mostrará lista de vehículos activos

---

## 🚪 8. Salir

**Propósito:** Guardar datos y cerrar el programa.

**Pasos:**
1. Seleccione **8** en menú principal
2. El sistema guardará todos los datos
3. Se cerrará el programa

---

## 💡 Consejos de Uso

1. Registre usuarios primero antes de registrar vehículos
2. Verifique los precios antes de que un cliente entre
3. Guarde datos regularmente seleccionando salir
4. Verifique vehículos activos si duda si un vehículo ya entró
5. Los descuentos se aplican automáticamente a clientes con 2+ visitas

¡Que disfrute usando el Sistema de Control de Parqueadero! 🚗✨
