# 🦆 Duck Simulation Program


## 📌 Description
This program simulates different types of ducks and their behaviors using the **Strategy Pattern**. It allows dynamic assignment of behaviors such as **flying, swimming, and quacking**.

Each duck can:
✅ **Fly or Not Fly**  
✅ **Swim, Float, or Drown**  
✅ **Quack, Squeak, or Stay Silent**  

---

## 🚀 Features
- Implements **Strategy Pattern** for flexible duck behaviors.
- Uses **OOP principles** like **abstraction, encapsulation, and polymorphism**.
- Includes **menu-driven interaction** for selecting and displaying ducks.
- **Well-structured code** with modular files and comments.

---

## 📂 Class & Interface Overview

### **1 FlyBehavior.java** (Interface)  
Defines `fly()` method for different flying behaviors.  

### **2 Fly.java** (Class)  
Implements `FlyBehavior` → `"I can fly high in the sky!"`  

### **3️ NotFly.java** (Class)  
Implements `FlyBehavior` → `"I cannot fly."`  

### **4️ SwimBehavior.java** (Interface)  
Defines `swim()` method for different swimming behaviors.  

### **5️ Swim.java** (Class)  
Implements `SwimBehavior` → `"I can swim in the water!"`  

### **6️ Float.java** (Class)  
Implements `SwimBehavior` → `"I float on the water."`  

### **7️ Drown.java** (Class)  
Implements `SwimBehavior` → `"I sink in the water..."`  

### **8️ QuackBehavior.java** (Interface)  
Defines `quack()` method for different quacking behaviors.  

### **9️ Quack.java** (Class)  
Implements `QuackBehavior` → `"Quack! Quack!"`  

### **10 MuteQuack.java** (Class)  
Implements `QuackBehavior` → `"..."`  

### **11 Squeak.java** (Class)  
Implements `QuackBehavior` → `"Squeak! Squeak!"`  

### **12 Duck.java** (Abstract Class)  
Defines common behaviors and structure for all ducks.  

### **13 MallardDuck.java** (Class)  
✅ Flies, ✅ Swims, ✅ Quacks  

### **1️4 RubberDuck.java** (Class)  
❌ Cannot fly, ✅ Floats, 🔊 Squeaks  

### **15 DecoyDuck.java** (Class)  
❌ Cannot fly, ❌ Sinks, ❌ No quacking  

### **1️6 RedheadDuck.java** (Class)  
✅ Flies, ✅ Swims, ✅ Quacks  

### **17 Main.java** (Entry Point)  
- Displays **Menu**  
- Allows **User Selection**  
- Runs **Duck Behaviors**  

---



