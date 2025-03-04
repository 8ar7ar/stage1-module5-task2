package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {
    public Operation<Integer> divideBy(Integer divider) {
        return (List<Integer> arg) ->{
            List<Integer> result = new ArrayList<>();
            arg.forEach(num-> result.add(num/divider));
            return result;
        };
    }
}
