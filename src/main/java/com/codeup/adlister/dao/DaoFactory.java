package com.codeup.adlister.dao;

import com.codeup.adlister.utils.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static final Config config = new Config();
    private static Users usersDao;


    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }


}





