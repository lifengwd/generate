/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2024 All Rights Reserved.
 */

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 *
 * @author nycp42j feng.li15
 * @version : MybatisGenerator.java, v 0.1 2024-03-06 15:38 feng.li15 Exp $$
 */
public class MybatisGenerator {

    public static void main(String[] args) {
        MybatisGenerator generator = new MybatisGenerator();
        generator.run();
    }
    public void run() {
        try {
            InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("mybatis-generator/generator-config.xml");
            List<String> warnings = new ArrayList<>();
            ConfigurationParser parser = new ConfigurationParser(warnings);
            Configuration config = parser.parseConfiguration(resourceAsStream);
            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
            generator.generate(null);
            for (String warning : warnings) {
                System.err.println(">" + warning);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}