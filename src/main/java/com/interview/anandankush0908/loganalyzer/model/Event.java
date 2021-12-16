package com.interview.anandankush0908.loganalyzer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Event {
    private String id;

    private EventState state;

    private String type;

    private String host;

    private long timestamp;
}
