Java Design Patterns: Proxy & Flyweight

This repository contains real-world implementations and explanations of two structural design patterns: Proxy and Flyweight.

Proxy Pattern – Real World Example: Smart Door Access System

What problem was solved?

In a smart door system, not every user should be able to open the door — only those with proper authorization. If access control logic is handled inside the main door class, the code becomes cluttered and insecure. The main challenge was to separate the access validation from the door logic in a clean and maintainable way.

How did the pattern simplify or optimize the design?

Using the Proxy pattern, we introduced a DoorProxy class that acts as an intermediary between the client and the real door (RealDoor). The proxy checks whether the user has access before delegating the call to open the door. This separation improves security, simplifies the real door logic, and makes the overall system more modular and maintainable.

Sketch:

Client --> DoorProxy --> RealDoor
         |
         --> accessControlCheck()

- Client – the user  
- DoorProxy – intermediary that handles access validation  
- RealDoor – the actual class that opens the door

Flyweight Pattern – Real World Example: Online Forest Game (Tree objects)

What problem was solved?

In online games, thousands of trees may be rendered, many of which look identical. Creating full objects for each tree wastes memory and slows down performance. The issue here was the inefficient use of memory due to repetitive objects.

How did the pattern simplify or optimize the design?

The Flyweight pattern allows us to reuse shared objects that have common state. In this case, a TreeFactory provides a shared instance of a Tree object with common visual attributes. The unique data (like position) is stored separately. This reduces memory usage and improves performance while maintaining flexibility in positioning trees throughout the game world.

Sketch:

Client --> TreeFactory --> Tree (shared)
        --> position (x, y)

- TreeFactory – creates or reuses shared Tree objects  
- Tree – shared visual representation  
- position – unique coordinates per tree

Code Structure

- proxy/ — Java implementation of the Proxy pattern  
- flyweight/ — Java implementation of the Flyweight pattern  
- README.md — This explanation and summary file

Author

Prepared by: Tasbalta Nagima
