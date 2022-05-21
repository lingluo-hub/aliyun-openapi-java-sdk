/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListUsersResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListUsersResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setTotalCount(_ctx.longValue("ListUsersResponse.TotalCount"));
		listUsersResponse.setErrorCode(_ctx.stringValue("ListUsersResponse.ErrorCode"));
		listUsersResponse.setErrorMessage(_ctx.stringValue("ListUsersResponse.ErrorMessage"));
		listUsersResponse.setSuccess(_ctx.booleanValue("ListUsersResponse.Success"));

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.UserList.Length"); i++) {
			User user = new User();
			user.setState(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].State"));
			user.setCurResultCount(_ctx.longValue("ListUsersResponse.UserList["+ i +"].CurResultCount"));
			user.setUserId(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].UserId"));
			user.setLastLoginTime(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].LastLoginTime"));
			user.setMaxResultCount(_ctx.longValue("ListUsersResponse.UserList["+ i +"].MaxResultCount"));
			user.setParentUid(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].ParentUid"));
			user.setNickName(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].NickName"));
			user.setMaxExecuteCount(_ctx.longValue("ListUsersResponse.UserList["+ i +"].MaxExecuteCount"));
			user.setCurExecuteCount(_ctx.longValue("ListUsersResponse.UserList["+ i +"].CurExecuteCount"));
			user.setMobile(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].Mobile"));
			user.setUid(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].Uid"));
			user.setEmail(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].Email"));
			user.setDingRobot(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].DingRobot"));
			user.setWebhook(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].Webhook"));
			user.setSignatureMethod(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].SignatureMethod"));
			user.setNotificationMode(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].NotificationMode"));

			List<Integer> roleIdList = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.UserList["+ i +"].RoleIdList.Length"); j++) {
				roleIdList.add(_ctx.integerValue("ListUsersResponse.UserList["+ i +"].RoleIdList["+ j +"]"));
			}
			user.setRoleIdList(roleIdList);

			List<String> roleNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.UserList["+ i +"].RoleNameList.Length"); j++) {
				roleNameList.add(_ctx.stringValue("ListUsersResponse.UserList["+ i +"].RoleNameList["+ j +"]"));
			}
			user.setRoleNameList(roleNameList);

			userList.add(user);
		}
		listUsersResponse.setUserList(userList);
	 
	 	return listUsersResponse;
	}
}