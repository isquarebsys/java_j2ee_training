package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAndHostNames {
   public static void main(String[] args) {
      InetAddress address = null;
      InetAddress ipadd = null;
      String hostname;
      try {
         address = InetAddress.getByName("www.google.com");
         ipadd = InetAddress.getLocalHost();
         hostname = ipadd.getHostName();
         System.out.println("Your IP address : " + ipadd);
         System.out.println("Your Hostname : " + hostname);
      } catch (UnknownHostException e) {
         System.exit(2);
      }
      System.out.println(address.getHostName() + "=" + address.getHostAddress());
      System.exit(0);
   }
}