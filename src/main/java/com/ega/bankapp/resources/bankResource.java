package com.ega.bankapp.resources;

import com.ega.bankapp.model.CatalogItem;
import com.ega.bankapp.model.Transaction;
import com.ega.bankapp.model.User;
import com.ega.bankapp.model.UserTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalogue")
public class bankResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        System.out.println("1");
//         List<Transaction> trans = Arrays.asList(
//                new Transaction("1234", 4),
//                new Transaction("5678", 5)
//        );
        UserTransaction transactions= restTemplate.getForObject("http://transactionInfoService/trans/users/"+userId, UserTransaction.class);


       return  transactions.getUserTransaction().stream().map(t -> {
           //for each movie id, call movie info service and get details
           System.out.println("Mahira");
         User user =  restTemplate.getForObject("http://user-service/api/users"+t.getUserId(), User.class );
           //put them all together.
           return  new CatalogItem(user.getName() , "Description",t.getRating());
       } ).collect(Collectors.toList());
        //get all rated movie ids




    }
}
