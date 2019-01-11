import org.junit.Test;

import java.net.InetAddress;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: yiqq
 * @date: 2018/8/27
 * @description:
 */
public class test {

    private static Map<String, Integer> serviceWeightMap = new HashMap<String, Integer>();
    static {
        serviceWeightMap.put("192.168.1.100", 1);
        serviceWeightMap.put("192.168.1.101", 2);
        serviceWeightMap.put("192.168.1.102", 3);
        serviceWeightMap.put("192.168.1.103", 4);
        serviceWeightMap.put("192.168.1.104", 5);
        serviceWeightMap.put("192.168.1.105", 6);
        serviceWeightMap.put("192.168.1.106", 7);
        serviceWeightMap.put("192.168.1.107", 8);
        serviceWeightMap.put("192.168.1.108", 9);
        serviceWeightMap.put("192.168.1.109", 10);
        serviceWeightMap.put("192.168.1.110", 11);
    }

    private AtomicInteger integer = new AtomicInteger(0);

    /**
     * 随机
     */
    @Test
    public void Taa() {
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            System.out.println(random.nextInt(10));
        }

        try {
            String ip = InetAddress.getLocalHost().toString();
            int a = ip.hashCode();
            System.out.println(a);
            System.out.println(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 轮询
     */
    @Test
    public void tset(){
        for (int i = 0; i < 10; i++) {
            int current = integer.get();
            int next = (current + 1) % 10;
            if (integer.compareAndSet(current, next))
                System.out.println(next);
        }
    }

    @Test
    public void ss(){
        Map<String, Integer> serverMap = new HashMap<String, Integer>();
        serverMap.putAll(serviceWeightMap);

        //取得IP地址list
        Set<String> keySet = serverMap.keySet();

        ArrayList<String> keyList = new ArrayList<String>();
        keyList.addAll(keySet);

        String remoteIp = "192.168.1.105";
        int hashCode = remoteIp.hashCode();
        System.out.println("hashCode: "+ hashCode +  "keyList: " + keyList.size());
        int pos = hashCode % keyList.size();
        if( pos < 0 ) {
            pos = pos + keyList.size();
        }
        System.out.println(pos);
        System.out.println( keyList.get(pos));
    }
}
