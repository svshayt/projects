package model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Worker {
    private final String name;
    private final int age;
    private final int salary;
    private final String position;
}
