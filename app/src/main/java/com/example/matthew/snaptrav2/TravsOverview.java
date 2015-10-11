package com.example.matthew.snaptrav2;

import java.util.Random;
import android.app.Application;
import android.content.Intent;
import android.util.Log;

public class TravsOverview extends Application {

    public static final int STATIONS = 33;
    public Station[] stations;
    public int[] delays;



    public void onCreate(){
        super.onCreate();
        stations = new Station[33];
        delays = new int[33];

        stations[0] = new Station("215 Street", 1140);
        stations[1] = new Station("207 Street", 1143);
        stations[2] = new Station("Dyckman Street", 1147);
        stations[3] = new Station("191 Street", 1152);
        stations[4] = new Station("181 Street", 1155);
        stations[5] = new Station("168 Street Broadway", 1159);
        stations[6] = new Station("157 Street", 1164);
        stations[7] = new Station("145 Street", 1170);
        stations[8] = new Station("137 Street, City College", 1172);
        stations[9] = new Station("125 Street", 1175);
        stations[10] = new Station("116 Street", 1179);
        stations[11] = new Station("110 Street", 1181);
        stations[12] = new Station("103 Street", 1184);
        stations[13] = new Station("96 Street", 1187);
        stations[14] = new Station("86 Streets", 1191);
        stations[15] = new Station("79 Street", 1194);
        stations[16] = new Station("72 Street", 1198);
        stations[17] = new Station("66 Street", 1201);
        stations[18] = new Station("5treet, Time Square", 1205);
        stations[21] = new Station("34 Street, Penn Stat", 1207);
        stations[22] = new Station("28 Street", 1210);
        stations[23] = new Station("23 Street", 1212);
        stations[24] = new Station("18 Street", 1215);
        stations[25] = new Station("14 Street", 1219);
        stations[26] = new Station("Christopher Street", 1224);
        stations[27] = new Station("Houston Street", 1227);
        stations[28] = new Station("Canal Street", 1230);
        stations[29] = new Station("Franklin Street", 1233);
        stations[30] = new Station("City Hall", 1238);
        stations[31] = new Station("Futton Street", 1241);
        stations[32] = new Station("Wall Street", 1247);

        for(int i = 0; i < 33; i++){
            delays[i]=0;
        }


    }

    public void reset(){
        stations = new Station[33];
        delays = new int[33];

        stations[0] = new Station("215 Street", 1140);
        stations[1] = new Station("207 Street", 1143);
        stations[2] = new Station("Dyckman Street", 1147);
        stations[3] = new Station("191 Street", 1152);
        stations[4] = new Station("181 Street", 1155);
        stations[5] = new Station("168 Street Broadway", 1159);
        stations[6] = new Station("157 Street", 1164);
        stations[7] = new Station("145 Street", 1170);
        stations[8] = new Station("137 Street, City College", 1172);
        stations[9] = new Station("125 Street", 1175);
        stations[10] = new Station("116 Street", 1179);
        stations[11] = new Station("110 Street", 1181);
        stations[12] = new Station("103 Street", 1184);
        stations[13] = new Station("96 Street", 1187);
        stations[14] = new Station("86 Streets", 1191);
        stations[15] = new Station("79 Street", 1194);
        stations[16] = new Station("72 Street", 1198);
        stations[17] = new Station("66 Street", 1201);
        stations[18] = new Station("5treet, Time Square", 1205);
        stations[21] = new Station("34 Street, Penn Stat", 1207);
        stations[22] = new Station("28 Street", 1210);
        stations[23] = new Station("23 Street", 1212);
        stations[24] = new Station("18 Street", 1215);
        stations[25] = new Station("14 Street", 1219);
        stations[26] = new Station("Christopher Street", 1224);
        stations[27] = new Station("Houston Street", 1227);
        stations[28] = new Station("Canal Street", 1230);
        stations[29] = new Station("Franklin Street", 1233);
        stations[30] = new Station("City Hall", 1238);
        stations[31] = new Station("Futton Street", 1241);
        stations[32] = new Station("Wall Street", 1247);

        for(int i = 0; i < 33; i++){
            delays[i]=0;
        }
    }

    public String stations(){
        stations = new Station[33];
        stations[0] = new Station("215 Street", 1140);
        stations[1] = new Station("207 Street", 1143);
        stations[2] = new Station("Dyckman Street", 1147);
        stations[3] = new Station("191 Street", 1152);
        stations[4] = new Station("181 Street", 1155);
        stations[5] = new Station("168 Street Broadway", 1159);
        stations[6] = new Station("157 Street", 1164);
        stations[7] = new Station("145 Street", 1170);
        stations[8] = new Station("137 Street, City College", 1172);
        stations[9] = new Station("125 Street", 1175);
        stations[10] = new Station("116 Street", 1179);
        stations[11] = new Station("110 Street", 1181);
        stations[12] = new Station("103 Street", 1184);
        stations[13] = new Station("96 Street", 1187);
        stations[14] = new Station("86 Streets", 1191);
        stations[15] = new Station("79 Street", 1194);
        stations[16] = new Station("72 Street", 1198);
        stations[17] = new Station("66 Street", 1201);
        stations[18] = new Station("5treet, Time Square", 1205);
        stations[21] = new Station("34 Street, Penn Stat", 1207);
        stations[22] = new Station("28 Street", 1210);
        stations[23] = new Station("23 Street", 1212);
        stations[24] = new Station("18 Street", 1215);
        stations[25] = new Station("14 Street", 1219);
        stations[26] = new Station("Christopher Street", 1224);
        stations[27] = new Station("Houston Street", 1227);
        stations[28] = new Station("Canal Street", 1230);
        stations[29] = new Station("Franklin Street", 1233);
        stations[30] = new Station("City Hall", 1238);
        stations[31] = new Station("Futton Street", 1241);
        stations[32] = new Station("Wall Street", 1247);
        String station;
        if(stations[0]!=null) {
             station = "";
            for (int i = 0; i < 33; i++) {
                station += stations[i].getName() + ":\n";
            }
        }
        else{
            reset();
            return stations();
        }
        return station;
    }

