# Awesome Design Patterns Playground 🚀

Hello, everyone😎

- **Chain of Responsibility (Tech Support Request Handler)** – Processes tech support requests from an FAQ bot all the way to a senior specialist.
- **Command Pattern (Smart Home Remote Control)** – Controls a smart home using commands with support for undo/redo and macro commands (like Goodnight mode 😴).


## How to Run

### Chain of Responsibility Demo:
1. Import the  chainofresponsibility package into your project.
2. Run `TechSupportDemo.java` to see the chain in action (FAQBot → JuniorSupport → SeniorSupport).

### Command Pattern Demo:
1. Import the `commandpattern` package into your project.
2. Run `SmartHomeDemo.java` to see the smart home commands and their undo/redo functionality.

---

## Sample Console Output🚀

### Chain of Responsibility

``text
--- New Request: "password_reset" ---
FAQBotHandler received request: "password_reset"
FAQBotHandler processed request "password_reset"

--- New Request: "refund_request" ---
FAQBotHandler received request: "refund_request"
FAQBotHandler could not handle "refund_request", passing to next level...
JuniorSupportHandler received request: "refund_request"
JuniorSupportHandler processed request "refund_request"

--- New Request: "account_ban" ---
FAQBotHandler received request: "account_ban"
FAQBotHandler could not handle "account_ban", passing to next level...
JuniorSupportHandler received request: "account_ban"
JuniorSupportHandler could not handle "account_ban", passing to next level...
SeniorSupportHandler received request: "account_ban"
SeniorSupportHandler processed request "account_ban"

--- New Request: "unknown_bug" ---
FAQBotHandler received request: "unknown_bug"
FAQBotHandler could not handle "unknown_bug", passing to next level...
JuniorSupportHandler received request: "unknown_bug"
JuniorSupportHandler could not handle "unknown_bug", passing to next level...
SeniorSupportHandler received request: "unknown_bug"
SeniorSupportHandler could not handle "unknown_bug", passing to next level...
Request "unknown_bug" unhandled. Escalate manually.


## Command Pattern

[Button 0 Pressed]
Light: Turning ON.

[Button 3 Pressed]
MusicPlayer: Playing track "Lullaby.mp3"

[Button 2 Pressed]
Thermostat: Setting temperature to 18°C (was 20°C)

[Button 5 Pressed]
Light: Turning OFF.
Thermostat: Setting temperature to 16°C (was 18°C)
MusicPlayer: Stopped track "Lullaby.mp3"

[Undo Last Command]
MusicPlayer: Playing track "Lullaby.mp3"
Thermostat: Setting temperature to 18°C (was 16°C)
Light: Turning ON.

[Redo Command]
Light: Turning OFF.
Thermostat: Setting temperature to 16°C (was 18°C)
MusicPlayer: Stopped track "Lullaby.mp3"

``SOLID`` on Point 🤘
``Single Responsibility: Every class has its own clear task. Handlers process specific requests, and commands execute only one action with proper undo support.
Open-Closed: Extend the project by adding new handlers or commands without modifying existing code.
Liskov Substitution: Abstractions (base class SupportHandler and the Command interface) allow for seamless substitution of implementations.
Interface Segregation: The Command interface is minimalistic – only execute() and undo() methods.
Dependency Inversion: High-level modules depend on abstractions, not concrete implementations.``

