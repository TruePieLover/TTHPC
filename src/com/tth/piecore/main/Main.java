/**************************************
 *           TTHPC v1.0.0
 * @author Pie
 * @creation_date 2/4/2021
 * @version 1.0.0
 * @package com.tth.piecore
 * @description Main PieCore core package
 **************************************/

package com.tth.piecore.main;


import com.tth.piecore.main.Core;
import com.tth.piecore.stocks.*;

/**
 * Main.java:
 * Main app source file
 */
public class Main {

    /* API Handler internal class */
    static class APIHandler {

        /**
         * Internal class to handle api
         *
         * @param id ID for the API to use to get data
         */
        private APIHandler(int id) {
            if (id == 1) {
                usingYFApi();
            }
        }

        private void usingYFApi() {
            System.out.println("Using Yahoo Finance API to gather data...");

        }

        private String GetAPI() {
            Core c = new Core();
            String api = c.SetAPI(1);
            return api;
        }

    }

    public static void main(String[] args) {
        new APIHandler((1));
    }
}

