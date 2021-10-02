package com.gmail.olgabots.itacademy.lesson.seven.classwork.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.bulb.OnOffControllable;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.bulb.OriginalBulb;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.model.bulb.XiaomiBulb;
import com.gmail.olgabots.itacademy.lesson.seven.classwork.service.TaskService;

public class TaskThreeServiceImpl implements TaskService {
    @Override
    public void runTask() {
        OnOffControllable[] bulbs = {new OriginalBulb(), new XiaomiBulb(), new OriginalBulb(), new XiaomiBulb()};
        for (OnOffControllable bulb : bulbs) {
            bulb.on();
        }

        for (OnOffControllable bulb : bulbs) {
            bulb.off();
        }
    }
}
