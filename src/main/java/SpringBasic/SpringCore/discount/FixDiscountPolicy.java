package SpringBasic.SpringCore.discount;

import SpringBasic.SpringCore.member.Gradle;
import SpringBasic.SpringCore.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;//1000원 할인
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Gradle.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
