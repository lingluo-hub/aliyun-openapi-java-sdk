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

import com.aliyuncs.dms_enterprise.model.v20181101.ListUserPermissionsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListUserPermissionsResponse.UserPermission;
import com.aliyuncs.dms_enterprise.model.v20181101.ListUserPermissionsResponse.UserPermission.PermDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserPermissionsResponseUnmarshaller {

	public static ListUserPermissionsResponse unmarshall(ListUserPermissionsResponse listUserPermissionsResponse, UnmarshallerContext _ctx) {
		
		listUserPermissionsResponse.setRequestId(_ctx.stringValue("ListUserPermissionsResponse.RequestId"));
		listUserPermissionsResponse.setTotalCount(_ctx.longValue("ListUserPermissionsResponse.TotalCount"));
		listUserPermissionsResponse.setErrorCode(_ctx.stringValue("ListUserPermissionsResponse.ErrorCode"));
		listUserPermissionsResponse.setErrorMessage(_ctx.stringValue("ListUserPermissionsResponse.ErrorMessage"));
		listUserPermissionsResponse.setSuccess(_ctx.booleanValue("ListUserPermissionsResponse.Success"));

		List<UserPermission> userPermissions = new ArrayList<UserPermission>();
		for (int i = 0; i < _ctx.lengthValue("ListUserPermissionsResponse.UserPermissions.Length"); i++) {
			UserPermission userPermission = new UserPermission();
			userPermission.setDbId(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].DbId"));
			userPermission.setTableName(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].TableName"));
			userPermission.setUserId(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].UserId"));
			userPermission.setSchemaName(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].SchemaName"));
			userPermission.setLogic(_ctx.booleanValue("ListUserPermissionsResponse.UserPermissions["+ i +"].Logic"));
			userPermission.setUserNickName(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].UserNickName"));
			userPermission.setInstanceId(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].InstanceId"));
			userPermission.setEnvType(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].EnvType"));
			userPermission.setColumnName(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].ColumnName"));
			userPermission.setDbType(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].DbType"));
			userPermission.setDsType(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].DsType"));
			userPermission.setTableId(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].TableId"));
			userPermission.setSearchName(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].SearchName"));
			userPermission.setAlias(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].Alias"));
			userPermission.setHost(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].Host"));
			userPermission.setPort(_ctx.longValue("ListUserPermissionsResponse.UserPermissions["+ i +"].Port"));

			List<PermDetail> permDetails = new ArrayList<PermDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListUserPermissionsResponse.UserPermissions["+ i +"].PermDetails.Length"); j++) {
				PermDetail permDetail = new PermDetail();
				permDetail.setOriginFrom(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].OriginFrom"));
				permDetail.setPermType(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].PermType"));
				permDetail.setExpireDate(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].ExpireDate"));
				permDetail.setCreateDate(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].CreateDate"));
				permDetail.setUserAccessId(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].UserAccessId"));
				permDetail.setExtraData(_ctx.stringValue("ListUserPermissionsResponse.UserPermissions["+ i +"].PermDetails["+ j +"].ExtraData"));

				permDetails.add(permDetail);
			}
			userPermission.setPermDetails(permDetails);

			userPermissions.add(userPermission);
		}
		listUserPermissionsResponse.setUserPermissions(userPermissions);
	 
	 	return listUserPermissionsResponse;
	}
}