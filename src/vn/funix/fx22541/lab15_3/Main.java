package vn.funix.fx22541.lab15_3;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FileService<Company> companyFileService = new FileService<>();
        Set<Company> companies;
        companies = companyFileService.readFile("company.dat");
//				System.out.println("List company in file: ");
//				companyFileService.printList(companies);
//
        Company shoppe = new Company("Shoppe", "admin@Shoppe.com", "0123456789", "5 Science Park Drive, Shoppe Building", "118265", "Singapore");
        Company shoppe2 = new Company("Shoppe2", "admin@Shoppe.com", "0123456789", "5 Science Park Drive, Shoppe Building", "118265", "Singapore");
        Company shoppe3 = new Company("Shoppe3", "admin@Shoppe.com", "0123456789", "5 Science Park Drive, Shoppe Building", "118265", "Singapore");
////
        companies.add(shoppe);
        companies.add(shoppe2);
        companies.add(shoppe3);
//
        companyFileService.writeListToFile("company.dat", companies);
//				companyFileService.writeObjectToFile("company.dat", shoppe);
//				companyFileService.writeObjectToFile("company.dat", shoppe3);


        companies = companyFileService.readFile("company.dat");
//				System.out.println("List company in file: ");
        companyFileService.printList(companies);

    }

}
