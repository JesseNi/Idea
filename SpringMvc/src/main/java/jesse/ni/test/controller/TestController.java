package jesse.ni.test.controller;

import jesse.ni.test.pojo.TestPojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nisheng on 2014/8/24.
 */
@Controller
@RequestMapping("/test")
public class TestController {

        @RequestMapping(value = "/index.do", method = RequestMethod.GET)
        public ModelAndView index() {
            ModelAndView mav = new ModelAndView("index");
            mav.addObject("left","left");
            return mav;
        }

        @RequestMapping(value = "/index.do", method = RequestMethod.POST)
        @ResponseBody
        public List<String> index(@RequestBody String[] array, ArrayList<String> strings) {
            List<String> list = strings;
            for(String st : array) {
                System.out.println(st);
                list.add(st);
            }
            return list;
        }

        @RequestMapping(value="/save.do",method = RequestMethod.POST)
        @ResponseBody
        public String save(@RequestBody TestPojo testPojo) {
            return testPojo.getName();
        }
}
