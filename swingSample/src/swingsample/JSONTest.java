/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample;

import static java.util.logging.Logger.global;
import jdk.nashorn.internal.parser.JSONParser;

/**
 *
 * @author yubaraj
 */

public class JSONTest {
         
        globla String dataFromFile = "[\n" +
"		{\n" +
"			\"s.n.\": 1,\n" +
"	    	\"firstname\": \"yubaraj\",\n" +
"	    	\"lastname\": \"poudel\"\n" +
"		},\n" +
"		{\n" +
"			\"s.n.\": 1,\n" +
"	    	\"firstname\": \"yubaraj\",\n" +
"	    	\"lastname\": \"poudel\"\n" +
"		},\n" +
"		{\n" +
"			\"s.n.\": 1,\n" +
"	    	\"firstname\": \"yubaraj\",\n" +
"	    	\"lastname\": \"poudel\"\n" +
"		},\n" +
"		{\n" +
"			\"s.n.\": 1,\n" +
"	    	\"firstname\": \"yubaraj\",\n" +
"	    	\"lastname\": \"poudel\"\n" +
"		},\n" +
"\n" +
"	] ";
            
            public void parseJSON(){
                JSONParser parser = new JSONParser(dataFromFile, global, true);
                
            }
    
}
