package SpringBasic.SpringCore.discount;

import SpringBasic.SpringCore.member.Grade;
import SpringBasic.SpringCore.member.Member;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP) {
            return price * discountPercent/100;
        }else{
            return 0;
        }
    }
}
