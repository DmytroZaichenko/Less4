package subStr;

public class Sub {


    public static void main(String[] args)  {

        //String str = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        //String str = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        String str = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo&obj=Amigo";

        int pos = str.indexOf("?");
        if (pos != 0){

            String newStr = str.substring(++pos);
            String param, value;
            String[] arrValue = new String[20];
            int idxArrValue = 0;
            String[] arr = newStr.split("&");

            for (int i = 0; i < arr.length; i ++) {
                pos = arr[i].indexOf("=");

                if (pos != -1){

                    param = arr[i].split("=")[0];
                    value = arr[i].split("=")[1];

                    if (param.equals("obj")){
                        try {
                            Double d = new Double(value);
                            arrValue[idxArrValue ++] = alert(d);
                        }catch (NumberFormatException e){
                            arrValue[idxArrValue ++] = alert(value);
                        }
                    }

                }else {
                    param = arr[i];
                }

                System.out.print(param + " ");

            }
            System.out.println();
            for (int i = 0; i < arrValue.length && arrValue[i] != null ; i++) {
                System.out.println(arrValue[i]);
            }

        }

    }

    public static String alert(Double d){
        return "double " + new Double(d).toString();
    }

    public static String alert(String s){
        return "string " + s;
    }

}
