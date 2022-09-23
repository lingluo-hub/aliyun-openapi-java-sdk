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

package com.aliyuncs.imm.transform.v20200930;

import com.aliyuncs.imm.model.v20200930.GetOSSBucketAttachmentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOSSBucketAttachmentResponseUnmarshaller {

	public static GetOSSBucketAttachmentResponse unmarshall(GetOSSBucketAttachmentResponse getOSSBucketAttachmentResponse, UnmarshallerContext _ctx) {
		
		getOSSBucketAttachmentResponse.setRequestId(_ctx.stringValue("GetOSSBucketAttachmentResponse.RequestId"));
		getOSSBucketAttachmentResponse.setProjectName(_ctx.stringValue("GetOSSBucketAttachmentResponse.ProjectName"));
	 
	 	return getOSSBucketAttachmentResponse;
	}
}