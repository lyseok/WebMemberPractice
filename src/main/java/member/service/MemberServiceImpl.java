package member.service;

import java.util.List;

import member.dao.IMemberDao;
import member.vo.JavaMemberVO;

public class MemberServiceImpl implements IMemberService {
	private static IMemberService instance;
	private IMemberDao dao;
	
	private MemberServiceImpl(IMemberDao dao) {
		this.dao = dao;
	}
	
	public static IMemberService getInstance(IMemberDao dao) {
		if(instance == null) instance = new MemberServiceImpl(dao);
		return instance;
	}
	
	@Override
	public List<JavaMemberVO> getAllMember() {
		return dao.getAllMember();
	}

	@Override
	public JavaMemberVO getMember(String id) {
		return dao.getMember(id);
	}

	@Override
	public int insertMember(JavaMemberVO vo) {
		return dao.insertMember(vo);
	}

	@Override
	public int updateMember(JavaMemberVO vo) {
		return dao.updateMember(vo);
	}

	@Override
	public int deleteMember(String id) {
		return dao.deleteMember(id);
	}

	@Override
	public int idCheck(String id) {
		return dao.idCheck(id);
	}
	

}
