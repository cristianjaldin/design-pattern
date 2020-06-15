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
In the following example we have the factory [PaymentFactory](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/factorymethod/PaymentFactory.java). One of the advantages is that you can easily add new forms of payment.

```java
Payment payment = PaymentFactory.buildPayment(PaymentType.CARD);
payment.doPayment();
```

![Factory Method](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/factorymethod/Factory%20Method.gif?raw=true)


# Abstract Factory

It provides a way to encapsulate a group of **individual factories** that have a common theme without specifying their concrete classes.
In this example we have an abstract factory [FactoryProvider](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/abstractfactory/FactoryProvider.java) that groups together a [WarriorFactory](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/abstractfactory/WarriorFactory.java) and an [WeaponFactory](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/creational/abstractfactory/WeaponFactory.java).

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

It defines an algorithm as skeleton of operations and leave the details to be implemented by the child classes. The overall structure and sequence of the algorithm is preserved by the parent class. For example [EmpanadaMaker](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/behavioral/templatemethod/EmpanadaMaker.java)

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

An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface. In this example we have two different classes with different attribute names that represent a person. [PessoaToPersonAdapter](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/adapter/PessoaToPersonAdapter.java) adapts [Pessoa](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/adapter/Pessoa.java) to [Person](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/adapter/Person.java)

```java
List<IPerson> people = new ArrayList<IPerson>();
		
Pessoa pessoa = new Pessoa();
pessoa.setNome("João");
pessoa.setSobrenome("Da silva");
PessoaToPersonAdapter adapter = new PessoaToPersonAdapter(pessoa);
	
IPerson person = new Person();
person.setName("Frank");
person.setSurname("Williams");
		
people.add(person);
people.add(adapter);
		
for (IPerson p : people) {
	System.out.println(p.getName());
	System.out.println(p.getSurname());	
}
```
![Adapter](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/adapter/Adapter.gif?raw=true)

# Bridge

# Composite

```java
//Team 1
EmployeeComposite leader = new EmployeeComposite("Marian","LIDER");
Employee developer = new Employee("Karla","DESARROLLADOR");
Employee designer = new Employee("Caro","DISEÑADOR");
leader.addEmployee(developer);
leader.addEmployee(designer);
		
//Team 2
EmployeeComposite leader2 = new EmployeeComposite("Steve","LIDER");
Employee developer2 = new Employee("Jimmy","DESARROLLADOR");
Employee designer2 = new Employee("Luciano","DISEÑADOR");
leader2.addEmployee(developer2);
leader2.addEmployee(designer2);
		
//Manager
EmployeeComposite manager = new EmployeeComposite("Fer","GERENTE");
manager.addEmployee(leader);
manager.addEmployee(leader2);
		
//Trigger
manager.doWork();
```
![Composite](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/composite/Composite.gif?raw=true)


# Decorator

It allows adding new functionalities to classes without modifying their structure. Avoiding the need to create subclasses to the main class to add functionality. The concept of this pattern is to dynamically add new behavior or functionality to the main class. The decorator pattern is mainly made up of an Interface from which the concrete class is implemented and the decorators that will add more functionality to the concrete class.

In this example the component [User](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/decorator/User.java) and the decorators [RestrictedUserDecorator](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/decorator/RestrictedUserDecorator.java), [AdminUserDecorator](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/decorator/AdminUserDecorator.java) and [RootUserDecorator](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/decorator/RootUserDecorator.java) implement the interface [UserOperation](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/decorator/UserOperation.java). 

```java
User user = new User("Cristian Jaldin");
			
UserOperation restrictedUser = new RestrictedUserDecorator(user);
restrictedUser.install("Adobe Photoshop.exe");
restrictedUser.open("C:\\documens\\cv-cristian.doc");
restrictedUser.delete("C:\\documens\\cv-old-cristian.jpg");
		
UserOperation adminUser = new AdminUserDecorator(user);
adminUser.ping("172.217.172.100");
adminUser.formatDisk("C:");
		
UserOperation rootUser = new RootUserDecorator(user);
rootUser.formatDisk("C:");
```
![Decorator](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/decorator/Decorator.gif?raw=true)


# Facade

It provides a simple interface that is accessible to other systems or subsystems. In this way, it simplifies complexity for external clients, exposing a clearer interface and unified access to these functionalities, making it easier to use. In this example, [PrinterFacade](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/facade/PrinterFacade.java) configures the printer to later print documents, making them easier for the external client to use.

```java
PrinterFacade printerFacade = new PrinterFacade("...Testing printer...");
printerFacade.print();
```
![Facade](https://github.com/cristianjaldin/design-pattern/blob/master/src/main/java/design/pattern/examples/structural/facade/Facade.gif?raw=true)

# Flyweight

# Proxy