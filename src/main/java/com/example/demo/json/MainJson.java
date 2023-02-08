package com.example.demo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.text.ParseException;
import java.util.*;

public class MainJson {
    public static void main(String[] args) throws JsonProcessingException, ParseException {
//        String json = "[{\"date\": 1668013200000, \"text\": \"39485734мр3мл4 3щ4ш5ощ3 щ3ш 45мш3 54щ3г 54щ ш45ищ3ш хзщ8ьз78щ9 зхщ78 \"}, {\"date\": 1669136400000, \"text\": \"fghjfthj t tuj ty uty utyu tyu ty\"}, {\"date\": 1669050000000, \"text\": \"еывпры ыр кыер ыеук ныуе \"}, {\"date\": 1669136400000, \"text\": \"вапр вк вкнг нкг\"}, {\"date\": 1669222800000, \"text\": \"11111111111111111111\"}, {\"date\": 1669222800000, \"text\": \"22222222222222\"}]";
//        //JSONObject jo = new JSONObject("{\"date\": 1667322000000, \"text\": \"рароапоапоапоапоапоаа ано апо апо а оа оа а оа рлпрдшн д7ед7\"}, {\"date\": 1669136400000, \"text\": \"fgdhfsdghsd d dy drtyj eryuj ty u\"}, {\"date\": 1669136400000, \"text\": \"dtyjdjy  jty uty ty tuy\"}");
//        ObjectMapper mapper = new ObjectMapper();
//        List<AnswerListDto> list = mapper.readValue(json, new TypeReference<>() {
//        });
            String[] arr = {"ghjghj", "ghjgh"};


            List<Object> json = new ArrayList<>();
            json.add("fgdfg");
            json.add("fgdfg");
            json.add("fgdfg");
            json.add("fgdfg");


        Object o = json.isEmpty() ? "" : json.stream().toList();

        JRBeanCollectionDataSource rgdfg = new JRBeanCollectionDataSource(json);
        Object ok = new Object();

            String result = String.join("\n", arr);

//           String tt = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
//                    .format(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
//                            .parse("$F{preliminaryAnswerDate}").toString());


           // rgdfg.getData().stream().collect(Collectors.toA)

        Map<String, Object> maps =new HashMap<>();

        maps.put("0", "");
        maps.put("1", "cvbbb");
        maps.put("2", "ghjghj");
        maps.put("3", "uiouio");
        

        List<?> list = new ArrayList<>();
        //list.add(new ArrayList<,>(maps));
//
        list.stream()
                .filter(m -> m instanceof java.util.Map<?, ?>)
                .map(m -> "Дата: %s Текст: %s".formatted(
                        new java.text.SimpleDateFormat("dd.MM.yy HH:mm").
                                format(java.time.Instant.ofEpochMilli(Long.parseLong(
                                        ((Map<?, ?>) m).get("date").toString())).plusSeconds(10800).toEpochMilli()),
                        ((Map<?, ?>)m).get("text")))
                .collect(java.util.stream.Collectors.joining("\n"));


        //list.stream().filter(Map::isEmpty).map(entry -> entry.getKey() + " = " + entry.getValue());//.map(map -> (String) map.get("0"));//collect(Collectors.joining(", "));

//                .map(m -> {
//                    if (m instanceof java.util.Map<?, ?> )
//                        return (java.util.Map<?, ?>) m;
//                    else
//                        return (java.util.Map<?, ?>) null;
//                })

//new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT).parse("2022-11-15T09:35:51.000Z")
        System.out.println();

//                new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm")
//                        .format(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
//                        .parse("2022-11-15T09:35:51.000Z").getTime() + 10800000));
        //(java.lang.String.valueOf(java.lang.Long.parseLong($F{ticketOpenDate}) + 10800)
}
}

