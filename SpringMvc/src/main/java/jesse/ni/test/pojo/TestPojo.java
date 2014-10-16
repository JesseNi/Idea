package jesse.ni.test.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by nisheng on 2014/8/28.
 */
@Component
public class TestPojo {
        private String name;
        private String age;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAge() {
                return age;
        }

        public void setAge(String age) {
                this.age = age;
        }
}
