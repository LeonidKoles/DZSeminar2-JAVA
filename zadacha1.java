// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE 
// этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
package Seminar2;

public class zadacha1 {
    public static void main(String[] args) {
        String sqlsString = "select * from students where";
        JSONObject j = new JSONObject();
        j.put("name", "Ivanov");
        j.put("country", "Russia");
        j.put("city", "Moscow");
        j.put("age", null);
        
        StringBuilder res = new StringBuilder();
        String[] k;
        k = j.keySet().toString().replace("[", "").replace(" ", "").replace("]", "").split("\\,");
        res.append(sqlsString);
        boolean string;
        for (int i = 0; i < k.length; i++){
            string = j.get(k[i]) instanceof String;
            if(j.get(k[i]) != null && i == 0){
                if (string){
                    res.append(" " + k[i] + "=" + "\"" + j.get(k[i]) + "\"");
                
                } else {
                    res.append(" " + k[i] + "=" + j.get(k[i]));
                }
            } else if (j.get(k[i]) != null){

                res.append(" AND ");
                    if(string){
                        res.append(k[i] + "=" + "\""+ j.get(k[i]) + "\"");
                } else {
                    res.append(k[i] + "=" + j.get(k[i]));
                }

            }
        }  
        System.out.println(res);
    
    }
}