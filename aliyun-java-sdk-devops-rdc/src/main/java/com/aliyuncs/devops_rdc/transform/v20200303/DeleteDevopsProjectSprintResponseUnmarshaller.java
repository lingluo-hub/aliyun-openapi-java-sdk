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

import com.aliyuncs.devops_rdc.model.v20200303.DeleteDevopsProjectSprintResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDevopsProjectSprintResponseUnmarshaller {

	public static DeleteDevopsProjectSprintResponse unmarshall(DeleteDevopsProjectSprintResponse deleteDevopsProjectSprintResponse, UnmarshallerContext _ctx) {
		
		deleteDevopsProjectSprintResponse.setRequestId(_ctx.stringValue("DeleteDevopsProjectSprintResponse.RequestId"));
		deleteDevopsProjectSprintResponse.setErrorMsg(_ctx.stringValue("DeleteDevopsProjectSprintResponse.ErrorMsg"));
		deleteDevopsProjectSprintResponse.setObject(_ctx.booleanValue("DeleteDevopsProjectSprintResponse.Object"));
		deleteDevopsProjectSprintResponse.setSuccessful(_ctx.booleanValue("DeleteDevopsProjectSprintResponse.Successful"));
		deleteDevopsProjectSprintResponse.setErrorCode(_ctx.stringValue("DeleteDevopsProjectSprintResponse.ErrorCode"));
	 
	 	return deleteDevopsProjectSprintResponse;
	}
}