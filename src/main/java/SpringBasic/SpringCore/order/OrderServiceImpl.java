package SpringBasic.SpringCore.order;

import SpringBasic.SpringCore.discount.DiscountPolicy;
import SpringBasic.SpringCore.discount.FixDiscountPolicy;
import SpringBasic.SpringCore.member.Member;
import SpringBasic.SpringCore.member.MemberRepository;
import SpringBasic.SpringCore.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
