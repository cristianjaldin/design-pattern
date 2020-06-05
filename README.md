# Design-pattern

Creational
- [Factory Method](#factory-method)  
- [Abstract Factory](#abstract-factory) 
- [Builder](#builder)
- [Prototype](#prototype)
- [Singleton](#singleton)


# Factory Method

It defines an interface for creating an object, but leaves the choice of its type to the subclasses, creation being deferred at run-time.
A simple real life example of the Factory Method is the payment methods.
One of the advantages is that you can easily add new forms of payment.

```java
Payment payment = PaymentFactory.buildPayment(PaymentType.CARD);
payment.doPayment();
```

![Factory Method](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/factorymethod/Factory%20Method.gif?raw=true)


# Abstract Factory

It provides a way to encapsulate a group of **individual factories** that have a common theme without specifying their concrete classes.
In this example we have an abstract factory that groups together a warrior factory and an weapon factory.

```java
AbstractFactory<?> abstractFactory = FactoryProvider.getFactory("WARRIOR");
Warrior oneSamurai = (Warrior) abstractFactory.create("SAMURAI");
Warrior oneViking = (Warrior) abstractFactory.create("VIKING");

AbstractFactory<?> abstractFactory1 = FactoryProvider.getFactory("WEAPON");
Weapon oneSword = (Weapon) abstractFactory1.create("SWORD");
Weapon onAxe = (Weapon) abstractFactory1.create("AXE");
//Fight!!!
oneSamurai.doAttack(oneSword);
oneViking.doAttack(onAxe);
```

![Abstrac Factory](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/abstractfactory/Abstract%20Factory.gif?raw=true)

# Builder

It builds a complex object using simple objects and using a step by step approach. In this example we build an Bank Account.

```java
BankAccount bankAccount = new BankAccountBuilder(1114467234l, "Cristian Jaldin")
.withType("CUENTA_CORRIENTE")
.withBalance(324234.121)
.build();
```

![Builder](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/builder/Builder.gif?raw=true)

# Prototype

This pattern is used in scenarios where application needs to create a number of instances of a class, which has almost same state or differs very little. It is used when creation of object directly is costly. 

```java
ElectronicProductPrototype play = PrototypeFactory.getInstance(PLAY);
ElectronicProductPrototype tv = PrototypeFactory.getInstance(TV);
ElectronicProductPrototype laptop = PrototypeFactory.getInstance(LAPTOP);

```
![Prototype](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/prototype/Prototype.gif?raw=true)


# Singleton

It ensures a class has only one instance and provide a global point of access to it. 

```java
Shenlong shenlong = Shenlong.getINSTANCE();
String myWish = "I just want to travel as much as I can, explore the world and learn from my experiences.";
shenlong.fulfillWish(myWish);
```

![Singleton](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/singleton/Singleton.gif?raw=true)
