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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.GetScriptFileNamesResponse;
import com.aliyuncs.opensearch.model.v20171225.GetScriptFileNamesResponse.FileInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScriptFileNamesResponseUnmarshaller {

	public static GetScriptFileNamesResponse unmarshall(GetScriptFileNamesResponse getScriptFileNamesResponse, UnmarshallerContext _ctx) {
		
		getScriptFileNamesResponse.setRequestId(_ctx.stringValue("GetScriptFileNamesResponse.requestId"));

		List<FileInfos> result = new ArrayList<FileInfos>();
		for (int i = 0; i < _ctx.lengthValue("GetScriptFileNamesResponse.result.Length"); i++) {
			FileInfos fileInfos = new FileInfos();
			fileInfos.setCreateTime(_ctx.stringValue("GetScriptFileNamesResponse.result["+ i +"].createTime"));
			fileInfos.setFileName(_ctx.stringValue("GetScriptFileNamesResponse.result["+ i +"].fileName"));
			fileInfos.setModifyTime(_ctx.stringValue("GetScriptFileNamesResponse.result["+ i +"].modifyTime"));
			fileInfos.setPathName(_ctx.stringValue("GetScriptFileNamesResponse.result["+ i +"].pathName"));

			result.add(fileInfos);
		}
		getScriptFileNamesResponse.setResult(result);
	 
	 	return getScriptFileNamesResponse;
	}
}