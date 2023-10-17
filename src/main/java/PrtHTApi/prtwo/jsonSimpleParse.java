package PrtHTApi.prtwo;
// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.

import org.json.simple.JSONObject;

// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class jsonSimpleParse {
    public static void main(String[] args) {
        String sqlresponse = "select * from students where ";
        JSONObject js = new JSONObject();
        String[] array = {"name", "country", "city", "age"};
        StringBuilder sb = new StringBuilder();
        js.put(array[0], "Ivanov");
        js.put(array[1], "Russia");
        js.put(array[2], "Moscow");
        js.put(array[3], null);
        for (int i = 0; i < array.length; i++) {
            if (js.get(array[i]) != null) {
                sb.append(array[i] + "=");
                sb.append(js.get(array[i]) + "");
                sb.append(" and ");
            }
        }
        System.out.println(sqlresponse + sb.delete(sb.length()-4,sb.length()-1));
    }
}