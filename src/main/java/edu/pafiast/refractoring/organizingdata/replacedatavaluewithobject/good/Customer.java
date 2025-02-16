package edu.pafiast.refractoring.organizingdata.replacedatavaluewithobject.good;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
    private String name;
    private String email;
}