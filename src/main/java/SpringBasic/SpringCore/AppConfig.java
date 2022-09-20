package SpringBasic.SpringCore;

import SpringBasic.SpringCore.discount.DiscountPolicy;
import SpringBasic.SpringCore.discount.FixDiscountPolicy;
import SpringBasic.SpringCore.member.MemberRepository;
import SpringBasic.SpringCore.member.MemberService;
import SpringBasic.SpringCore.member.MemberServiceImpl;
import SpringBasic.SpringCore.member.MemoryMemberRepository;
import SpringBasic.SpringCore.order.OrderService;
import SpringBasic.SpringCore.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
