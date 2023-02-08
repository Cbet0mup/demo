package com.example.strategyexample.strategy.strategyList;

import com.example.strategyexample.strategy.RegionCode;
import com.example.strategyexample.strategy.strategyList.strategy.DefaultRegionG1FileProcessorStrategy;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static java.util.function.Function.identity;

@Service
public class ProcessFileStrategyExperimentalClass {

    private final DefaultRegionG1FileProcessorStrategy defaultRegionG1FileProcessorStrategy;

    private final Map<RegionCode, G1FileProcessor> processor;

    public ProcessFileStrategyExperimentalClass(DefaultRegionG1FileProcessorStrategy defaultRegionG1FileProcessorStrategy, List<G1FileProcessor> strategy) {
        this.defaultRegionG1FileProcessorStrategy = defaultRegionG1FileProcessorStrategy;
        this.processor = strategy.stream().collect(Collectors.toMap(G1FileProcessor::getRegionCode, identity()));
    }
    public void printString(G1File file) {

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ZipOutputStream zipOutputStream = new ZipOutputStream(bos)) {

            //*****
            FileOutputStream fos = new FileOutputStream(file.getFileName().replace("xml", "zip"));

            //File fileEx = new File("/home/pavel/IdeaProjects/demo/src/main/resources/files/");

            //****

            zipOutputStream.putNextEntry(new ZipEntry(fileProcessor(file).process(file)));

            zipOutputStream.write(file.getFile());
            zipOutputStream.closeEntry();

            //*****
            fos.write(bos.toByteArray());
            fos.close();
            //*****

            System.out.println(fileProcessor(file).process(file));
            System.out.println(bos);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private G1FileProcessor fileProcessor(G1File g1File) {
        return processor.getOrDefault(g1File.getRegionCode(), defaultRegionG1FileProcessorStrategy);
    }
}
