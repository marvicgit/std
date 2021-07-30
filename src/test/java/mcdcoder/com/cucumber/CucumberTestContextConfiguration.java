package mcdcoder.com.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import mcdcoder.com.StdApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = StdApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
