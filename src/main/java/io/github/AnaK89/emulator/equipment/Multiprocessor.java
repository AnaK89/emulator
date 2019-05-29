package io.github.AnaK89.emulator.equipment;

import io.github.AnaK89.emulator.equipment.utils.Logs;

import java.util.List;

public interface Multiprocessor {
    List<Processor> getProcessors();

    Memory getMemory();

   /* void stop();*/

    Logs getLogs();

    void addLog(String log);
}
