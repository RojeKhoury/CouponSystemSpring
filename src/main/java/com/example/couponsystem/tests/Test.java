package com.example.couponsystem.tests;

import com.example.couponsystem.loginManager.LoginManager;
import com.example.couponsystem.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class Test implements CommandLineRunner
{
    @Autowired
    AdminService adminService;
    @Autowired
    CompanyService companyService;
    @Autowired
    CustomerService customerService;
    
    private LoginManager loginManager;

    private AdminServiceTest adminServiceTest;
    private CompanyServiceTest companyServiceTest;
    private CustomerServiceTest customerServiceTest;

    @Override
    public void run(String... args) throws Exception
    {

        loginManager = LoginManager.getInstance();
        loginManager.setAdminService(adminService);
        loginManager.setCompanyService(companyService);
        loginManager.setCustomerService(customerService);

        adminServiceTest = new AdminServiceTest();
        companyServiceTest = new CompanyServiceTest();
        customerServiceTest = new CustomerServiceTest();

        adminServiceTest.addCompany();
        adminServiceTest.updateCompany();
        adminServiceTest.addCustomer();
        adminServiceTest.updateCustomer();
        adminServiceTest.getAllCompanies();
        adminServiceTest.getAllCompanies();

        companyServiceTest.addCoupon();
        companyServiceTest.getCompanyCoupons();

        customerServiceTest.purchaseCoupon();
        customerServiceTest.getCustomerCoupons();
    }
}
