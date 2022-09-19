package SpringBasic.SpringCore;

import SpringBasic.SpringCore.member.Gradle;
import SpringBasic.SpringCore.member.Member;
import SpringBasic.SpringCore.member.MemberService;
import SpringBasic.SpringCore.member.MemberServiceImpl;
import SpringBasic.SpringCore.order.Order;
import SpringBasic.SpringCore.order.OrderService;
import SpringBasic.SpringCore.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId=1L;
        Member member = new Member(memberId, "memberA", Gradle.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
