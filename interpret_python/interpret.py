def interpret(value, commands, args):
    for i in range(len(commands)):
        if commands[i] == "+":
            value = value + args[i]
        elif commands[i] == "-":
            value = value - args[i]
        elif commands[i] == "*":
            value = value * args[i]
        elif commands[i] == "/":
            value = value / args[i]
        elif commands[i] == "?":
            return -1

    return value

print(interpret(1,['+'],[1]))
