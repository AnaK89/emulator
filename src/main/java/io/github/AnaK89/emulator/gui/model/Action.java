package io.github.AnaK89.emulator.gui.model;

import java.util.ArrayList;
import java.util.List;

public enum Action {
    REQUEST_VALID_INFO("Запрос на валидные данные"),
    REWRITE_TO_OWN_CACHE("Обновить значение в КЭШ"),
    NEW_WRITE_TO_OWN_CACHE("Запись в КЭШ процессора");

    private final String action;

    Action(final String action){
        this.action = action;
    }

    public static List<String> getAll(){
        List<String> actions = new ArrayList<>();
        for(Action a: values()){
            actions.add(a.action);
        }
        return actions;
    }

    public String toString(){
        return action;
    }

    public static Action getValueOf(final String state){
        for (Action s: values()){
            if(s.action.equals(state)){
                return s;
            }
        }
        return null;
    }
}
