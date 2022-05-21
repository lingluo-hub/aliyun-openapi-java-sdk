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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.DeleteDevopsOrganizationMembersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDevopsOrganizationMembersResponseUnmarshaller {

	public static DeleteDevopsOrganizationMembersResponse unmarshall(DeleteDevopsOrganizationMembersResponse deleteDevopsOrganizationMembersResponse, UnmarshallerContext _ctx) {
		
		deleteDevopsOrganizationMembersResponse.setRequestId(_ctx.stringValue("DeleteDevopsOrganizationMembersResponse.RequestId"));
		deleteDevopsOrganizationMembersResponse.setErrorMessage(_ctx.stringValue("DeleteDevopsOrganizationMembersResponse.ErrorMessage"));
		deleteDevopsOrganizationMembersResponse.setObject(_ctx.booleanValue("DeleteDevopsOrganizationMembersResponse.Object"));
		deleteDevopsOrganizationMembersResponse.setSuccess(_ctx.booleanValue("DeleteDevopsOrganizationMembersResponse.Success"));
		deleteDevopsOrganizationMembersResponse.setErrorCode(_ctx.stringValue("DeleteDevopsOrganizationMembersResponse.ErrorCode"));
	 
	 	return deleteDevopsOrganizationMembersResponse;
	}
}