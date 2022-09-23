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

import com.aliyuncs.dbs.model.v20190306.StartBackupPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartBackupPlanResponseUnmarshaller {

	public static StartBackupPlanResponse unmarshall(StartBackupPlanResponse startBackupPlanResponse, UnmarshallerContext _ctx) {
		
		startBackupPlanResponse.setRequestId(_ctx.stringValue("StartBackupPlanResponse.RequestId"));
		startBackupPlanResponse.setHttpStatusCode(_ctx.integerValue("StartBackupPlanResponse.HttpStatusCode"));
		startBackupPlanResponse.setErrCode(_ctx.stringValue("StartBackupPlanResponse.ErrCode"));
		startBackupPlanResponse.setSuccess(_ctx.booleanValue("StartBackupPlanResponse.Success"));
		startBackupPlanResponse.setErrMessage(_ctx.stringValue("StartBackupPlanResponse.ErrMessage"));
		startBackupPlanResponse.setCreatedFullBackupsetId(_ctx.stringValue("StartBackupPlanResponse.CreatedFullBackupsetId"));
		startBackupPlanResponse.setBackupPlanId(_ctx.stringValue("StartBackupPlanResponse.BackupPlanId"));
	 
	 	return startBackupPlanResponse;
	}
}