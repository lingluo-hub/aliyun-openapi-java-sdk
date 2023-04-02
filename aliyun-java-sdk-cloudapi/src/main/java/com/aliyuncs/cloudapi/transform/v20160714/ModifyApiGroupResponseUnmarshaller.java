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

package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.ModifyApiGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyApiGroupResponseUnmarshaller {

	public static ModifyApiGroupResponse unmarshall(ModifyApiGroupResponse modifyApiGroupResponse, UnmarshallerContext _ctx) {
		
		modifyApiGroupResponse.setRequestId(_ctx.stringValue("ModifyApiGroupResponse.RequestId"));
		modifyApiGroupResponse.setBasePath(_ctx.stringValue("ModifyApiGroupResponse.BasePath"));
		modifyApiGroupResponse.setGroupId(_ctx.stringValue("ModifyApiGroupResponse.GroupId"));
		modifyApiGroupResponse.setGroupName(_ctx.stringValue("ModifyApiGroupResponse.GroupName"));
		modifyApiGroupResponse.setDescription(_ctx.stringValue("ModifyApiGroupResponse.Description"));
		modifyApiGroupResponse.setSubDomain(_ctx.stringValue("ModifyApiGroupResponse.SubDomain"));
	 
	 	return modifyApiGroupResponse;
	}
}