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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.UpdateScreenShotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateScreenShotResponseUnmarshaller {

	public static UpdateScreenShotResponse unmarshall(UpdateScreenShotResponse updateScreenShotResponse, UnmarshallerContext _ctx) {
		
		updateScreenShotResponse.setRequestId(_ctx.stringValue("UpdateScreenShotResponse.RequestId"));
		updateScreenShotResponse.setErrorMessage(_ctx.stringValue("UpdateScreenShotResponse.ErrorMessage"));
		updateScreenShotResponse.setSuccess(_ctx.booleanValue("UpdateScreenShotResponse.Success"));
		updateScreenShotResponse.setErrorCode(_ctx.stringValue("UpdateScreenShotResponse.ErrorCode"));
	 
	 	return updateScreenShotResponse;
	}
}