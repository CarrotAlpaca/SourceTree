package com.example.kwon.movie;

import android.graphics.Movie;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.provider.DocumentsContract;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Document;
import org.w3c.dom.Text;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class MainActivity extends AppCompatActivity {

    TextView textview;
    TextView status;

    public final static String BoxOfficeURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?";
    public final static String SearchMovieListURL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.xml?";
    public final static String KEY = "key=230633a2ac677ec1574e86789aa3b586";
    public final static String NaverURL = "https://openapi.naver.com/v1/search/movie.xml?query=java";

    public static StringBuilder sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NetWork Execption에러나서 추가해줌.
        if(android.os.Build.VERSION.SDK_INT > 9){
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        String clientId = "rMALO7IaSUmtn4P7M8rb";// 애플리케이션 클라이언트 아이디값";
        String clientSecret = "UR53arZLYs";// 애플리케이션 클라이언트 시크릿값";\

        String header = "Bearer ";
        try {
            final String apiURL = "https://openapi.naver.com/v1/nid/me";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", header);
            int responseCode = con.getResponseCode();

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    responseCode == 200 ? con.getInputStream() : con.getErrorStream()));

            String inputLine;
            StringBuffer response = new StringBuffer();
            while((inputLine = br.readLine()) != null) {
                //System.out.println(inputLine);
                response.append(inputLine);
            }

            br.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
        //HOHOHO
        //New branch Minseon
        //New branch HEHEHE

    }

}


