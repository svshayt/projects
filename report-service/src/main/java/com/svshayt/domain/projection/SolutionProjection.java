package com.svshayt.domain.projection;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@RequiredArgsConstructor
public class SolutionProjection {

    private final Long id;
    private final String series;
    private final String number;
    private final LocalDate departmentDocDate;
    private final String departmentDocNumber;
}
