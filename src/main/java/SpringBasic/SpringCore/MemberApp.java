package SpringBasic.SpringCore;

import SpringBasic.SpringCore.member.Gradle;
import SpringBasic.SpringCore.member.Member;
import SpringBasic.SpringCore.member.MemberService;
import SpringBasic.SpringCore.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService=new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Gradle.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
