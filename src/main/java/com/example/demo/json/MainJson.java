package com.example.demo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class MainJson {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "[{\"date\": 1668013200000, \"text\": \"39485734мр3мл4 3щ4ш5ощ3 щ3ш 45мш3 54щ3г 54щ ш45ищ3ш хзщ8ьз78щ9 зхщ78 \"}, {\"date\": 1669136400000, \"text\": \"fghjfthj t tuj ty uty utyu tyu ty\"}, {\"date\": 1669050000000, \"text\": \"еывпры ыр кыер ыеук ныуе \"}, {\"date\": 1669136400000, \"text\": \"вапр вк вкнг нкг\"}, {\"date\": 1669222800000, \"text\": \"11111111111111111111\"}, {\"date\": 1669222800000, \"text\": \"22222222222222\"}]";
        //JSONObject jo = new JSONObject("{\"date\": 1667322000000, \"text\": \"рароапоапоапоапоапоаа ано апо апо а оа оа а оа рлпрдшн д7ед7\"}, {\"date\": 1669136400000, \"text\": \"fgdhfsdghsd d dy drtyj eryuj ty u\"}, {\"date\": 1669136400000, \"text\": \"dtyjdjy  jty uty ty tuy\"}");
        ObjectMapper mapper = new ObjectMapper();
        List<AnswerListDto> list = mapper.readValue(json, new TypeReference<>() {
        });

        System.out.println(list.get(0).getText());


    }
}
