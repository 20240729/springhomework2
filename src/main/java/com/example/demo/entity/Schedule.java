package com.example.demo.entity;

import com.example.demo.dto.ScheduleRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    private int id;
    private String work;
    private String name;
    private String password;


    public Schedule(int id, String work, String name, String password, Date date) {
        this.id = id;
        this.work = work;
        this.name = name;
        this.password = password;
    }

    public Schedule(ScheduleRequestDto requestDto) {
        this.work = requestDto.getWork();
        this.name = requestDto.getName();
        this.password = requestDto.getPassword();
    }
}
