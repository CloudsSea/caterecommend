package edu.njtu.tools;

import edu.njtu.spark.Test2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class FileTools {
    private static Logger logger = LoggerFactory.getLogger(FileTools.class);

    public static void fileFormat(String filePath, String fileName, String fileType, String formatType) throws FileNotFoundException {
        File file = new File(filePath + fileName + "." + fileType);
        BufferedReader reader = null;
        int i = 0;;
        try {
            reader = new BufferedReader(new FileReader(file));
            //System.out.println("以行为单位读取文件内容，一次读一整行：");
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束

            String content = "";
            int index = 0;
            int indexSon = 0;
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                //System.out.println("line " + line + ": " + tempString);

                tempString = doFormat(tempString, formatType);
                content += tempString + "\r\n";
                logger.info(++index +"");
                if (index != 1 && index%10000 == 1) {
                    File newFile = new File(filePath + fileName + indexSon + "_format." + fileType);
                    BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
                    writer.write(content);
                    writer.close();

                    content = "";
                    indexSon ++;
                    logger.info(indexSon+"");
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    private static String doFormat(String tempString, String formatType) {
        String result = "";
        switch (formatType) {
            case "business":
                //语句
                result = doFormatBusiness(tempString);
                break; //可选
            case "user":
                result = doFormatUser(tempString);
                break; //可选
            case "photo":
                result = doFormatPhoto(tempString);
                break; //可选
            case "review":
                result = doFormatReview(tempString);
                break; //可选
            default: //可选
                //语句
        }

        return result;
    }

    private static String doFormatReview(String oriString) {
        oriString = oriString.replace("business_id", "businessId");
        oriString = oriString.replace("review_id", "reviewId");
        oriString = oriString.replace("user_id", "userId");
        return oriString;
    }

    private static String doFormatPhoto(String oriString) {
        oriString = oriString.replace("business_id", "businessId");
        oriString = oriString.replace("photo_id", "photoId");
        return oriString;
    }

    private static String doFormatUser(String oriString) {
        oriString = oriString.replace("average_stars", "averageStars");
        oriString = oriString.replace("review_count", "reviewCount");
        oriString = oriString.replace("user_id", "userId");
        oriString = oriString.replace("yelping_since", "yelpingSince");
        return oriString;
    }

    private static String doFormatBusiness(String oriString) {

//        oriString = oriString.replace("attributes","xxx");
        oriString = oriString.replace("Accepts Credit Cards", "acceptsCreditCards");
        oriString = oriString.replace("Accepts Insurance", "acceptsInsurance");
        oriString = oriString.replace("Ages Allowed", "agesAllowed");
        oriString = oriString.replace("Alcohol", "alcohol");
        oriString = oriString.replace("Ambience", "ambience");
        oriString = oriString.replace("Attire", "attire");
        oriString = oriString.replace("BYOB", "byob");
        oriString = oriString.replace("Corkage", "corkage");
        oriString = oriString.replace("/corkage", "Corkage");
        oriString = oriString.replace("By Appointment Only", "byAppointmentOnly");
        oriString = oriString.replace("Caters", "caters");
        oriString = oriString.replace("Coat Check", "coatCheck");
        oriString = oriString.replace("Delivery", "delivery");
        oriString = oriString.replace("Dietary Restrictions", "dietaryRestrictions");
        oriString = oriString.replace("Dogs Allowed", "dogsAllowed");
        oriString = oriString.replace("Drive-Thru", "driveThru");
        oriString = oriString.replace("Good For", "goodFor");
        oriString = oriString.replace("Good For Dancing", "goodForDancing");
        oriString = oriString.replace("Good For Groups", "goodForGroups");
        oriString = oriString.replace("Good for Kids", "goodForKids");
        oriString = oriString.replace("Hair Types Specialized In", "hairTypesSpecializedIn");
        oriString = oriString.replace("Happy Hour", "happyHour");
        oriString = oriString.replace("Has TV", "hasTV");
        oriString = oriString.replace("Music", "music");
        oriString = oriString.replace("Noise Level", "noiseLevel");
        oriString = oriString.replace("Open 24 Hours", "open24Hours");
        oriString = oriString.replace("Order at Counter", "orderAtCounter");
        oriString = oriString.replace("Outdoor Seating", "outdoorSeating");
        oriString = oriString.replace("Parking", "parking");
        oriString = oriString.replace("Price Range", "priceRange");
        oriString = oriString.replace("Smoking", "smoking");
        oriString = oriString.replace("Take-out", "takeOut");
        oriString = oriString.replace("Takes Reservations", "takesReservations");
        oriString = oriString.replace("Waiter Service", "waiterService");
        oriString = oriString.replace("Wheelchair Accessible", "wheelchairAccessible");
        oriString = oriString.replace("Wi-Fi", "wiFi");

        oriString = oriString.replace("business_id", "businessId");
        oriString = oriString.replace("full_address", "fullAddress");
        oriString = oriString.replace("Friday", "friday");
        oriString = oriString.replace("Monday", "monday");
        oriString = oriString.replace("Saturday", "saturday");
        oriString = oriString.replace("Sunday", "sunday");
        oriString = oriString.replace("Thursday", "thursday");
        oriString = oriString.replace("Tuesday", "tuesday");
        oriString = oriString.replace("Wednesday", "wednesday");
        oriString = oriString.replace("review_count", "reviewCount");
        return oriString;
    }

    public static void main(String[] args) {
        //readFile();
//		String fileName1 = "FilterdBusiness";
        String fileName2 = "FilteredPhoto";
        String fileName3 = "FilteredReview1";
        String fileName4 = "FilteredUser1";
        String formatType1 = "business";
        String formatType2 = "photo";
        String formatType3 = "review";
        String formatType4 = "user";

        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\";
        try {
//            fileFormat(filePath, fileName2, "json", formatType2);
            System.out.println("over2");
//            fileFormat(filePath, fileName3, "json", formatType3);
            System.out.println("over3");
            fileFormat(filePath, fileName4, "json", formatType4);

            System.out.println("over4");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
