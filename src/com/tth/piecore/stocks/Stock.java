/**************************************
 *           TTHPC v1.0.0
 * @author Pie
 * @creation_date 2/4/2021
 * @version 1.0.0
 * @package com.tth.piecore.stocks
 * @description Stocks
 **************************************/

package com.tth.piecore.stocks;

/**
 * Stocks.java:
 * Main stock handler class, read data from API's and utilize other ways to get stock data
 */
public class Stock {

    public Boolean isAuthenticated;


    public Stock(Boolean isAuthenticated) {
        if(isAuthenticated) {
            ValidateAuthentication();
        }
    }

    protected Boolean ValidateAuthentication() {
        if(isAuthenticated)
        {
            System.out.println("Authenticated!");
            return true;
        }
        return false;
    }


}
