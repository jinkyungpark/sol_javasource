package chapter13.ch05.memberhashmapEx01;



public class MemberHashMapMain {

	public static void main(String[] args) {

		MemberHashMap memberHashMap=new MemberHashMap();
		
		//�Է��Ҷ� �ʿ��� �Ű����� ��ü ����
		Member memberLee=new Member(1001, "�̼���");
		Member memberPark=new Member(1002, "������");
		Member memberKim=new Member(1003, "�����");
		Member memberJung=new Member(1004, "���ϳ�");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberJung);
		memberHashMap.addMember(new Member(1005, "�̹���"));
		memberHashMap.addMember(new Member(1005, "�ӹ���"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember();

	}

}
