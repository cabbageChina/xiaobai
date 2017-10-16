package com.xiaobai.platform.lott.data.test;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.nullschool.util.DigitalRandom;

public class Test2 {

    DigitalRandom digitalRandom = new DigitalRandom();

    private Map<Integer, Integer> generatorNumbers() {
        return IntStream.range(0, 10).boxed().collect(Collectors.toMap(a -> 1, b -> 2));
    }


    private Integer generatorNubmer() {
        return digitalRandom.nextInt(100);
    }

}
