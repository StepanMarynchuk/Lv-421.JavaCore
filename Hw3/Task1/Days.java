package com.softserve;

   public enum Days {
       Monday ("ponedilok", "monday"), Tuesday ("vivtorok", "tuesday"), Wednesday ("sereda", "wednesday"),
       Thursday ("chetver", "thursday"), Friday ("p'yatnytsya", "friday"),
       Saturday("subota", "saturday"),Sunday ("nedilya", "sunday");


       String ua;
       String en;

       Days(String ua, String en) {
           this.ua = ua;
           this.en = en;
       }

       public String getUA() {
           return ua;
       }

       public String getEN() {
           return en;
       }
   }