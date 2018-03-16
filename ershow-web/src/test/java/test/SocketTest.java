package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Channel;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/15.
 */
public class SocketTest {

    public static void main(String[] args) {
//        Channel channel = new Channel(){
//
//            public boolean isOpen() {
//                return false;
//            }
//
//            public void close() throws IOException {
//
//            }
//        };



//        Map<String,String> map = new HashMap<String, String>();
//
//
//        map.put("a","a");


        String key = "a";
        int h;
        h = key.hashCode();
        System.out.println(h >>> 16);
        //System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));



    }
}
