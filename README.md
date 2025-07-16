# MatchFinder in a Family Tree – Low Level Design (LLD)

This project designs a **MatchFinder system** that identifies suitable matches for a person from a **family tree structure**, applying **object-oriented design** and **relationship-based rules**.

---

## 📌 Objective

To design a modular, extensible system that:
- Models a family with clear relationships (parent, child, spouse, sibling)
- Finds potential matches for a given person based on rules
- Maintains family integrity and supports future extensions (like matchmaking preferences)

---

## 🧠 Design Principles

- ✅ **Object-Oriented Programming**
- ✅ **SOLID Principles**
- ✅ **Design Patterns**:
  - Builder (for creating Person objects)
  - Strategy (for match-finding criteria)

---

## 🧰 Tech Stack

- **Language**: Java
- **Tools**: IntelliJ / VS Code
- **Build Tool**: Maven or Gradle

---

## 🛠️ Key Features

- 👨‍👩‍👧‍👦 Family tree creation with relationships
- 💑 Match-finding using customizable rules (e.g., age gap, relationship distance)
- 🧩 Easily extendable with new matching criteria (like location, profession)

---

## 🧪 Sample Input

```java
familyTree.addMember("John", "Male", 28);
familyTree.addMember("Emily", "Female", 26);
familyTree.addSpouse("John", "Emily");

familyTree.addMember("Alex", "Male", 30);
familyTree.addMember("Sophie", "Female", 27);

List<Person> matches = matchFinder.findMatches("Alex");
