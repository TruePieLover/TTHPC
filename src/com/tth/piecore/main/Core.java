/**************************************
 *           TTHPC v1.0.0
 * @author Pie
 * @creation_date 2/4/2021
 * @version 1.0.0
 * @package com.tth.piecore.main
 * @description Main PieCore package
 **************************************/
package com.tth.piecore.main;

/**
 * Core.java:
 *  Main core for app
 */
public class Core {

    /* Declare main core app fields */
    private String apiIDName;
    private static final String YF_API_KEY = "ccb236ec50mshf31a65d277861d4p1ba219jsn581dea6fde36";
    private static final int YF_API_ID = 1;


    public Core() {

    }

    public String SetAPI(int id) {
        if(id == YF_API_ID)
        {
            return this.apiIDName= "YF";
        }
        else
        {
            return "No API set";
        }
    }

    public void DisplayAPIName() {
        System.out.println(apiIDName);
    }

    /* Inherited YF handler class */


}
