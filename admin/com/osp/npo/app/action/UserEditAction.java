package com.osp.npo.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;
import com.osp.npo.app.context.CommonContext;
import com.osp.npo.app.form.UserEditForm;
import com.osp.npo.app.message.MessageUtil;
import com.osp.npo.app.viewhelper.UserEditViewHelper;
import com.osp.npo.common.global.Constants;
import com.osp.npo.common.util.Crypter;
import com.osp.npo.core.user.UserAuthorityInfo;
import com.osp.npo.core.user.UserAuthorityList;
import com.osp.npo.core.user.UserInfo;
import com.osp.npo.core.user.UserList;
import com.osp.npo.service.UserService;

/**
 * <P>
 * Action for User Edit
 * </P>
 * 
 * @author KienLT
 * @author GiangVT
 * @version $Revision: 20314 $
 */
public class UserEditAction extends BaseMDAction {
	private static final String SUCCESS = "success";
	private static final String FAILURE = "failure";
	private static final String USER_ID_PARANETER = "id";

	/**
	 * <P>
	 * Action for first view
	 * </P>
	 * 
	 * @author KienLT
	 * @author GiangVT
	 * @author TruongND
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward view(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		createTitle(Constants.SCREEN_ADM017);

		request.getSession().removeAttribute(UserEditViewHelper.SESSION_KEY);
		UserEditViewHelper userEditViewHelper = new UserEditViewHelper();

		UserService userService = new UserService(getConnection());

		int id = Integer.parseInt(request.getParameter(USER_ID_PARANETER));
		//System.
	
		System.out.println("id lay duoc la:"+id);
		// khoi tao trang thai hoat dong
		UserEditForm f = (UserEditForm) form;
		f.setActiveFlg(true);

		// Lay thong tin nguoi dung
		userService.setUsidFilter((long)id);
		UserList userList = userService.queryAllUser(false);
		if (userList.size() == 0) {
			ActionErrors errors = new ActionErrors();
			errors.add(new MessageUtil().createActionMessages("", request, "err_not_exist", "item_user"));
			saveErrors(request, errors);
			return mapping.findForward(FAILURE);
		}

		UserInfo userInfo = (UserInfo) userList.get(0);

		userEditViewHelper.setId(id);
		userEditViewHelper.setFamilyName(userInfo.getFamilyName());
		userEditViewHelper.setFirstName(userInfo.getFirstName());
		userEditViewHelper.setAccount(userInfo.getAccount());
		userEditViewHelper.setBirthday(userInfo.getBirthday());
		userEditViewHelper.setSex(userInfo.getSex());
		userEditViewHelper.setAddress(userInfo.getAddress());
		userEditViewHelper.setEmail(userInfo.getEmail());
		userEditViewHelper.setTelephone(userInfo.getTelephone());
		userEditViewHelper.setMobile(userInfo.getMobile());
		userEditViewHelper.setRole(userInfo.getRole());
		userEditViewHelper.setActiveFlg(userInfo.getActiveFlg());

		CommonContext commonContext = (CommonContext) request.getSession().getAttribute(CommonContext.SESSION_KEY);

		UserInfo currentUser = commonContext.getUserInfo();
		if (currentUser.getId().equals(userInfo.getId())) {
			userEditViewHelper.setCanDel(false);
		} else {
			userEditViewHelper.setCanDel(true);
		}
		
		Boolean preventAuthority = Boolean.FALSE;
		UserAuthorityList userAuthorityList = userService.queryUserAuthorityByUsid(false, (long) id);
		for (int i = 0; i < userAuthorityList.size(); i++) {
			if (Constants.AUTHORITY_PREVENT_DATA.equals(userAuthorityList.get(i).getAuthorityCode())) {
				preventAuthority = Boolean.TRUE;
				break;
			}
		}
		userEditViewHelper.setPreventAuthority(preventAuthority);
		


		request.getSession().setAttribute(UserEditViewHelper.SESSION_KEY, userEditViewHelper);
		return mapping.findForward(SUCCESS);
	}

	/**
	 * <P>
	 * Action save user
	 * </P>
	 * 
	 * @author KienLT
	 * @author GiangVT
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward save(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		UserEditViewHelper view = (UserEditViewHelper) request.getSession()
				.getAttribute(UserEditViewHelper.SESSION_KEY);

		UserService userService = new UserService(getConnection());
		UserEditForm userEditForm = (UserEditForm) form;
		int id = view.getId();

		userService.setUsidFilter((long) id);
		UserList userList = userService.queryAllUser(false);
		if (userList.size() == 0) {
			ActionErrors errors = new ActionErrors();
			errors.add(new MessageUtil().createActionMessages("", request,
					"err_not_exist", "item_user"));
			saveErrors(request, errors);
			return mapping.findForward(FAILURE);
		}

		UserInfo userInfo = (UserInfo) userList.get(0);

		userInfo.setFamilyName(userEditForm.getFamilyName());
		userInfo.setFirstName(userEditForm.getFirstName());
		if (userEditForm.getPassword() != null
				&& !userEditForm.getPassword().equals("")) {
			userInfo.setPassword(Crypter.crypt(userEditForm.getPassword()));
		}
		userInfo.setBirthday(userEditForm.getBirthday());
		userInfo.setSex(userEditForm.getSex());
		userInfo.setAddress(userEditForm.getAddress());
		userInfo.setEmail(userEditForm.getEmail());
		userInfo.setTelephone(userEditForm.getTelephone());
		userInfo.setMobile(userEditForm.getMobile());
		userInfo.setRole(userEditForm.getRole());
		userInfo.setActiveFlg(userEditForm.getActiveFlg());

		// Update user information
		createUpdateUserInfo(userInfo);

		userService.modifyUser(userInfo);

		view.reset(userEditForm);

		// Remove authority
		userService.removeUserAuthority(userInfo.getId());

		if (view.getCanDel()) {
			// Add authority
			if (userEditForm.getAdminAuthority() != null
					&& userEditForm.getAdminAuthority()) {
				UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
				userAuthorityInfo.setUserId(userInfo.getId());
				userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_ADMIN);
				userService.entryUserAuthority(userAuthorityInfo);
			}
		} else {
			// Cap nhat cho chinh minh
			UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
			userAuthorityInfo.setUserId(userInfo.getId());
			userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_ADMIN);
			userService.entryUserAuthority(userAuthorityInfo);
		}

		// Add authority
		if (userEditForm.getPreventAuthority() != null
				&& userEditForm.getPreventAuthority()) {
			UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
			userAuthorityInfo.setUserId(userInfo.getId());
			userAuthorityInfo
					.setAuthorityCode(Constants.AUTHORITY_PREVENT_DATA);
			userService.entryUserAuthority(userAuthorityInfo);
		}

		if (userEditForm.getContractAuthority() != null
				&& userEditForm.getContractAuthority()) {
			UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
			userAuthorityInfo.setUserId(userInfo.getId());
			userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_CONTRACT);
			userService.entryUserAuthority(userAuthorityInfo);
		}

		if (userEditForm.getBankAuthority() != null
				&& userEditForm.getBankAuthority()) {
			UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
			userAuthorityInfo.setUserId(userInfo.getId());
			userAuthorityInfo.setAuthorityCode(Constants.AUTHORITY_BANK_REPORT);
			userService.entryUserAuthority(userAuthorityInfo);
		}

		if (userEditForm.getAnnouncementAuthority() != null
				&& userEditForm.getAnnouncementAuthority()) {
			UserAuthorityInfo userAuthorityInfo = new UserAuthorityInfo();
			userAuthorityInfo.setUserId(userInfo.getId());
			userAuthorityInfo
					.setAuthorityCode(Constants.AUTHORITY_ANNOUNCEMENT);

			userService.entryUserAuthority(userAuthorityInfo);
		}

		getConnection().commit();

		// Hien thi thong bao Sua thanh cong
		ActionMessages messages = new ActionMessages();
		messages.add(new MessageUtil().createActionMessages("", request,
				"msg_update_success", "item_user"));
		this.addMessages(request, messages);

		return mapping.findForward(SUCCESS);
	}

	/**
	 * <P>
	 * Action del user
	 * </P>
	 * 
	 * @author KienLT
	 * @author GiangVT
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward del(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		UserEditViewHelper view = (UserEditViewHelper) request.getSession()
				.getAttribute(UserEditViewHelper.SESSION_KEY);

		UserService userService = new UserService(getConnection());
		int id = view.getId();
		userService.removeUser((long) id);
		getConnection().commit();

		// Hien thi thong bao Xoa thanh cong
		ActionMessages messages = new ActionMessages();
		messages.add(new MessageUtil().createActionMessages("", request,
				"msg_delete_success", "item_user"));
		this.addMessages(request, messages);

		return mapping.findForward(SUCCESS);
	}
}