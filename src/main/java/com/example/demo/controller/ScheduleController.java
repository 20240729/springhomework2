package com.example.demo.controller;

import com.example.demo.dto.ScheduleRequestDto;
import com.example.demo.dto.ScheduleResponseDto;
import com.example.demo.entity.Schedule;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ScheduleController {

    // 생성
    @PostMapping("/scdl")
    public ScheduleResponseDto createSchedule(@RequestBody ScheduleRequestDto requestDto ){

        // requestdto를 entity로
        Schedule schedule = new Schedule(requestDto);

        // entity를 responsdto로
        ScheduleResponseDto scheduleResponseDto = new ScheduleResponseDto(schedule);

        return scheduleResponseDto;

    }

    @GetMapping("/scdl")

    }





}
