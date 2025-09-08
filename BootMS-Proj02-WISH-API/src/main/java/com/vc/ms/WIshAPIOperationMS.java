package com.vc.ms;

import java.time.LocalTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wish-api")
public class WIshAPIOperationMS {

    // No autowiring needed for LocalTime
    @GetMapping("/show")
    public ResponseEntity<String> findHour() {
        // Get fresh time for each request
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        
        String dayHonour;
        
        if(hour >= 4 && hour < 12) {
            dayHonour = "Good Morning";
        } 
        else if(hour >= 12 && hour < 16) {
            dayHonour = "Good Afternoon";
        }
        else if(hour >= 16 && hour < 20) {
            dayHonour = "Good Evening";
        }
        else {
            dayHonour = "Good Night";
        }
        
        return ResponseEntity.ok(dayHonour);
    }
}
