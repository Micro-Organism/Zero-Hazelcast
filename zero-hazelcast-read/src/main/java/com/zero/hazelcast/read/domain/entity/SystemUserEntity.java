package com.zero.hazelcast.read.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private int empId;
    private String name;
    private String department;

}