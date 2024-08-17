package com.example.demo.dto;

import com.example.demo.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private int id;
    private String work;
    private String name;
    private String password;

    public ScheduleResponseDto(int id, String work, String name, String password) {
        this.id = id;
        this.work = work;
        this.name = name;
        this.password = password;
    }

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.work = schedule.getWork();
        this.name = schedule.getName();
        this.password = schedule.getPassword();
    }
}
