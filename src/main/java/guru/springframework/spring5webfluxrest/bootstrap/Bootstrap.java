package guru.springframework.spring5webfluxrest.bootstrap;

import guru.springframework.spring5webfluxrest.domain.Vendor;
import guru.springframework.spring5webfluxrest.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 9/24/17.
 */
@Component
public class Bootstrap implements CommandLineRunner{

    private final VendorRepository vendorRepository;

    public Bootstrap(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadVendors();
    }

    private void loadVendors() {
        Vendor vendor1 = new Vendor();
        vendor1.setFirstname("Vendor 1");
        vendor1.setLastname("Vendor 1 Last");
        vendorRepository.save(vendor1);

        Vendor vendor2 = new Vendor();
        vendor2.setFirstname("Vendor 2");
        vendor2.setLastname("Vendor 2 Last");
        vendorRepository.save(vendor2);
        System.out.println("Customers Loaded: " + vendorRepository.count());
    }

}
