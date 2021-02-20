package com.lineadecodigo.java.benchmark;

/**
 * @file BenchmarkJHM.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/marzo/2020
 * @url		http://lineadecodigo.con/java/pruebas-de-rendimiento-con-java-microbenchmark-harness/
 * @description Uso del framework JMH (Java Microbenchmark Harness) para medir el performance de funciones.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})

@Warmup(iterations = 1)
@Measurement(iterations = 2)

public class BenchmarkJHM {
	
	private static final int N = 10_000_000;
    private static List<String> DATA_FOR_TESTING = createData();

    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(BenchmarkJHM.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
	
    @Benchmark
	public void loopFor(Blackhole bh) {
		for (int i = 0; i < DATA_FOR_TESTING.size(); i++) {
	    	String s = DATA_FOR_TESTING.get(i); 
	        bh.consume(s);
		}
	}
	 
	
	@Benchmark
	public void loopWhile(Blackhole bh) {
		int i = 0;
		while (i < DATA_FOR_TESTING.size()) {
			String s = DATA_FOR_TESTING.get(i);
			bh.consume(s);
			i++;
		}
	}
	
    @Benchmark
    public void loopForEach(Blackhole bh) {
        for (String s : DATA_FOR_TESTING) {
            bh.consume(s);
        }
    }
	 
	private static List<String> createData() {
		List<String> data = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			data.add("Number : " + i);
		}
		return data;
	}

}
