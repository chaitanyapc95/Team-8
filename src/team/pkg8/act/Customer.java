/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg8.act;



/**
 *
 * @author 1896052
 */
public class Customer {
    String name;
    Address address;

    private static class Address {
        private final String stno;
        private final String city;
        private final String country;
        private final String province;
        private final String pin;

        public Address(String stno,String pin,String city,String province,String country) {
            this.stno=stno;
            this.city=city;
            this.country=country;
            this.province=province;
            this.pin=pin;
            
       
        }
    }
}
