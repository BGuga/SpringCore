package SpringBasic.SpringCore;

import SpringBasic.SpringCore.discount.DiscountPolicy;
import SpringBasic.SpringCore.discount.FixDiscountPolicy;
import SpringBasic.SpringCore.member.MemberRepository;
import SpringBasic.SpringCore.member.MemberService;
import SpringBasic.SpringCore.member.MemberServiceImpl;
import SpringBasic.SpringCore.member.MemoryMemberRepository;
import SpringBasic.SpringCore.order.OrderService;
import SpringBasic.SpringCore.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
//        return null;
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
//        return new RateDiscountPolicy();
    }
}
