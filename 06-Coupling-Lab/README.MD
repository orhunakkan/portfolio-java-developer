Tightly Coupled Code Refactoring
Overview

This project aimed to refactor tightly coupled Java code to a more loosely coupled structure. The original code consisted of classes GiftCardBalance, CustomerBalance, BalanceService, and CouplingTestRunner, all residing in the same package com.myapp.tightly. The classes were interconnected, leading to high coupling, making it difficult to maintain and extend the codebase.
Goals

    Decoupling: Reduce dependencies between classes to enhance flexibility and maintainability.
    Abstraction: Introduce interfaces to abstract away implementation details and promote separation of concerns.

Refactored Structure

The refactored code introduced interfaces for Balance and BalanceService, allowing for abstraction and dependency inversion. This separation enabled easier modification and extension of functionalities without impacting other parts of the codebase.
Outcome

The refactoring process resulted in a more modular and flexible codebase. By adhering to SOLID principles and promoting abstraction and dependency injection, the code became more resilient to changes and easier to extend in the future.