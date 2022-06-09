package br.org.cesar.aula22.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.org.cesar.aula22.entity.Client;
import br.org.cesar.aula22.entity.CreditCard;
import br.org.cesar.aula22.entity.Product;
import br.org.cesar.aula22.entity.ProductTransaction;
import br.org.cesar.aula22.entity.Transaction;
import br.org.cesar.aula22.repository.ClientRepository;
import br.org.cesar.aula22.repository.CreditCardRepository;
import br.org.cesar.aula22.repository.ProductRepository;
import br.org.cesar.aula22.repository.ProductTransactionRepository;
import br.org.cesar.aula22.repository.TransactionRepository;

@Configuration
public class LoadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    public CommandLineRunner initDataBase(ProductRepository productRepository,
            TransactionRepository transactionRepository, ClientRepository clientRepository,
            CreditCardRepository creditCardRepository, ProductTransactionRepository productTransactionRepository) {
        return args -> {

            Product p1 = new Product("title", 12, "zipcode", "seller", "thumbnailHd",
                    "date");
            log.info("Salvando produto: " + productRepository.save(p1));

            Transaction t1 = new Transaction();
            t1.setTotal_to_pa(100);
            transactionRepository.save(t1);

            Client c1 = new Client("Gerson");
            clientRepository.save(c1);
            t1.setClient(c1);

            CreditCard card1 = new CreditCard("card_number", 1, 1, "card_holder_name",
                    "exp_date");
            creditCardRepository.save(card1);
            t1.setCreditCard(card1);

            ProductTransaction productTransaction = new ProductTransaction();

            productTransaction.setProduct(p1);
            productTransaction.setTransaction(t1);
            productTransaction.setAmount(20);

            p1.getProductTransactions().add(productTransaction);
            t1.getProductTransactions().add(productTransaction);

            productTransactionRepository.save(productTransaction);

        };
    }

}
