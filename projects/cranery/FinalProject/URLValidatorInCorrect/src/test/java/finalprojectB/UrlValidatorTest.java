/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }



   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.google.com"));
     System.out.println(urlVal.isValid("http://ww.amazon.co.uk"));
     System.out.println(urlVal.isValid("https://www.twitch.tv"));
     System.out.println(urlVal.isValid("http://www.twitch.tv"));
     System.out.println(urlVal.isValid("https://www.twitch.com"));
     System.out.println(urlVal.isValid(""));
     System.out.println(urlVal.isValid(null));
     System.out.println(urlVal.isValid("oaiudhslfaisjdfoisjeijfskl"));

   }

//good inputs
   public void testYourFirstPartition()
   {
     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

     System.out.println(urlVal.isValid("http://www.amazon.com"));
	   System.out.println(urlVal.isValid("http://www.google.com"));
     System.out.println(urlVal.isValid("https://www.twitch.tv"));
   }
//bad scheme
   public void testYourSecondPartition(){
     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

     System.out.println(urlVal.isValid("grtdf://www.amazon.com"));
     System.out.println(urlVal.isValid("ptth://www.google.com"));
     System.out.println(urlVal.isValid("sfdz://www.twitch.tv"));
   }
   //bad authority
   public void testYourThirdPartition(){
     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

     System.out.println(urlVal.isValid("http://isejofjsl"));
	   System.out.println(urlVal.isValid("http://ijfoasidjf"));
     System.out.println(urlVal.isValid("https://lsoidjfsl"));
   }
   //bad port
   public void testYourFourthPartition()
   {
     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

     System.out.println(urlVal.isValid("http://www.amazon.com:fsjkoeifj"));
     System.out.println(urlVal.isValid("http://www.google.com:-789"));
     System.out.println(urlVal.isValid("https://www.twitch.tv:fish"));
   }
   //bad path
   public void testYourFifthPartition()
   {
     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

     System.out.println(urlVal.isValid("http://www.amazon.com/../"));
     System.out.println(urlVal.isValid("http://www.google.com//../"));
     System.out.println(urlVal.isValid("https://www.twitch.tv/ken//me"));
   }

   public void testIsValid()
   {
     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

     String[] testinp;
     testinp = new String[10];
     testinp[0] = "ptth://www.google.com";
     testinp[1] = "grtdf://www.amazon.com";
     testinp[2] = "http://isejofjsl";
     testinp[3] = "https://lsoidjfsl";
     testinp[4] = "https://www.twitch.tv:fish";
     testinp[5] = "http://www.google.com:-789";
     testinp[6] = "http://www.amazon.com/../";
     testinp[7] = "http://www.google.com//../";
     testinp[8] = "https://www.twitch.tv/ken//me";
     testinp[9] = "lkasjefosjeflsmclskekjfs";
	   for(int i = 0;i<testinp.length;i++)
	   {
       System.out.println(i);
       assertFalse(urlVal.isValid(testinp[i]));
	   }
   }

   public void testAnyOtherUnitTest()
   {

   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */


}
