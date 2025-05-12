# 🚕 Java Ride-Hailing App

A simple **Java console-based ride-hailing application** built using **Object-Oriented Programming (OOP)** principles like inheritance, abstraction, encapsulation, and polymorphism.

---

## 📌 Features

### 🧑‍💼 User Functionality

* Register as a new user.
* Log in using user ID.
* Book a **car** or **bike** ride by entering source, destination, and distance.
* View profile.
* Recharge wallet.

### 🚗 Driver Functionality

* Register as a new driver.
* Log in using driver ID.
* View driver profile.

### 💸 Booking & Payment

* Bookings are handled by `CarBookingService` and `BikeBookingService`.
* Cost: ₹15/km.
* If insufficient wallet balance, the booking fails.

---

## 🧠 OOP Concepts Used

* **Abstraction**: `Bookable` and `Person` are abstract base classes.
* **Encapsulation**: Services like `UserService` and `DriverService` hide internal logic.
* **Inheritance**: `User` and `Driver` extend `Person`.
* **Polymorphism**: `CarBookingService` and `BikeBookingService` implement `bookTrip()` differently.

---

## 📁 Folder Structure

```
com.solve_all.java_oops_implementation/
├── Main.java                           # Entry point of app
├── Person.java                         # Abstract base class for User & Driver
├── Bookable.java                       # Abstract ride booking logic
├── UserInterface.java                  # CLI for user
├── DriverInterface.java                # CLI for driver
│
├── entity/
│   ├── User.java                       # User data model
│   └── Driver.java                     # Driver data model
│
├── service/
│   ├── UserService.java                # Business logic for users
│   ├── DriverService.java              # Business logic for drivers
│   ├── CarBookingService.java          # Handles car rides
│   └── BikeBookingService.java         # Handles bike rides
│
├── repository/
│   ├── UserRepo.java                   # In-memory user storage
│   └── DriverRepo.java                 # In-memory driver storage (car/bike)
```

---

## ▶️ How to Run from Command Line

### ✅ Prerequisites

* Java 8 or higher installed
* Terminal or Command Prompt

### 🚀 Steps

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Shreyas-371/java_Workbook.git
   cd java_Workbook
   ```

2. **Compile All Java Files** Assuming you're inside the root folder of the project:

   ```bash
   javac com/solve_all/java_oops_implementation/**/*.java
   ```

3. **Run the Application**

   ```bash
   java com.solve_all.java_oops_implementation.Main
   ```

4. **Interact via CLI** Follow the prompts to register or log in as a user or driver.

---

## 📣 Notes

* Wallet recharging is mandatory before booking if the user has insufficient balance.
* No persistent storage — data resets on restart.
* Can be expanded into GUI or REST-based version in future.

---

## 👨‍💻 Author

* [Shreyas](https://github.com/Shreyas-371)

---
