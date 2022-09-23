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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.CreateBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBackupPlanResponseUnmarshaller {

	public static CreateBackupPlanResponse unmarshall(CreateBackupPlanResponse createBackupPlanResponse, UnmarshallerContext _ctx) {
		
		createBackupPlanResponse.setRequestId(_ctx.stringValue("CreateBackupPlanResponse.RequestId"));
		createBackupPlanResponse.setHttpStatusCode(_ctx.integerValue("CreateBackupPlanResponse.HttpStatusCode"));
		createBackupPlanResponse.setErrCode(_ctx.stringValue("CreateBackupPlanResponse.ErrCode"));
		createBackupPlanResponse.setSuccess(_ctx.booleanValue("CreateBackupPlanResponse.Success"));
		createBackupPlanResponse.setErrMessage(_ctx.stringValue("CreateBackupPlanResponse.ErrMessage"));
		createBackupPlanResponse.setBackupPlanId(_ctx.stringValue("CreateBackupPlanResponse.BackupPlanId"));
		createBackupPlanResponse.setOrderId(_ctx.stringValue("CreateBackupPlanResponse.OrderId"));
	 
	 	return createBackupPlanResponse;
	}
}