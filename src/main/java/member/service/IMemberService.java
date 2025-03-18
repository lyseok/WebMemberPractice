package member.service;

import java.util.List;

import member.vo.JavaMemberVO;

public interface IMemberService {
	public List<JavaMemberVO> getAllMember();
	public JavaMemberVO getMember(String id);
	public int insertMember(JavaMemberVO vo);
	public int updateMember(JavaMemberVO vo);
	public int deleteMember(String id);
	public int idCheck(String id);
}