    public String scheduledTime(){
        stations = new Station[33];
        stations[0] = new Station("215 Street", 1140);
        stations[1] = new Station("207 Street", 1143);
        stations[2] = new Station("Dyckman Street", 1147);
        stations[3] = new Station("191 Street", 1152);
        stations[4] = new Station("181 Street", 1155);
        stations[5] = new Station("168 Street Broadway", 1159);
        stations[6] = new Station("157 Street", 1164);
        stations[7] = new Station("145 Street", 1170);
        stations[8] = new Station("137 Street, City College", 1172);
        stations[9] = new Station("125 Street", 1175);
        stations[10] = new Station("116 Street", 1179);
        stations[11] = new Station("110 Street", 1181);
        stations[12] = new Station("103 Street", 1184);
        stations[13] = new Station("96 Street", 1187);
        stations[14] = new Station("86 Streets", 1191);
        stations[15] = new Station("79 Street", 1194);
        stations[16] = new Station("72 Street", 1198);
        stations[17] = new Station("66 Street", 1201);
        stations[18] = new Station("5treet, Time Square", 1205);
        stations[21] = new Station("34 Street, Penn Stat", 1207);
        stations[22] = new Station("28 Street", 1210);
        stations[23] = new Station("23 Street", 1212);
        stations[24] = new Station("18 Street", 1215);
        stations[25] = new Station("14 Street", 1219);
        stations[26] = new Station("Christopher Street", 1224);
        stations[27] = new Station("Houston Street", 1227);
        stations[28] = new Station("Canal Street", 1230);
        stations[29] = new Station("Franklin Street", 1233);
        stations[30] = new Station("City Hall", 1238);
        stations[31] = new Station("Futton Street", 1241);
        stations[32] = new Station("Wall Street", 1247);
        String station = "";
        for(int i = 0; i < 33; i ++){
            station+="Scheduled time: " +  stations[i].getTimeScheduled() + stations[i].getPeriod(stations[i].getTimeScheduled()) +"\n";
        }
        return station;
    }

    public String expectedTime(){
        stations = new Station[33];
        stations[0] = new Station("215 Street", 1140);
        stations[1] = new Station("207 Street", 1143);
        stations[2] = new Station("Dyckman Street", 1147);
        stations[3] = new Station("191 Street", 1152);
        stations[4] = new Station("181 Street", 1155);
        stations[5] = new Station("168 Street Broadway", 1159);
        stations[6] = new Station("157 Street", 1164);
        stations[7] = new Station("145 Street", 1170);
        stations[8] = new Station("137 Street, City College", 1172);
        stations[9] = new Station("125 Street", 1175);
        stations[10] = new Station("116 Street", 1179);
        stations[11] = new Station("110 Street", 1181);
        stations[12] = new Station("103 Street", 1184);
        stations[13] = new Station("96 Street", 1187);
        stations[14] = new Station("86 Streets", 1191);
        stations[15] = new Station("79 Street", 1194);
        stations[16] = new Station("72 Street", 1198);
        stations[17] = new Station("66 Street", 1201);
        stations[18] = new Station("5treet, Time Square", 1205);
        stations[21] = new Station("34 Street, Penn Stat", 1207);
        stations[22] = new Station("28 Street", 1210);
        stations[23] = new Station("23 Street", 1212);
        stations[24] = new Station("18 Street", 1215);
        stations[25] = new Station("14 Street", 1219);
        stations[26] = new Station("Christopher Street", 1224);
        stations[27] = new Station("Houston Street", 1227);
        stations[28] = new Station("Canal Street", 1230);
        stations[29] = new Station("Franklin Street", 1233);
        stations[30] = new Station("City Hall", 1238);
        stations[31] = new Station("Futton Street", 1241);
        stations[32] = new Station("Wall Street", 1247);
        String station = "";
        for(int i = 0; i < 33; i ++){
            station+="Expected time: " + stations[i].getTimeExpected() + stations[i].getPeriod(stations[i].getTimeScheduled()) +"\n";
        }
        return station;
    }

    public void changeTime(int position, int time){
        stations[position].setTimeExpected(stations[position].getTimeScheduled()+time);
    }
}