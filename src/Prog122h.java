public class Prog122h {
    public static void main(String[] args)  {
        System.out.println("Number     Square     Square Root   Cube       4th Root");
        int lcv = 0;
        while (lcv<20) {
            lcv++;
            System.out.println(lcv + "            " + Math.round(Math.pow(lcv, 2) * 100) / 100 + "          " + Math.round(Math.pow(lcv, .5) * 100.0) / 100.0 + "           " + Math.pow(lcv, 3) + "            " + Math.round(Math.pow(lcv, .25) * 100.0) / 100.0);
        }
    }
}
/*
Number     Square     Square Root   Cube       4th Root
1            1          1.0           1.0            1.0
2            4          1.41           8.0            1.19
3            9          1.73           27.0            1.32
4            16          2.0           64.0            1.41
5            25          2.24           125.0            1.5
6            36          2.45           216.0            1.57
7            49          2.65           343.0            1.63
8            64          2.83           512.0            1.68
9            81          3.0           729.0            1.73
10            100          3.16           1000.0            1.78
11            121          3.32           1331.0            1.82
12            144          3.46           1728.0            1.86
13            169          3.61           2197.0            1.9
14            196          3.74           2744.0            1.93
15            225          3.87           3375.0            1.97
16            256          4.0           4096.0            2.0
17            289          4.12           4913.0            2.03
18            324          4.24           5832.0            2.06
19            361          4.36           6859.0            2.09
20            400          4.47           8000.0            2.11

Process finished with exit code 0
 */