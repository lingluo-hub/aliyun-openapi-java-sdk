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

package com.aliyuncs.codeup.transform.v20200414;

import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryGroupResponse;
import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryGroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryGroupResponseUnmarshaller {

	public static DeleteRepositoryGroupResponse unmarshall(DeleteRepositoryGroupResponse deleteRepositoryGroupResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryGroupResponse.setRequestId(_ctx.stringValue("DeleteRepositoryGroupResponse.RequestId"));
		deleteRepositoryGroupResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryGroupResponse.ErrorCode"));
		deleteRepositoryGroupResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryGroupResponse.Success"));
		deleteRepositoryGroupResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryGroupResponse.ErrorMessage"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("DeleteRepositoryGroupResponse.Result.Result"));
		deleteRepositoryGroupResponse.setResult(result);
	 
	 	return deleteRepositoryGroupResponse;
	}
}