package SpringBasic.SpringCore.order;

import SpringBasic.SpringCore.discount.DiscountPolicy;
import SpringBasic.SpringCore.discount.FixDiscountPolicy;
import SpringBasic.SpringCore.discount.RateDiscountPolicy;
import SpringBasic.SpringCore.member.Member;
import SpringBasic.SpringCore.member.MemberRepository;
import SpringBasic.SpringCore.member.MemoryMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

//    @Autowired
//    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
//        this.memberRepository = memberRepository;
//        this.discountPolicy = discountPolicy;
//    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //Test 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
