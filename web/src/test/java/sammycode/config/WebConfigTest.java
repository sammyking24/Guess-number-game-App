//package sammycode.config;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@DataJpaTest
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
//public class WebConfigTest {
//
//@Autowired
// private  WebConfig  webConfig;
//
//@Test
// public void WebConfig_SaveAll_ReturnSaveWebConfig(){
//
//// ==== ARRANGE  ==
//WebConfig webConfig = WebConfig.builder()
//        .name("show").
//        type("electric").build();
//
//
//// === ACT ===
//WebConfig saveWebConfig = WebConfig.save(WebConfig);
//
//
//// ===  ASSERT ===
//Assertions.assartThat(saveWebConfig).isNotNull( )
//
//
//}
//}
