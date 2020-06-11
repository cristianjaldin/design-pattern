# Design-pattern

Creational
- [Factory Method](#factory-method)  
- [Abstract Factory](#abstract-factory) 
- [Builder](#builder)
- [Prototype](#prototype)
- [Singleton](#singleton)

Behavioral
- [Chain of responsibility](#chain-of-responsibility)
- [Command](#command)
- [Iterator](#iterator)
- [Mediator](#mediator)
- [Memento](#memento)
- [Observer](#observer)
- [State](#state)
- [Interpreter](#interpreter)
- [Strategy](#strategy)
- [Template Method](#template-method)
- [Visitor](#visitor)

Structural
- [Adapter](#adapter)
- [Bridge](#bridge)
- [Composite](#composite)
- [Decorator](#decorator)
- [Facade](#facade)
- [Flyweight](#flyweight)
- [Proxy](#proxy)


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

This pattern is used in scenarios where application needs to create a number of instances of a class, which has almost same state or differs very little. It is used when creation of object directly is costly. The concept is to copy an existing object rather than creating a new instance from scratch. 

```java
ElectronicProductPrototype play = PrototypeFactory.getInstance(PLAY);
ElectronicProductPrototype tv = PrototypeFactory.getInstance(TV);
ElectronicProductPrototype laptop = PrototypeFactory.getInstance(LAPTOP);

```
![Prototype](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/prototype/Prototype.gif?raw=true)


# Singleton

It ensures a class has only one instance and provide a global point of access to it. In this example there can only be a single Shenlong in Namekusei.

```java
Shenlong shenlong = Shenlong.getINSTANCE();
String myWish = "I just want to travel as much as I can, explore the world and learn from my experiences.";
shenlong.fulfillWish(myWish);
```

![Singleton](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/singleton/Singleton.gif?raw=true)

# Chain of responsibility

It builds a chain of objects to handle a call in sequential order. If one object cannot handle a call, it delegates the call to the next in the chain and so forth.
In the following example, a bank generates a chain  of responsibility to process loan applications. The request can be processed by an executive, manager or director according to the amount.

```java
Bank bank = new Bank();
bank.applyForLoan(100000000);
```
![Chain of responsibility](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/behavioral/chainofresponsibility/Chain%20of%20responsibility.gif?raw=true)

# Command



# Iterator


# Mediator


# Memento

# Observer

The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods. In the following example we have a pedestrian and a car that will be notified when the traffic light changes.

```java
Car car = new Car();
Pedestrian walker = new Pedestrian();
		
MessagePublisher messagePublisher = new MessagePublisher();
messagePublisher.attach(car);
messagePublisher.attach(walker);
		
messagePublisher.notifyUpdate(new TrafficLight("ROJO"));
		
Thread.sleep(5000);
		
messagePublisher.notifyUpdate(new TrafficLight("VERDE"));
```
![Observer](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/behavioral/observer/Observer.gif?raw=true)


# State

It allows an object to alter its behavior when its internal state changes. The benefit of the State pattern is that state-specific logic is localized in classes that represent that state.
In the following example we have a mobile that has different alarms and depending on which one we have configured, the behavior will be different.

```java
Mobile mobile = new Mobile();
mobile.alert();
		
mobile.setAlarmState(new Vibration());
mobile.alert();
		
mobile.setAlarmState(new Silent());
mobile.alert();
```
![State](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/behavioral/state/State.gif?raw=true)

# Interpreter

# Strategy

It defines a family of algorithms, encapsulates each one, and makes them interchangeable. In this example we have three algorithms to get a question from a set of questions.

```java
Questionnaire oneQuestionnaire = new Questionnaire("Quiz");
//default strategy - get first question
oneQuestionnaire.getQuestion();
//change strategy - get last question
oneQuestionnaire.setQuestionStrategy(new LastQuestionStrategy());
oneQuestionnaire.getQuestion();
//change strategy - get random question
oneQuestionnaire.setQuestionStrategy(new RandomQuestionStrategy());
oneQuestionnaire.getQuestion();
```
![Strategy](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/behavioral/strategy/Strategy.gif?raw=true)


# Template Method

```java
System.out.println("-----Making Meat Empanada-----");
EmpanadaMaker meatEmpanadaMaker = new MeatEmpanadaMaker();
meatEmpanadaMaker.makeEmpanada();
        
System.out.println("-----Making Vegan Empanada-----");
EmpanadaMaker veganEmpanadaMaker = new VeganEmpanadaMaker();
veganEmpanadaMaker.makeEmpanada();
        
System.out.println("-----Making Venezuelan Empanada-----");
EmpanadaMaker venezuelanEmpanadaMaker = new VenezuelanEmpanadaMaker();
venezuelanEmpanadaMaker.makeEmpanada();
```
![Template Method](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/behavioral/templatemethod/Templatemethod.gif?raw=true)


# Visitor

# Adapter

# Bridge

# Composite

# Decorator

# Facade

# Flyweight

# Proxy