package jesse.ni.test.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

/**
 * Created by nisheng on 2014/8/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext*.xml",
        "classpath:dispatcher.xml"})
public class TestControllerTest {
        @Resource
        private WebApplicationContext wac;
        @Resource
        private TestController testController;
        private MockMvc mockMvc;

        @Before
        public void init() throws Exception {
            System.out.println("-------TestController junit test init---------");
            mockMvc = MockMvcBuilders.standaloneSetup(testController).build();
        }

        @After
        public void leave() {
            System.out.println("-------TestController junit test leave---------");
        }

        @Test
        public void test() throws Exception {
            System.out.println("-------TestController junit test start---------");
            String createJsonStr = String.format(
                    "{\"name\":\"jesse_ni\",\"age\":\"22\"}");
            ResultActions ra1 = mockMvc.perform(MockMvcRequestBuilders
                    .post("/test/save.do")
                    .accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(createJsonStr));
            String name = ra1.andReturn().getResponse().getContentAsString();
            assertEquals("jesse_ni",name);
        }
}
