package util;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;

/**
 * <p>解析dy网页视频地址<p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/4
 */
public class CrawlerService {

  public void getVideoAddressForDy() {
    try {
      // String url1 = "#在抖音，记录美好生活# https://v.douyin.com/qsSFEV/ 复制此链接， 打开【抖音短视频】，直接观看视频！";
      // String url1 = "https://www.iesdouyin.com/share/video/6943940575011867908/?region=&mid=6943940627499764488&u_code=0&did=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ&iid=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ&with_sec_did=1&titleType=title";
      String url1 = "https://www.iesdouyin.com/share/video/6923835539430952206/?region=&mid=6916416675407579912&u_code=0&did=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ&iid=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ&with_sec_did=1&titleType=title";
      //过滤链接，获取视频连接地址
      String dyUrl = decodeDyUrl(url1);
      URL url = new URL(dyUrl);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setInstanceFollowRedirects(false);
      int code = conn.getResponseCode();
      String redirectUrl = "";
      // 转发地址
      if (302 == code) {
        url1 = conn.getHeaderField("Location");
      }
      conn.disconnect();
      String videoid;
      // int start = url1.indexOf("/?");
      int start = url1.indexOf("?");
      int end = url1.lastIndexOf("/", start - 1);
      videoid = url1.substring(end + 1, start);
      dyUrl = "https://www.iesdouyin.com/web/api/v2/aweme/iteminfo/?item_ids=" + videoid;
      //抓取抖音网页
      String htmls = Jsoup.connect(dyUrl).ignoreContentType(true).execute().body();
      //利用正则表达式获取视频链接
      Pattern patternCompile = Pattern.compile("(?<=\")[^\"]+playwm[^\"]+(?=\")");
      //匹配后封装成Matcher对象
      Matcher m = patternCompile.matcher(htmls);
      // 利用Matcher中的group方法获取匹配的特定字符串 ②利用String的replace方法替换特
      // 定字符, 得到抖音的去水印链接
      String matchUrl = "";
      while (m.find()) {
        matchUrl = m.group(0).replaceAll("playwm", "play");
      }
      if (matchUrl.isEmpty()) {
        //解析失败
        System.out.println("fail: ");
        System.out.println(matchUrl);
      } else {
        //matchUrl就是去水印的视频地址 你想干啥就干啥吧
        System.out.println("success:");
        System.out.println(matchUrl);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private String decodeDyUrl(String url) {
    int start = url.indexOf("http");
    int end = url.lastIndexOf("/");
    return url.substring(start, end);
  }
}
