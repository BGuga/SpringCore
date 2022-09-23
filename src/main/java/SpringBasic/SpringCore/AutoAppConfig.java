package SpringBasic.SpringCore;

import SpringBasic.SpringCore.discount.DiscountPolicy;
import SpringBasic.SpringCore.discount.RateDiscountPolicy;
import SpringBasic.SpringCore.member.MemberRepository;
import SpringBasic.SpringCore.member.MemoryMemberRepository;
import SpringBasic.SpringCore.order.Order;
import SpringBasic.SpringCore.order.OrderService;
import SpringBasic.SpringCore.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {
}
