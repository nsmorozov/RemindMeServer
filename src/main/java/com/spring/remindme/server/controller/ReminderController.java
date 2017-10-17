package com.spring.remindme.server.controller;

import com.spring.remindme.server.entity.Remind;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/remind")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(){

        return createMockRemind();
    }

    private Remind createMockRemind() {

        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("First remind");
        return remind;
    }
}
