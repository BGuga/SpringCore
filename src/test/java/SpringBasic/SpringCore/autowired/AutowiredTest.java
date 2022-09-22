package SpringBasic.SpringCore.autowired;

import SpringBasic.SpringCore.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        //호출안됨
        @Autowired(required = false)
        public void setNoBean1(Member noBean1){
            System.out.println("noBean1 = " + noBean1);
        }
        //null호출
        @Autowired
        public void SetNoBean2(@Nullable Member nobean2){
            System.out.println("noBean2 = " + nobean2);
        }
        //Optional.empty호출
        @Autowired
        public void SetNoBean3(Optional<Member> nobean3){
            System.out.println("noBean3 = " + nobean3);
        }
    }
}
