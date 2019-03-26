package com.example.springhib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.example")
public class SpringHib1Application /*implements CommandLineRunner*/{
	
	/*@Autowired
	SoccerService soccerService;
*/
	public static void main(String[] args) {
		SpringApplication.run(SpringHib1Application.class, args);
	}
	
    /*@Override
    public void run(String[] args) throws Exception {
        soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
        List<String> players = soccerService.getAllTeamPlayers(1);
        for(String player : players)

        {

            System.out.println("Introducing Barca player => " + player);

        }

    }
*/
}
