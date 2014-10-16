package jesse.ni.framework.context;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContext;

/**
 * Created by nisheng on 2014/8/24.
 */
public class SpringContextHolder implements ApplicationContextAware {

        private static ApplicationContext context;

        @SuppressWarnings("static-access")
        public void setApplicationContext(ApplicationContext context) {
                this.context = context;
        }

        public static ApplicationContext getApplicationContext() {
                return context;
        }
}
