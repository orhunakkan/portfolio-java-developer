package myapp.bootstrap;

import myapp.entity.*;
import myapp.repository.CartRepository;
import myapp.repository.ItemRepository;
import myapp.repository.MerchantRepository;
import myapp.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import static myapp.enums.Status.SUCCESS;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;
    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;

    public DataGenerator(PaymentRepository paymentRepository, PaymentRepository merchantRepository, MerchantRepository merchantRepository1, ItemRepository itemRepository, CartRepository cartRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository1;
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Payment payment01 = new Payment(LocalDate.now(), new BigDecimal(1000), SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal(2000), new BigDecimal(3000), LocalDate.now());
        payment01.setPaymentDetail(paymentDetail1);

        Payment payment02 = new Payment(LocalDate.now(), new BigDecimal(4000), SUCCESS);
        PaymentDetail paymentDetail02 = new PaymentDetail(new BigDecimal(5000), new BigDecimal(6000), LocalDate.now());
        payment02.setPaymentDetail(paymentDetail02);

        Merchant merchant = new Merchant("Etsy", "E12345", new BigDecimal("5"), "10", 5);

        payment01.setMerchant(merchant);
        payment02.setMerchant(merchant);

        Item item01 = new Item("Sugar", "S01");
        Item item02 = new Item("Bread", "B01");

        Cart cart01 = new Cart();
        Cart cart02 = new Cart();

        item01.setCartList(Arrays.asList(cart01, cart02));
        item02.setCartList(Arrays.asList(cart01));

        cartRepository.save(cart01);
        cartRepository.save(cart02);

        itemRepository.save(item01);
        itemRepository.save(item02);

        merchantRepository.save(merchant);

        paymentRepository.save(payment01);
        paymentRepository.save(payment02);

        System.out.println(paymentRepository.findById(2L).get().getAmount());
        System.out.println(paymentRepository.findById(2L).get().getPaymentDetail().getCommissionAmount());
    }
}
