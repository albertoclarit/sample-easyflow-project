package org.example.tasks;

import org.jeasy.flows.work.Work;
import org.jeasy.flows.work.WorkContext;
import org.jeasy.flows.work.WorkReport;
import org.jeasy.flows.work.DefaultWorkReport;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.flows.work.WorkStatus;

@Slf4j
public class PrintMessageWork implements Work {
    
    private String message;

    public PrintMessageWork(String message) {
        this.message = message;
    }

    public String getName() {
        return "print message work";
    }

    public WorkReport execute(WorkContext workContext) {
        System.out.println(message);
        log.info("{}  using Thread {}", message, Thread.currentThread().getName());
        return new DefaultWorkReport(WorkStatus.COMPLETED, workContext);
    }
}
