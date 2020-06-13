package main;

import java.util.HashMap;
import java.util.Map;

public class CommandContainer {
    private Map<Integer, ICommand> commandMap;

    public CommandContainer(Map<Integer, ICommand> commands){
        commandMap = commands;
    }

    public Map<Integer, ICommand> getCommands(){
        return commandMap;
    }

    public void register(Integer opId, ICommand command){
        commandMap.put(opId, command);
    }

    public void execute(Integer operationId){
        ICommand command = commandMap.get(operationId);
        command.execute();
    }
}
