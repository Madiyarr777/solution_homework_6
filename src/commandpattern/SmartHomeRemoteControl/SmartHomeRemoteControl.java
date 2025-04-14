package commandpattern;

import java.util.Stack;


public class SmartHomeRemoteControl {
    private Command[] slots;
    private Stack<Command> history = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public SmartHomeRemoteControl(int numberOfSlots) {
        slots = new Command[numberOfSlots];
    }

    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < slots.length) {
            slots[slot] = command;
        }
    }

    public void pressButton(int slot) {
        if (slot < 0 || slot >= slots.length || slots[slot] == null) {
            System.out.println("Кнопка " + slot + " не настроена.");
            return;
        }
        System.out.println("\n[Нажата кнопка " + slot + "]");
        Command command = slots[slot];
        command.execute();
        history.push(command);
        redoStack.clear();
    }

    public void undoButton() {
        if (history.isEmpty()) {
            System.out.println("\n[Отмена] Нет команд для отмены.");
            return;
        }
        Command command = history.pop();
        System.out.println("\n[Отмена последней команды]");
        command.undo();
        redoStack.push(command);
    }

    public void redoButton() {
        if (redoStack.isEmpty()) {
            System.out.println("\n[Повтор] Нет команд для повторного выполнения.");
            return;
        }
        Command command = redoStack.pop();
        System.out.println("\n[Повтор команды]");
        command.execute();
        history.push(command);
    }
}
