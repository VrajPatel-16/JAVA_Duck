# 🦆 Duck Simulation Program
### **Object-Oriented Design | Strategy Pattern**

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

### **1️⃣ FlyBehavior.java** (Interface)  
Defines `fly()` method for different flying behaviors.  

### **2️⃣ Fly.java** (Class)  
Implements `FlyBehavior` → `"I can fly high in the sky!"`  

### **3️⃣ NotFly.java** (Class)  
Implements `FlyBehavior` → `"I cannot fly."`  

### **4️⃣ SwimBehavior.java** (Interface)  
Defines `swim()` method for different swimming behaviors.  

### **5️⃣ Swim.java** (Class)  
Implements `SwimBehavior` → `"I can swim in the water!"`  

### **6️⃣ Float.java** (Class)  
Implements `SwimBehavior` → `"I float on the water."`  

### **7️⃣ Drown.java** (Class)  
Implements `SwimBehavior` → `"I sink in the water..."`  

### **8️⃣ QuackBehavior.java** (Interface)  
Defines `quack()` method for different quacking behaviors.  

### **9️⃣ Quack.java** (Class)  
Implements `QuackBehavior` → `"Quack! Quack!"`  

### **🔟 MuteQuack.java** (Class)  
Implements `QuackBehavior` → `"..."`  

### **1️⃣1️⃣ Squeak.java** (Class)  
Implements `QuackBehavior` → `"Squeak! Squeak!"`  

### **1️⃣2️⃣ Duck.java** (Abstract Class)  
Defines common behaviors and structure for all ducks.  

### **1️⃣3️⃣ MallardDuck.java** (Class)  
✅ Flies, ✅ Swims, ✅ Quacks  

### **1️⃣4️⃣ RubberDuck.java** (Class)  
❌ Cannot fly, ✅ Floats, 🔊 Squeaks  

### **1️⃣5️⃣ DecoyDuck.java** (Class)  
❌ Cannot fly, ❌ Sinks, ❌ No quacking  

### **1️⃣6️⃣ RedheadDuck.java** (Class)  
✅ Flies, ✅ Swims, ✅ Quacks  

### **1️⃣7️⃣ Main.java** (Entry Point)  
- Displays **Menu**  
- Allows **User Selection**  
- Runs **Duck Behaviors**  

---



