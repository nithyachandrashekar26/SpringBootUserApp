package com.springboot.exercise.user;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class UserApplicationTests {

	 @Test
   public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {      
   }

  
}
