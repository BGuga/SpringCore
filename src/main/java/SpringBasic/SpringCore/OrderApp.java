package SpringBasic.SpringCore;

import SpringBasic.SpringCore.member.Grade;
import SpringBasic.SpringCore.member.Member;
import SpringBasic.SpringCore.member.MemberService;
import SpringBasic.SpringCore.member.MemberServiceImpl;
import SpringBasic.SpringCore.order.Order;
import SpringBasic.SpringCore.order.OrderService;
import SpringBasic.SpringCore.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId=1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
