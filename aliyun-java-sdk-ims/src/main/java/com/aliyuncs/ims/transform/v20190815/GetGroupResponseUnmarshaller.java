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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.GetGroupResponse;
import com.aliyuncs.ims.model.v20190815.GetGroupResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupResponseUnmarshaller {

	public static GetGroupResponse unmarshall(GetGroupResponse getGroupResponse, UnmarshallerContext _ctx) {
		
		getGroupResponse.setRequestId(_ctx.stringValue("GetGroupResponse.RequestId"));

		Group group = new Group();
		group.setDisplayName(_ctx.stringValue("GetGroupResponse.Group.DisplayName"));
		group.setGroupPrincipalName(_ctx.stringValue("GetGroupResponse.Group.GroupPrincipalName"));
		group.setGroupId(_ctx.stringValue("GetGroupResponse.Group.GroupId"));
		group.setUpdateDate(_ctx.stringValue("GetGroupResponse.Group.UpdateDate"));
		group.setGroupName(_ctx.stringValue("GetGroupResponse.Group.GroupName"));
		group.setComments(_ctx.stringValue("GetGroupResponse.Group.Comments"));
		group.setCreateDate(_ctx.stringValue("GetGroupResponse.Group.CreateDate"));
		getGroupResponse.setGroup(group);
	 
	 	return getGroupResponse;
	}
}