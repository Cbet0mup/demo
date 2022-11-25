package com.example.demo.XML;

import com.example.demo.XML.dto.IrpListRoot;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

import static com.example.demo.XML.utils.XmlGetMappersUtil.getXmlMapper;

public class MainXml {
    private static CharSequence searchId;

    public static void main(String[] args) throws IOException {
        String fileName = "G142009_072202_0001.xml";
        FileInputStream fis = new FileInputStream(fileName);
        byte[] filedata = IOUtils.toByteArray(fis);


        String result;

        searchId = "3014534";

        /**
         * Маппинг G1 файла
         */
        XmlMapper mapper = getXmlMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        IrpListRoot dto = mapper.readValue(filedata, IrpListRoot.class);

        AtomicReference<String> s = new AtomicReference<>("");

        dto.getIrpTicketCollection().forEach(irpTagMap -> {
            String value = irpTagMap.values().toString();
            if (value.contains("1936176")) {

                try {
                    s.set(mapper.writeValueAsString(irpTagMap));
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }

            }
        });


        System.out.println(s.get().substring(15, s.get().length() - 16));

//        String res = dto.getIrpTicketCollection()
//                .stream()
//                .filter(x -> x.values().toString().contains("3014534"))
//                .map(x -> {
//                    try {
//                        return getXmlMapper().writeValueAsString(x);
//                    } catch (JsonProcessingException e) {
//                        throw new RuntimeException(e);
//                    }
//                }).toList().toString();
//
//        System.out.println(res);

        /**
         * поиск нужного IRP
         */


//        List<IrpDataDTO> parseList = dto.getList();
//        for (IrpDataDTO data : parseList) {
//            String id = data.getTicketId();
//            if (id.contains(searchId)) {
//                result = mapper.writeValueAsString(data);
//
//                System.out.println(result);
//
//            }
//        }

    }
}
