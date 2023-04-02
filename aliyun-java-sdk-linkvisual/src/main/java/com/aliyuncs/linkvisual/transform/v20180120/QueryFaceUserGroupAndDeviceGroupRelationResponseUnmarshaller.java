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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserGroupAndDeviceGroupRelationResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserGroupAndDeviceGroupRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceUserGroupAndDeviceGroupRelationResponseUnmarshaller {

	public static QueryFaceUserGroupAndDeviceGroupRelationResponse unmarshall(QueryFaceUserGroupAndDeviceGroupRelationResponse queryFaceUserGroupAndDeviceGroupRelationResponse, UnmarshallerContext _ctx) {
		
		queryFaceUserGroupAndDeviceGroupRelationResponse.setRequestId(_ctx.stringValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.RequestId"));
		queryFaceUserGroupAndDeviceGroupRelationResponse.setCode(_ctx.stringValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.Code"));
		queryFaceUserGroupAndDeviceGroupRelationResponse.setErrorMessage(_ctx.stringValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.ErrorMessage"));
		queryFaceUserGroupAndDeviceGroupRelationResponse.setSuccess(_ctx.booleanValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.Success"));

		Data data = new Data();
		data.setDeviceGroupId(_ctx.stringValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.Data.DeviceGroupId"));
		data.setControlId(_ctx.stringValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.Data.ControlId"));
		data.setModifiedTime(_ctx.stringValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.Data.ModifiedTime"));
		data.setControlType(_ctx.stringValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.Data.ControlType"));
		data.setUserGroupId(_ctx.stringValue("QueryFaceUserGroupAndDeviceGroupRelationResponse.Data.UserGroupId"));
		queryFaceUserGroupAndDeviceGroupRelationResponse.setData(data);
	 
	 	return queryFaceUserGroupAndDeviceGroupRelationResponse;
	}
}