# learning-java

# Object-Oriented Programming tries to map code instructions with real-world making the code short and easier to understand.

# What Is Object-Oriented Programming?

Solving a problem by creating objects is one of the most popular approaches in programming. This is called Object-Oriented Programming.

# What is DRY?

DRY stands for – Do no-repeat yourself (It focuses on code reusability)

# Class

A class is a blueprint for creating objects.

# Object

An object is an instantiation of a class. When a class is defined, a template (info) is defined. Memory is allocated only after object instantiation.

How to model a problem in OOPs
We identify the following:

Examples of states and behaviors

# Example 1  : 

Object: House
State: Address, Color, Area
Behavior: Open door, close door

# Example 2:

Let’s take another example.
Object: Car
State: Color, Brand, Weight, Model
Behavior: Break, Accelerate, Slow Down, Gear change.

# OOPs Terminology

Abstraction – Hiding internal details [show only essential info!]
bstraction is a process where you show only “relevant” data and “hide” unnecessary details of an object from the user. For example, when you login to your bank account online, you enter your user_id and password and press login, what happens when you press login, how the input data sent to server, how it gets verified is all abstracted away from the you.

# Encapsulation – The act of putting various components together (in a capsule).

Encapsulation simply means binding object state(fields) and behavior(methods) together. If you are creating class, you are doing encapsulation.

In Java, encapsulation simply means that sensitive data can be hidden from the users.

# Inheritance – The act of deriving new things from existing things.

The process by which one class acquires the properties and functionalities of another class is called inheritance. Inheritance provides the idea of reusability of code and each sub class defines only those features that are unique to it, rest of the features can be inherited from the parent class.

Inheritance is a process of defining a new class based on an existing class by extending its common data members and methods.
Inheritance allows us to reuse of code, it improves reusability in your java application.

Rickshaw → E-Rickshaw
Phone → Smart Phone

# Polymorphism – One entity many forms

Polymorphism is a object oriented programming feature that allows us to perform a single action in different ways. For example, lets say we have a class Animal that has a method animalSound(), here we cannot give implementation to this method as we do not know which Animal class would extend Animal class.

Smartphone → Phone Smartphone → Calculator
