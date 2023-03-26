package com.svshayt.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("solution")
@Data
@Builder
@RequiredArgsConstructor
public class Solution {

    @Id
    private final Long id;
    private final String series;
    private final String number;
    private final LocalDate departmentDocDate;
    private final String departmentDocNumber;
}
