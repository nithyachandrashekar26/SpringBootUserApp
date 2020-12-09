package com.springboot.exercise.user.init;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.exercise.user.bo.Address;
import com.springboot.exercise.user.bo.User;
import com.springboot.exercise.user.repo.UserDetailsRepository;

@Configuration
class InitialiseDatabase {

  private static final Logger log = LoggerFactory.getLogger(InitialiseDatabase.class);

  @Bean
  CommandLineRunner initDatabase(UserDetailsRepository repository) {

    return args -> {
    	
      log.info("Preloading " + repository.save(new User("Mr" , "test1" , "test1LastName" , "female" , new Address("1234 Holling rd" , "Sydney" , "NSW" , "2000"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test2" , "test2LastName" , "male" , new Address("21 Macquarie st" , "Sydney" , "NSW" , "2000"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test3" , "test3LastName" , "female" , new Address("43 Kings rd" , "North Sydney" , "NSW" , "2022"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test4" , "test4LastName" , "female" , new Address("12 Park rd" , "Westmead" , "NSW" , "2145"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test5" , "test5LastName" , "male" , new Address("32 Station st" , "Wentworthville" , "NSW" , "2146"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test6" , "test6LastName" , "male" , new Address("532 Herring rd" , "North Ryde" , "NSW" , "2113"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test7" , "test7LastName" , "female" , new Address("5454 Balendel rd" , "Hurstville" , "NSW" , "2114"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test8" , "test8LastName" , "male" , new Address("22 Park ave" , "Ponds" , "NSW" , "2144"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test9" , "test9LastName" , "female" , new Address("323 Aurelia rd" , "North Sydney" , "NSW" , "2022"))));
      log.info("Preloading " + repository.save(new User("Mr" , "test10" , "test10LastName" , "male" , new Address("33 Brooks rd" , "North Ryde" , "NSW" , "2113"))));
      
    };
  }
}