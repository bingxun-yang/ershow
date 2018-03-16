package test;


import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/5.
 */
public class httpTest {

    public static void main(String[] args) {

        Map<String,String> params = new HashMap<String, String>();

        String url = "http://c7f513a9ec997.2282pk.com/history?chan=gh_7f513a9ec997";
        //String url = "http://localhost:63342/ershow/ershow-web/src/main/webapp/html/testAgent.html?_ijt=ta1cuam9kogge8hq68rvrn1b1o";

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        get.setHeader("User-Agent","micromessenger");
        CloseableHttpResponse httpResponse = null;
        try {
            httpResponse = httpclient.execute(get);
            HttpEntity entity = httpResponse.getEntity();
            if(entity != null && httpResponse.getStatusLine().getStatusCode() == 200) {
                System.out.println(EntityUtils.toString(entity));
            } else {
                throw new RuntimeException("发送GET请求失败");
            }
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }finally {
            if(httpResponse != null) {
                try{httpResponse.close();}catch (IOException e){e.printStackTrace();}
            }
        }
    }

}
