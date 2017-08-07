package com.cucumber.demo;

import cucumber.api.CucumberOptions;

RunWith(Cucumber.class)
@CucumberOptions(
format = {"json:target/json-report/dw.json"}
, features = {"classpath:features/FixedAmountWithdraw.feature"}
, glue = {"io.cucumber.samples.dw.steps"}
)
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
